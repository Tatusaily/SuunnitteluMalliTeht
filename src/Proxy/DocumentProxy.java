package Proxy;

import java.util.Date;

public class DocumentProxy implements IDocument {
    private final Document document;
    private AccessControlService accessControlService;

    public DocumentProxy(Document doc) {
        this.document = doc;
        this.accessControlService = AccessControlService.getInstance();
    }

    @Override
    public String getContent(User user) throws AccessDeniedException {
        if (accessControlService.isAllowed(document.getId(), user.getUsername())) {
            return document.getContent(user);
        } else {
            String message = "User " + user.getUsername() + " denied access to document " + document.getId();
            throw new AccessDeniedException(message);
        }
    }


    @Override
    public int getId() {
        return document.getId();
    }
}