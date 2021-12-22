package FactoryDesign.MessageCreator;

import FactoryDesign.Message.Message;
import FactoryDesign.Message.TextMessage;

public class TextMessageCreator extends MessageCreator{

    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
