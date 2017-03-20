package com.novauc;

/**
 * Created by kevinallen on 3/2/17.
 */

public class Message {
    int id;
    int replyId;
    String author;
    String text;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Message(int id, int replyId, String author, String text) {
        this.id = id;
        this.replyId = replyId;
        this.author = author;
        this.text = text;

    }
}