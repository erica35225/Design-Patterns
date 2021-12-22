package SimpleFactory.MessageCreator;

import SimpleFactory.Message.Message;

public abstract class MessageCreator {
    public Message getMessage(MessageCreator msg){
        Message message =  msg.createMessage();
        return message;
    }
    public abstract Message createMessage();
}
