package L08_layeredPane;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){

        //JLayerPane:一個有深度訊息(Z軸)的容器(類似PANEL)
        JLayeredPane layeredPane=new JLayeredPane();

        layeredPane.setBounds(0,0,500,500);  //設定位置及區域

        //創建三個LABEL
        JLabel label1=new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.red);
        label1.setBounds(50,50,200,200);

        JLabel label2=new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.green);
        label2.setBounds(100,100,200,200);

        JLabel label3=new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.blue);
        label3.setBounds(150,150,200,200);


        /*
        * 預設的Layer (順序由底層到上層):
        *   DEFAULT,PALETTE,MODAL,POPUP,DRAG
        *
        * 也可以用數字: Integer.valueOf(數字)
        * 數字越大越上層
        * */
        layeredPane.add(label1,JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(label2,JLayeredPane.MODAL_LAYER);
        layeredPane.add(label3,JLayeredPane.PALETTE_LAYER);


        JFrame frame=new JFrame("JLayeredPane");

        frame.add(layeredPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true); //setLayout要在setVisible之前
        frame.setSize(500,500);

    }
}
