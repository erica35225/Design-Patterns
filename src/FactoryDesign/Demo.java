package FactoryDesign;

import FactoryDesign.MessageCreator.JsonMessageCreator;
import FactoryDesign.MessageCreator.MessageCreator;
import FactoryDesign.MessageCreator.TextMessageCreator;

public class Demo {
    public static void main(String[] args) {
        printMessage(new JsonMessageCreator());
        printMessage(new TextMessageCreator());
    }

    private static void printMessage(MessageCreator message) {
       System.out.println(message.getMessage(message).getContent());
    }

}
