package L02_labels;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        //JLabel: 一個可以顯示文字、圖像的GUI區域
        JLabel label=new JLabel(); //創建一個Label
        label.setText("Hi, how are you?"); //設定Label的文字

        //創建即設定Frame
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //創建Icon影像
        ImageIcon imageIcon=new ImageIcon("src/L02_labels/images/smile.png");

        frame.add(label);//把Label加進Frame中

        label.setIcon(imageIcon); //設定Label的icon (預設會在文字左邊)

        Border border=BorderFactory.createLineBorder(Color.green,3);//創建一個邊框
        label.setBorder(border);//設定邊框到Label上

        /*
        * 可用 LEFT,CENTER,RIGHT
        * */
        label.setHorizontalTextPosition(JLabel.CENTER); //設定Label中文字與圖片的相對水平位置

        /*
         * 可用 TOP,CENTER,BOTTOM
         * */
        label.setVerticalTextPosition(JLabel.TOP); //設定Label中文字與圖片的相對垂直位置

        label.setForeground(Color.green); //設定前景(文字)顏色

        label.setFont(new Font("MV Boli",Font.BOLD,20)); //設定文字的字形,粗細,大小

        label.setIconTextGap(100); //設定文字與圖片的間距 (正負號都行)

        label.setBackground(new Color(25,50,100));//設定背景顏色
        label.setOpaque(true); //(設定不透明度) 要用這個才會顯示背景顏色

        label.setVerticalAlignment(JLabel.CENTER); //設定Label內文字和圖像的垂直位置
        label.setHorizontalAlignment(JLabel.CENTER); //設定Label內文字和圖像的水平位置


        frame.setLayout(null); //設定Frame中的Layout(排版),null是不要用他預設的排版的意思
        label.setBounds(20,0,250,450); //設定Label的位置及長寬 (如果沒用預設排版就要自己設定)

        //frame.pack(); //(如果不用setLayout) 用PACK的話， frame的大小就會縮成和內容物(Label)一樣大
        //**pack要在最後面執行
    }
}
