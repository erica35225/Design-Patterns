package SimpleFactory.Message;

public class TextMessage extends Message{
    @Override
    public String getContent() {
        return "This is Text Message";
    }
}
