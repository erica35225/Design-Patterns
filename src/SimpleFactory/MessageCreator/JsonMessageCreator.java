package SimpleFactory.MessageCreator;

import SimpleFactory.Message.JsonMessage;
import SimpleFactory.Message.Message;

public class JsonMessageCreator extends MessageCreator{
    @Override
    public Message createMessage() {
        return new JsonMessage();
    }
}
