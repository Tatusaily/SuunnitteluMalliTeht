package AbstractFactory.src;

public class CheckboxA extends Checkbox {
    @Override
    public void display(String text) {
        // Draw ascii checkbox
        String top = "┌" + "─".repeat(text.length()) + "┐";
        String middle = "│" + text + "│";
        String bottom = "└" + "─".repeat(text.length()) + "┘";
        System.out.println(top + "\n" + middle + "\n" + bottom);
    }

}
