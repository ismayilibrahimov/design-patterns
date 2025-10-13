package decorator;

public class PlainText implements Text {
    private final String message;

    public PlainText(String message) {
        this.message = message;
    }

    @Override
    public String render() {
        return message;
    }
}
