package com.javacourse.se.lesson28;

public class Robot <T> {

    public Robot(Body body, T head) {
        this.body = body;
        this.head = head;
    }

    public T getHead() {
        return head;
    }

    public void setHead(T head) {
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    private Body body;
    private T head;
}
