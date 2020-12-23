import java.awt.*;
import javax.swing.*;

// draw smallball
public class Smallball extends JFrame {

//    Image desk = Toolkit.getDefaultToolkit().getImage( filename:"images/desk.jpg" );
//    public void paint(Graphics g){
//        System.out.println("draw once");
//        g.drawImage(desk,x:0,y:0,observer:null);
//    }

    void launchFrame() {
        setBackground(Color.WHITE);    //设置背景颜色
        setLocation(100,100);    //设置窗体显示位置
        setVisible(true);    //显示窗体
    }


    public static void main(String[] args) {
        Smallball g=new Smallball();
        g.launchFrame();
        System.out.println("Game start!!!");

    }
}
