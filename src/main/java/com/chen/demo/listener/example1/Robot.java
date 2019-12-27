package com.chen.demo.listener.example1;

/**
 * @author koma 17:43 2019-12-11
 * @desc 事件源 机器人
 */
public class Robot {

    private RobotListener listener;

    public void registerListener(RobotListener listener) {  //数据源注册监听器
        this.listener = listener;
    }

    public void working() {
        if (listener != null) {
            Even even = new Even(this);
            this.listener.working(even);
        }
        System.out.println("机器人开始工作......");
    }

    public void dancing() {
        if (listener != null) {
            Even even = new Even(this);
            this.listener.dancing(even);
        }
        System.out.println("机器人开始跳舞......");
    }

}
