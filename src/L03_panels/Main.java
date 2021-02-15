package L03_panels;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        //JPanel: 一個可以包含其他GUI元件的容器原件
        JPanel redPanel=new JPanel();
        redPanel.setBackground(Color.red); //設定背景
        redPanel.setBounds(0,0,250,250); //設定位置及大小

        JPanel bluePanel=new JPanel();
        bluePanel.setBackground(Color.blue); //設定背景
        bluePanel.setBounds(250,0,250,250); //設定位置及大小

        JPanel greenPanel=new JPanel();
        greenPanel.setBackground(Color.green); //設定背景
        greenPanel.setBounds(0,250,500,250); //設定位置及大小

        JLabel label=new JLabel();
        label.setText("Hi");
        ImageIcon image=new ImageIcon("src/L01_frames/images/smile.png"); //創建一個ICON
        label.setIcon(image);


        //調整Label中的排版
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.LEFT);
        // (Panel預設是flowLayout, Frame預設是borderLayout)
        redPanel.setLayout(new BorderLayout()); //改變Panel中的排版方式
        redPanel.add(label); //把label加到Panel中


        JLabel label2=new JLabel();
        label2.setText("Hello");
        label2.setIcon(image);

        greenPanel.setLayout(null); //不要用預設的排版方式
        /*
        * 這裡的X,Y座標是相對於母容器(greenPanel)
        * */
        label2.setBounds(100,0,250,200); //自行設定label2的位置及邊界
        greenPanel.add(label2);

        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setSize(800,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }
}
