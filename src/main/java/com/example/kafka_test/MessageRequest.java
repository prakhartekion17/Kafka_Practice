package com.example.kafka_test;

import org.springframework.stereotype.Component;

public class MessageRequest {
    String msg;

    public MessageRequest(String msg) {
        this.msg = msg;
    }

    public MessageRequest() {
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
