package SimpleFactory.MessageCreator;

import SimpleFactory.Message.Message;
import SimpleFactory.Message.TextMessage;

public class TextMessageCreator extends MessageCreator{

    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
