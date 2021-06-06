package L09_openNewWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage {

    JFrame frame=new JFrame();

    JButton myButton=new JButton("new Window");

    public LaunchPage() {
        myButton.setBounds(100,160,200,40);
        myButton.setFocusable(false);

        myButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==myButton){
                    frame.dispose(); //把現在這個frame關掉
                    NewWindow myWindow=new NewWindow();
                }
            }
        });

        frame.add(myButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
