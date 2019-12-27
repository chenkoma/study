package com.chen.demo.listener.example2;

/**
 * @author koma 11:03 2019-12-12
 * @desc
 */
public class test {

    public static void main(String[] args) {
        final Button btn = new Button();
        //注册监听器
        btn.registerListener(new ButtonListener() {
            //触发单击事件
            @Override
            public void doclick(Event e) {
                Button btn = e.getSource();
                btn.countclick++;

                System.out.println("弹出对话框按钮被单击了"+btn.countclick+"次");//模拟弹出对话框

            }
            //触发双击事件
            @Override
            public void dodoubleclick(Event e) {
                Button btn = e.getSource();
                btn.countdoubleclick++;
                System.out.println("弹出对话框按钮被双击了"+btn.countdoubleclick+"次");//模拟弹出对话框

            }

        });

        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                for(int i=0;i<10;i++)
                {
                    btn.click();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }

            }

        });

        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                for(int i=0;i<10;i++)
                {
                    btn.doubleclick();
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }

            }

        });

        t1.start();
        t2.start();
    }

}
