package buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//ActionListener可實作按鈕動作
public class MyFrame extends JFrame implements ActionListener {

    //JButton: 一個可編成的GUI按鈕
    JButton button;

    JLabel label;

    MyFrame(){
        //constructor中設定JFrame屬性
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);
        this.setSize(500,500);

        button=new JButton();
        button.setBounds(100,100,250,100); //設定按鈕位置及大小
        button.addActionListener(this); //因為我們implement actionListener,所以自已也能是actionListener
        button.setText("I'm a Button");
        button.setFocusable(false);//讓按下時不會出現虛線

        ImageIcon icon=new ImageIcon("src/buttons/scared.png"); //加上按鈕圖示
        button.setIcon(icon);

        button.setHorizontalTextPosition(JButton.CENTER); //調整按鈕中文字的位置
        button.setVerticalTextPosition(JButton.BOTTOM); //調整按鈕中文字的位置

        button.setFont(new Font("Comic Sans",Font.BOLD,15)); //設定字型
        button.setIconTextGap(5); //設定字與圖的間距
        button.setForeground(Color.CYAN); //字的顏色
        button.setBackground(Color.LIGHT_GRAY); //按鈕顏色

        //設定外框
        button.setBorder(BorderFactory.createEtchedBorder());

        button.setEnabled(true); //要不要啟用按鈕

        this.add(button);

        label=new JLabel();
        label.setText("HAHA");
        label.setBounds(100,250,100,100);
        label.setVisible(false);
        this.add(label);
    }

    //來自ActionListener interface
    @Override
    public void actionPerformed(ActionEvent e) {

        //如果是button被按到
        if(e.getSource()==button){
            System.out.println("GGGGG");
            label.setVisible(true);
        }
    }
}
