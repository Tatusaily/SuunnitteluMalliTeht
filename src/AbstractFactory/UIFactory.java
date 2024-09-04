public abstract class UIFactory {
    public String text;
    public void SetText(String text) {
        this.text = text;
    }
    public void CheckText() {
        if (this.text == null) {
            System.out.println("Error: text is null");
        }
    }
    public abstract void createButton(String text);
    public abstract void createCheckbox(String text);
    public abstract void createTextField(String text);
}
