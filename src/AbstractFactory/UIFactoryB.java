public class UIFactoryB extends UIFactory {
    public void createButton(String text) {
        CheckText();
        Button button = new ButtonB();
        button.display(text);
    }

    public void createCheckbox(String text) {
        CheckText();
        Checkbox checkbox = new CheckboxB();
        checkbox.display(text);
    }

    public void createTextField(String text) {
        CheckText();
        TextField textField = new TextFieldB();
        textField.display(text);
    }
}
