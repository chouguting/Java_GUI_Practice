package L13_radioButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {


    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton hotDogButton;

    ButtonGroup buttonGroup;

    Button button;



    public MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button=new Button("Submit");
        button.addActionListener(this);

        //分別創造radio button
        pizzaButton=new JRadioButton("pizza");
        hamburgerButton=new JRadioButton("hamburger");
        hotDogButton=new JRadioButton("hot dog");

        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotDogButton.addActionListener(this);

        buttonGroup=new ButtonGroup();
        //把radio button收成一個群組
        buttonGroup.add(pizzaButton);
        buttonGroup.add(hamburgerButton);
        buttonGroup.add(hotDogButton);

        //設定對應的ActionCommand
        pizzaButton.setActionCommand("pizza");
        hamburgerButton.setActionCommand("hamburger");
        hotDogButton.setActionCommand("hot dog");

        /*
        * 可以用 setIcon和 setSelectedIcon 設成自己的圖示
        *
        * */


        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotDogButton);
        this.add(button);

        this.pack(); //讓Frame大小配合內容物
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==pizzaButton){
            System.out.println("Pizza selected");
        }else if(e.getSource()==hamburgerButton){
            System.out.println("hamburger selected");
        }else if(e.getSource()==hotDogButton){
            System.out.println("hot dog selected");
        }

        //可以印出來現在選的是甚麼
        if(e.getSource()==button){
            System.out.println("You just ordered "+buttonGroup.getSelection().getActionCommand());
        }
    }
}
