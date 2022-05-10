package awt.demo;

import jdk.jshell.Snippet;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SecondInteface extends Frame {

    Button b = null;
    Button b2 = null;
    TextField tf= null;
    TextField status;


    public SecondInteface(){


        this.setBounds(300,100,1000,600);
        this.setBackground(Color.lightGray);
        this.setLayout(null);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                dispose();
            }
        });



        Panel pn1 = new Panel();
        pn1.setBounds(0,0,1000,100);
        pn1.setBackground(Color.black);
        this.add(pn1);

        Panel pn2 = new Panel();
        pn2.setBounds(0,60, 1000,400);

        Label question = new Label();
        question.setBounds(370,70,300,50);
//        question.setBackground(Color.green);
        question.setText("Write any message");
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
           e.printStackTrace();
        }
        pn2.add(question);
        tf = new TextField();
//        tf.setText("this is me");

        tf.setBounds(300,200,300,50);
//        tf2.setBounds(600,130,300,50);
        this.add(tf);

        b = new Button("Send me");
        b.setBounds(330,240,100,40);
        b.setBackground(Color.blue);
        b.setActionCommand("SEND");
        b.addActionListener( new ButtonClickHandler());
        pn2.add(b);
        b2= new Button("clear me");
        b2.setBounds(460,240,100,40);
        b2.setBackground(Color.red);
        b2.setActionCommand("CLEAR");
        b2.addActionListener(new ButtonClickHandler());





        pn2.add(b2);
        this.add(pn2);






        Panel pn3 = new Panel();
        pn3.setBounds(0,300,1000,400);
        status = new TextField();
        status.setBounds(0,200,1000,130);
        status.setBackground(Color.BLACK);
        status.setFont();
        pn3.add(status);
        this.add(pn3);


    }
public static void main(String args[]){

        new SecondInteface();


}

class ButtonClickHandler implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("SEND")){

            status.setText(tf.getText());
        }
     else if(e.getActionCommand().equals("CLEAR")){
         tf.setText("");
        }
    }
}

}
