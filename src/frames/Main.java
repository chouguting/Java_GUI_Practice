package frames;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String [] args){
        //JFrame:一個可以加物件的GUI視窗
        JFrame frame=new JFrame(); //創建frame

        frame.setVisible(true);//讓frame可以被看見

        frame.setSize(500,500);//設定框架的寬和高

        frame.setTitle("JFrame title");//設定框架左上角的標題

        //當按下右上角離開按鈕的動作(預設是隱藏 執會繼續跑)
        /*
        *   (預設)HIDE_ON_CLOSE: 關掉時隱藏
        *   EXIT_ON_CLOSE:會隨著按鈕關掉
        *   DO_NOTHING_ON_CLOSE:不會隨便被關掉
        * */
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//離開就關掉

        frame.setResizable(false);//防止框架被縮放

        ImageIcon image=new ImageIcon("src/frames/images/smile.png"); //創建一個ICON
        frame.setIconImage(image.getImage()); //改變框架左上角的ICON (LOGO)

        //用getContentPane()方法獲得JFrame的內容面板
        frame.getContentPane().setBackground(new Color(200,34,50,35)); //改變背景的顏色
    }
}
