package Proxy;

import java.util.Date;

public class Document implements IDocument {
    private int id;
    private Date created;
    protected String content;
    private boolean isProtected;


    public Document(int id, Date created, String content, boolean isProtected) {
        this.id = id;
        this.created = created;
        this.content = content;
        this.isProtected = isProtected;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getContent(User user) throws AccessDeniedException {
        return content;
    }

    public Date getCreated() {
        return created;
    }

    public boolean isProtected() {
        return isProtected;
    }
}