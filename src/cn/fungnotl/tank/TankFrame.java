package cn.fungnotl.tank;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @project tank
 * @auther Fung
 * @date 2019-11-25-13-44
 * @description:
 */
public class TankFrame extends Frame {

    public TankFrame(){
        setSize(800, 600);
        setResizable(false);
        setTitle("Tank war");
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            /**
             * Invoked when a window is in the process of being closed.
             * The close operation can be overridden at this point.
             *
             * @param e
             */
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

        });
    }

    @Override
    public void paint(Graphics g) {
        g.fillRect(200, 200, 50, 50);
    }
}
