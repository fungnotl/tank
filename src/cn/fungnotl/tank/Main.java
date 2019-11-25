package cn.fungnotl.tank;

/**
 * @project tank
 * @auther Fung
 * @date 2019-11-25-11-28
 * @description:
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        TankFrame tf = new TankFrame();

        while (true){
            Thread.sleep(50);
            tf.repaint();
        }

    }

}
