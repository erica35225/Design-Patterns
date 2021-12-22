package FactoryDesign.Message;

public class JsonMessage extends Message {

    @Override
    public String getContent() {
        return "This is a JSON Message";
    }
}
