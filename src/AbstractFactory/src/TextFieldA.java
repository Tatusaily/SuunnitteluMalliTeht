package AbstractFactory.src;

public class TextFieldA extends TextField {
    @Override
    public void display(String text) {
        String top = "╔" + "═".repeat(text.length() + 2) + "╗";
        String middle = "║ " + text + " ║";
        String bottom = "╚" + "═".repeat(text.length() + 2) + "╝";
        System.out.println(top + "\n" + middle + "\n" + bottom);
    }
}
