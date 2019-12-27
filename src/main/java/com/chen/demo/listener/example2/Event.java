package com.chen.demo.listener.example2;

/**
 * @author koma 10:55 2019-12-12
 * @desc
 */
public class Event {
    public Button source;
    public Event(Button source) {
        this.source = source;
    }

    public Button getSource() {
        return source;
    }

    public void setSource(Button source) {
        this.source = source;
    }
}
