package com.lacemile.model;

/**
 * Created by yuume on 17/1/6.
 */
public class Message {
    String name;
    String text;

    public Message(String name, String text){
        this.name = name;
        this.text = text;
    }

    public String getName(){
        return this.name;
    }

    public String getText(){
        return this.text;
    }
}
