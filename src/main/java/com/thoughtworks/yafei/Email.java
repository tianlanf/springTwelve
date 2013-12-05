package com.thoughtworks.yafei;

public class Email {
    private String body;

    public void onInitiation() {
        System.out.println("This is printed on bean initiation.");
    }

    public void onDestroy() {
        System.out.println("This is printed on bean destruction.");
    }

    public void setBody(String body) {
        this.body = body;
    }
}
