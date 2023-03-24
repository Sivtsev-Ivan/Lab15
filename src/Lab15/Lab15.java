package Lab15;

import java.awt.*;
import java.awt.event.*;

public class Lab15 extends Frame {
    Lab15(String s) {
        super(s);
        setSize(400, 400);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ev) {
                System.exit(0);
            }
        });

        Label num1 = new Label("Число =");
        TextField num2 = new TextField("0");
        num2.setEditable(false);
        num1.setBounds(50, 50, 50, 20);
        num2.setBounds(100, 50, 50, 20);
        add(num1);
        add(num2);

        Button Plus = new Button("+1");
        Plus.setBounds(50, 130, 75, 20);
        Plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(num2.getText());
                int sum = num + 1;
                num2.setText(Integer.toString(sum));
            }
        });
        add(Plus);

        Button Minus = new Button("-1");
        Minus.setBounds(50, 150, 75, 20);
        Minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(num2.getText());
                int sum = num - 1;
                num2.setText(Integer.toString(sum));
            }
        });
        add(Minus);
    }

    public static void main(String[] args) {
        new Lab15("Moya programa");
    }
}