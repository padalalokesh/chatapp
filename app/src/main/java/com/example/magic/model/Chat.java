package com.example.magic.model;
public class Chat {

    private String sender;
    private String message;
    private String receiver;
    private boolean isseen;

    public Chat(String sender, String message, String receiver, boolean isseen) {
        this.sender = sender;
        this.message = message;
        this.receiver = receiver;
        this.isseen = isseen;
    }

    public Chat() {
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public boolean isIsseen() {
        return isseen;
    }

    public void setIsseen(boolean isseen) {
        this.isseen = isseen;
    }


}



