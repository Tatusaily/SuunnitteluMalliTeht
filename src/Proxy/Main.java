package Proxy;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Create users and lib
        User Tatu = new User("Tatu");
        User Sauli = new User("SuperSauli");
        Library library = new Library();

        // Add 10 documents to library
        for (int i = 0; i < 10; i++) {
            library.addDocument(documentMaker(i));
        }

        // Try access with both users to all documents in library
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(Tatu.getUsername() + " tries to access document " + i + ": " + library.getDocument(i).getContent(Tatu));
            } catch (AccessDeniedException e) {
                throw new RuntimeException(e);
            }
        }
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(Sauli.getUsername() + " tries to access document " + i + ": " + library.getDocument(i).getContent(Sauli));
            } catch (AccessDeniedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static IDocument documentMaker (int id){
        boolean protect = Math.random() < 0.5;
        return new Document(id, new Date(), "Content " + id, protect);

    }
}