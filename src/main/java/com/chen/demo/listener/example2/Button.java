package com.chen.demo.listener.example2;

/**
 * @author koma 10:44 2019-12-12
 * @desc
 */
public class Button {
    private ButtonListener listener;
    public int countclick = 0;
    public int countdoubleclick = 0;

    public void click() {
        System.out.println("********按钮被单击********");
        if (listener != null) {
            listener.doclick(new Event(this));
        }
    }

    public void doubleclick() {
        System.out.println("********按钮被双击********");
        if (listener != null) {
            listener.dodoubleclick(new Event(this));
        }

    }

    public void registerListener(ButtonListener listener) {
        this.listener = listener;
    }
}
