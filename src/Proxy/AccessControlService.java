package Proxy;

public class AccessControlService {
    private static AccessControlService instance;
    private AccessControlService() {
    }
    public static AccessControlService getInstance() {
        if (instance == null) {
            instance = new AccessControlService();
        }
        return instance;
    }
    public boolean isAllowed (int docID, String username) {
        // Check if the username length is within 5 characters of the document ID
        return Math.abs(username.length() - docID) <= 5;
    }
}
