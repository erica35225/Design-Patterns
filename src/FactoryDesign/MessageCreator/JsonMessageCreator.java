package FactoryDesign.MessageCreator;

import FactoryDesign.Message.JsonMessage;
import FactoryDesign.Message.Message;

public class JsonMessageCreator extends MessageCreator{
    @Override
    public Message createMessage() {
        return new JsonMessage();
    }
}
