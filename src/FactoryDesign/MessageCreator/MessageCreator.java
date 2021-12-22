package FactoryDesign.MessageCreator;

import FactoryDesign.Message.Message;

public abstract class MessageCreator {
    public Message getMessage(MessageCreator msg){
        Message message =  msg.createMessage();
        return message;
    }
    public abstract Message createMessage();
}
