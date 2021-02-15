package borderLayout;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        //Layout Manager: 預設的內容排版管理方式 (有三種常用的)
        //BorderLayout: 把內容物分成五個區域(NORTH,SOUTH,WEST,EAST,CENTER)
        //剩餘空間會在CENTER

        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);

        //設定Layout Manager (frame預設就是Border)
        frame.setLayout(new BorderLayout(10,10));  //後兩個參數是左右margin和上下margin

        JPanel panel1=new JPanel();
        JPanel panel2=new JPanel();
        JPanel panel3=new JPanel();
        JPanel panel4=new JPanel();
        JPanel panel5=new JPanel();

        panel1.setBackground(Color.RED);
        panel2.setBackground(Color.GREEN);
        panel3.setBackground(Color.YELLOW);
        panel4.setBackground(Color.MAGENTA);
        panel5.setBackground(Color.BLUE);

        panel1.setPreferredSize(new Dimension(100,100)); //偏好大小 (如果沒被指定到大小的預設值)
        panel2.setPreferredSize(new Dimension(50,100)); //偏好大小 (如果沒被指定到大小的預設值)
        panel3.setPreferredSize(new Dimension(100,100)); //偏好大小 (如果沒被指定到大小的預設值)
        panel4.setPreferredSize(new Dimension(100,100)); //偏好大小 (如果沒被指定到大小的預設值)
        panel5.setPreferredSize(new Dimension(100,100)); //偏好大小 (如果沒被指定到大小的預設值)
        /*
         * for example: panel1在NORTH，他的寬會隨著視窗改變，但是常就會是預設值(100)
         * */

        frame.add(panel1,BorderLayout.NORTH); //讓panel1固定在NORTH(上)
        frame.add(panel2,BorderLayout.WEST); //讓panel2固定在WEST(左)
        frame.add(panel3,BorderLayout.EAST); //讓panel3固定在EAST(右)
        frame.add(panel4,BorderLayout.SOUTH); //讓panel4固定在SOUTH(下)
        frame.add(panel5,BorderLayout.CENTER); //讓panel5固定在CENTER(中間)



        //---------SUB PANEL (在Panel 5中 再放Panel)--------------

        JPanel panel6=new JPanel();
        JPanel panel7=new JPanel();
        JPanel panel8=new JPanel();
        JPanel panel9=new JPanel();
        JPanel panel10=new JPanel();

        panel6.setBackground(Color.black);
        panel7.setBackground(Color.darkGray);
        panel8.setBackground(Color.gray);
        panel9.setBackground(Color.lightGray);
        panel10.setBackground(Color.white);

        panel5.setLayout(new BorderLayout()); //設定Layout Manager (panel預設是flow)

        panel6.setPreferredSize(new Dimension(100,50)); //偏好大小 (如果沒被指定到大小的預設值)
        panel7.setPreferredSize(new Dimension(50,100)); //偏好大小 (如果沒被指定到大小的預設值)
        panel8.setPreferredSize(new Dimension(50,100)); //偏好大小 (如果沒被指定到大小的預設值)
        panel9.setPreferredSize(new Dimension(100,50)); //偏好大小 (如果沒被指定到大小的預設值)
        panel10.setPreferredSize(new Dimension(100,100)); //偏好大小 (如果沒被指定到大小的預設值)

        panel5.add(panel6,BorderLayout.NORTH); //讓panel6固定在panel5的NORTH(上)
        panel5.add(panel7,BorderLayout.WEST); //讓panel7固定在panel5的WEST(左)
        panel5.add(panel8,BorderLayout.EAST); //讓panel8固定在panel5的EAST(右)
        panel5.add(panel9,BorderLayout.SOUTH); //讓panel9固定在panel5的SOUTH(下)
        panel5.add(panel10,BorderLayout.CENTER); //讓panel10固定在panel5的CENTER(中間)


    }
}
