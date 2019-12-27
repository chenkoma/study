package com.chen.demo.listener.example1;

/**
 * @author koma 17:48 2019-12-11
 * @desc 事件对象
 */
public class Even {
    private Robot robot;    // 数据操作对象

    public Even() {
        super();
    }

    public Even(Robot robot) {
        super();
        this.robot = robot;
    }

    public Robot getRobot() {
        return robot;
    }

    public void setRobot(Robot robot) {
        this.robot = robot;
    }
}
