package L11_textField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JTextField textField;

    JButton button;

    public MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button=new JButton("Submit");
        button.addActionListener(this);

        textField=new JTextField();
        textField.setPreferredSize(new Dimension(250,40)); //TextField大小
        textField.setFont(new Font("Consolas",Font.PLAIN,35)); //文字框內容的字形
        textField.setForeground(Color.green); //字的顏色
        textField.setBackground(Color.black); //背景框的顏色
        textField.setCaretColor(Color.yellow); //閃爍線的顏色
        textField.setText("user name"); //預設文字
        textField.setEditable(true); //能不能編輯

        this.add(button);
        this.add(textField);

        this.pack(); //讓Frame大小配合內容物
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            button.setEnabled(false);
            textField.setEditable(false);
            System.out.println("Hi! "+textField.getText());
        }
    }
}
