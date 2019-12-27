package com.stu.designpattern;

import java.awt.*;
import javax.swing.*;

/**
 * @author koma 17:20 2019-07-12
 * @desc
 */
public class SingletonEager {
    JFrame jf = new JFrame("饿汉单例模式测试");
    Container contentPane = jf.getContentPane();
    Bajie obj1 = Bajie.getInstance();
//    contentPane.add(obj1);


}

class Bajie extends JPanel {
    private static Bajie instance = new Bajie();

    private Bajie() {
        JLabel l1 = new JLabel(new ImageIcon("src/Bajie.jpg"));
        this.add(l1);
    }

    public static Bajie getInstance() {
        return instance;
    }

}
