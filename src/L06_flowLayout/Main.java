package L06_flowLayout;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        //Layout Manager: 預設的內容排版管理方式 (有三種常用的)
        //Flow Layout: 內容物會被排成一排，如果版面不夠會自動換行

        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(500,500);

        //設定為FlowLayout
        /*
        * FlowLayout參數有:
        *       LEADING,CENTER(預設),TRAILING 代表視窗拉伸後內容物的位置
        *
        * 後面的數字代表水平間距和垂直間距
        * */
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,5,20));

        JPanel panel=new JPanel();
        panel.setPreferredSize(new Dimension(150,250));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout()); //Panel預設就是FLOW LAYOUT
        
        panel.add(new JButton("1")); //button的CONSTRUCTOR參數是按鈕文字
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));

        frame.add(panel);
        frame.setVisible(true); //這行盡量擺在最後
    }
}
