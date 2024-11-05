package Proxy;

public interface IDocument {

    int getId();

    String getContent(User user) throws AccessDeniedException;

}
