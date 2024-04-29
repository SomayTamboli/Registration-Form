package registration.form;
        
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class RegistrationForm extends JFrame implements ActionListener {
    JButton b1 , b2, b3, b4;
    JFrame f;
    JLabel l , image;
    RegistrationForm(){
        
        l = new JLabel("The Event Regisration Form");
        l.setBounds(200,60,800,60);
        l.setFont(new Font("Tahoma",Font.PLAIN,46));
        l.setForeground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/1.jpg"));
        image = new JLabel(i1);
        image.setBounds(100,170,800,400);    
        
        b1 = new JButton("Create Event");
        b1.setBounds(150,650,300,50);
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.addActionListener(this);
        
        b2 = new JButton("Register For Event");
        b2.setBounds(550,650,300,50);
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
        b2.addActionListener(this);
        
        b3 = new JButton("Registered Users");
        b3.setBounds(150,750,300,50);
        b3.setBackground(Color.WHITE);
        b3.setForeground(Color.BLACK);
        b3.addActionListener(this);
        
        b4 = new JButton("Events");
        b4.setBounds(550,750,300,50);
        b4.setBackground(Color.WHITE);
        b4.setForeground(Color.BLACK);
        b4.addActionListener(this);
        
        f = new JFrame("Registration Form");
        f.setSize(1000,900);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(new Color(0,100,150));
        f.setLayout(null);
        f.setVisible(true);
        f.add(l);
        f.add(image);
        f.add(b3);
        f.add(b1);
        f.add(b2);
        f.add(b4);
    }
    
    public void actionPerformed(ActionEvent ae){
    if(ae.getSource()== b1){
        //setVisible(false);
        f.dispose();
        new CreateEvent();
    }
    if(ae.getSource()== b2){
        //setVisible(false);
        f.dispose();
        new RegisterEvent();
    }
    if(ae.getSource()== b3){
        //setVisible(false);
        f.dispose();
        new RegisteredUsers();
    }
    if(ae.getSource()== b4){
        //setVisible(false);
        f.dispose();
        new Events();
    }
    }
   
    
    public static void main(String[] args) {
        new RegistrationForm();
    }
}
