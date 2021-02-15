package L07_gridLayout;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        //Layout Manager: 預設的內容排版管理方式 (有三種常用的)

        //Grid Layout: 把內容物分成很多個小區域(格子)，格子會填滿母空間，且每個格子大小一樣

        JFrame frame=new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);

        /*
        * GridLayout的前兩個參數代表希望的列數(橫的)和行數(直的)
        *
        * 後面兩個參數是水平間距(margin)和垂直間距(margin)
        *
        * 如果內容物數量和 行*列 不一致時 系統會以列(rows,橫的)的數目為主
        *
        * */
        frame.setLayout(new GridLayout(3,3,10,10)); //設定為Grid Layout

        frame.add(new Button("1"));
        frame.add(new Button("2"));
        frame.add(new Button("3"));
        frame.add(new Button("4"));
        frame.add(new Button("5"));
        frame.add(new Button("6"));
        frame.add(new Button("7"));
        frame.add(new Button("8"));
        frame.add(new Button("9"));

        frame.setVisible(true);
    }
}
