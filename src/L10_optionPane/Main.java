package L10_optionPane;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        //JOptionPane: 彈出一個對話框，可以輸入資料或是顯示資訊


        //可以直接用JOptionPane Class

        //showMessageDialog四個參數分別是: 母元件,訊息,視窗title,樣式
        /*
        * 樣式主要有五種:PLAIN, INFORMATION, QUESTION, WARNING, ERROR
        * */
        //JOptionPane.showMessageDialog(null,"useless info","plain",JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null,"useless info","information",JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null,"useless info","question",JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null,"useless info","warning",JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null,"useless info","error",JOptionPane.ERROR_MESSAGE);


        //showConfirmDialog (樣式也有很多種)
        //可以把結果存成int(Yes是0, No是1, Cancel是2 ,Exit是-1)
        int answer=JOptionPane.showConfirmDialog(null,"what??","this is title",JOptionPane.YES_NO_CANCEL_OPTION);


        //可輸入的文字框
        String name=JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null,"Hello "+name);


        String[] responses={"Hi","Hello","No No"}; //自己設定回答的選項 (String array)
        ImageIcon imageIcon=new ImageIcon(Main.class.getResource("scared.png"));
        //showOptionDialog參數分別是: 母元件,訊息,視窗title,按鈕,內容樣式,圖示, 可選的選項,按鈕預設值:
        JOptionPane.showOptionDialog(
                null,
                "Hej you",
                "secret message",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                imageIcon,responses,
                0);
    }
}
