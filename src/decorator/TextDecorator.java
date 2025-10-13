package decorator;

public abstract class TextDecorator implements Text {
    private final Text text;

    public TextDecorator(Text text) {
        this.text = text;
    }

    @Override
    public String render() {
        return text.render();
    }
}
