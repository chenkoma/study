package com.JavaCoreProgramming;

import com.chen.demo.listener.example1.Even;

import javax.swing.*;
import java.io.File;

/**
 * @Date: 5:20 下午 2020/11/23
 * @Desc:
 */
public class ImageViewer {

}

class ImageViewerFrame extends JFrame {
    private JLabel label;
    private JFileChooser chooser;
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 400;

    public ImageViewerFrame() {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        label = new JLabel();
        add(label);

        chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu menu = new JMenu();
        menu.add(menuBar);

        JMenuItem openItem = new JMenuItem("open");
        menu.add(openItem);
//        openItem.addMenuDragMouseListener(Event -> {
//            int result = chooser.showOpenDialog(null);
//
//            if (result == JFileChooser.APPROVE_OPTION) {
//                String name = chooser.getSelectedFile().getPath();
//                label.setIcon(new ImageIcon(name));
//            }
//        });
//
//        JMenuItem exitItem = new JMenuItem("exit");
//        menu.add(exitItem);
//        exitItem.addActionListener(Event -> System.exit(0));

    }
}
