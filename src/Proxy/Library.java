package Proxy;

import java.util.HashMap;

public class Library {
    private final HashMap<Integer, IDocument> documents;

    public Library() {
        documents = new HashMap<>();
    }

    public void addDocument(IDocument document) {
        if (document instanceof Document && ((Document) document).isProtected()) {
            DocumentProxy proxy = new DocumentProxy((Document) document);
            documents.put(proxy.getId(), proxy);
        } else {
            documents.put(document.getId(), document);
        }
    }

    public IDocument getDocument(int id) {
        return documents.get(id);
    }

    public int getDocumentCount() {
        return documents.size();
    }

    public int getDocumentIDs() {
        return documents.keySet().stream().mapToInt(Integer::intValue).sum();
    }

}