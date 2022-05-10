package awt.demo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FirstInterface extends Frame {

    public FirstInterface(){


//        Frame f = new Frame();
        this.setBounds(200,200,600,600);
        this.setTitle("Go-Bizzy");
        this.setBackground(Color.lightGray);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                dispose();
            }
        });

        final TextField tf = new TextField();
        tf.setBounds(100,60,100,20);
        this.add(tf);

        Button b = new Button("click me");
        b.setBounds(100,100,100,30);
        b.setBackground(Color.CYAN);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("this and that");
            }
        });
        this.setLayout(null);
        this.add(b);

    }
    public static void main(String args[]){
    new FirstInterface();
    }
}
