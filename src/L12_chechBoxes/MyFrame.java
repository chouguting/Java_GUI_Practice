package L12_chechBoxes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {


    JButton button;
    JCheckBox checkBox;

    public MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button=new JButton("submit");
        button.addActionListener(this);

        checkBox=new JCheckBox();
        checkBox.setText("I'm not a robot");
        checkBox.setFocusable(false); //讓選取時不出現虛線
        checkBox.setFont(new Font("Consolas",Font.BOLD,35));

        /*
        這兩個函式可以設定沒選時和選擇時的圖像
            checkBox.setIcon(<Icon>);
            checkBox.setSelectedIcon(<Icon>);
        */

        this.add(checkBox);
        this.add(button);

        this.pack(); //讓Frame大小配合內容物
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println(checkBox.isSelected()); //印出有沒有選擇
        }
    }
}
