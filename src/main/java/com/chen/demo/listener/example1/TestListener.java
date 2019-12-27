package com.chen.demo.listener.example1;

/**
 * @author koma 18:02 2019-12-11
 * @desc
 */
public class TestListener {

    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.registerListener(new MyRobotListener());
        robot.working();
        robot.dancing();
    }
}
