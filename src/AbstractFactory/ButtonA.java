public class ButtonA extends Button {
    @Override
    public void display(String text) {
        // Draw ascii button
        String border = "-".repeat(text.length() + 4);
        text = "| " + text + " |";
        System.out.println(border + "\n" + text + "\n" + border);
    }
}
