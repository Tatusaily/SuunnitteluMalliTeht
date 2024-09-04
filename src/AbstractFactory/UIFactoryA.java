public class UIFactoryA  extends UIFactory {
    public void createButton(String text) {
        CheckText();
        Button button = new ButtonA();
        button.display(text);
    }

    public void createCheckbox(String text) {
        CheckText();
        Checkbox checkbox = new CheckboxA();
        checkbox.display(text);
    }

    public void createTextField(String text) {
        CheckText();
        TextField textField = new TextFieldA();
        textField.display(text);
    }
}
