package cn.fungnotl.tank;

import java.awt.*;

/**
 * @project tank
 * @auther Fung
 * @date 2019-11-25-19-57
 * @description:
 */
public class Bullet {

    private static final int SPEED = 1;
    private static int WIDTH = 20, HEIGHT = 20;

    private int x, y;
    private Dir dir;

    public Bullet(int x, int y, Dir dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public void paint(Graphics g){
        Color c = g.getColor();
        g.setColor(Color.red);
        g.fillOval(x, y, WIDTH, HEIGHT);
        g.setColor(c);

        move();
    }

    private void move() {

        switch(dir){
            case LEFT:
                x -= SPEED;
                break;
            case UP:
                y -= SPEED;
                break;
            case RIGHT:
                x += SPEED;
                break;
            case DOWN:
                y += SPEED;
                break;

        }
    }

}
