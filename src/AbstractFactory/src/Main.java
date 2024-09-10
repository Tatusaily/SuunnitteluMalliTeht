package AbstractFactory.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UIFactory factory = null;
        String text;
        Scanner scanner = new Scanner(System.in);

        // Take user input for elements
        System.out.println("Please enter text for the elements:");
        text = scanner.nextLine();

        // Main loop:
        // Query user for element type and create element
        // Also ask if user wants to switch text or type of factory.
        while (true) {
            System.out.println("""
                    If you would like to switch the type of factory, please input 'factory'.
                    If you would like to switch the text, please input 'text'.
                    If you would like to draw an element:
                    Input 'a' for button, 'b' for text field, 'c' for checkbox:
                    """);

            String input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println("Invalid input. Exiting...");
                break;
            }
            char choice = Character.toLowerCase(input.charAt(0));
            if (choice == 'f') {
                // Switch factory:
                factory = switchFactory(factory, text);
            } else if (choice == 't') {
                // Switch text:
                System.out.println("Please enter text for the elements:");
                text = scanner.nextLine();
            } else {
                // Create element:
                if (factory == null) {
                    System.out.println("No factory selected.");
                    break;
                }
                switch (choice) {
                    case 'a' -> factory.createButton(text);
                    case 'b' -> factory.createTextField(text);
                    case 'c' -> factory.createCheckbox(text);
                    default -> System.out.println("Invalid input. Exiting...");
                }

            }
        }
    }

    // Switch factory
    private static UIFactory switchFactory(UIFactory factory, String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Which style of element would you want to draw?
                Input 'a' for stylish, 'b' for simple:
                """);
        char select = Character.toLowerCase(
                scanner.nextLine().charAt(0));

        // Create factory based on user input
        if (select == 'a') {
            // Stylish style
            factory = new UIFactoryA();
        } else if (select == 'b') {
            // Simple style
            factory = new UIFactoryB();
        } else {
            if (factory == null) {
                System.out.println("No factory selected. Exiting...");
                System.exit(0);
            } else {
                System.out.println("Invalid input. Factory remains unchanged...");
            }
        }
        factory.SetText(text);
        return factory;
    }
}
