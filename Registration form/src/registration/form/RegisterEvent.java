package registration.form;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;
import javax.swing.*;


public class RegisterEvent extends JFrame implements ActionListener{
    
    JLabel image,l,l1,l2,l3,l4,l5,l6,l7,l8,tf8,l9;
    JTextField tf1,tf2,tf3,tf5,tf6;
    JRadioButton rb1, rb2,rb3,rb4,rb5;
    JComboBox c1;
    JButton s,e;
    JFrame f;
    Choice c2;
    
    RegisterEvent(){
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/2.jpg"));
        image = new JLabel(i1);
        image.setBounds(500,120,450,400);
        
        l = new JLabel("Resgister For Event");
        l.setBounds(300,20,800,60);
        l.setFont(new Font("Tahoma",Font.PLAIN,46));
        l.setForeground(Color.WHITE);
        
        l1 = new JLabel("Name");
        l1.setBounds(100, 120, 200, 30);
        l1.setFont(new Font("Tahoma",Font.PLAIN,20));
        l1.setForeground(Color.BLACK);
        
        tf1 = new JTextField();
        tf1.setBounds(300, 120, 150, 30);
        
        l2 = new JLabel("Registration No.");
        l2.setBounds(100, 180, 200, 30);
        l2.setFont(new Font("Tahoma",Font.PLAIN,20));
        l2.setForeground(Color.BLACK);
        
        tf2 = new JTextField();
        tf2.setBounds(300, 180, 150, 30);
        
        l3 = new JLabel("Mobile No.");
        l3.setBounds(100, 240, 200, 30);
        l3.setFont(new Font("Tahoma",Font.PLAIN,20));
        l3.setForeground(Color.BLACK);
        
        tf3 = new JTextField();
        tf3.setBounds(300, 240, 150, 30);
                
        l4 = new JLabel("Gender");
        l4.setBounds(100,300,200,30);
        l4.setFont(new Font("Tahoma",Font.PLAIN,20));
        l4.setForeground(Color.BLACK);
        
        String options1[] = {"Male","Female","Other"};
        c1 = new JComboBox(options1);
        c1.setBounds(300,300,150,30);
        c1.setBackground(Color.WHITE);
        
        l5 = new JLabel("Course Name");
        l5.setBounds(100, 360, 200, 30);
        l5.setFont(new Font("Tahoma",Font.PLAIN,20));
        l5.setForeground(Color.BLACK);
        
        tf5 = new JTextField();
        tf5.setBounds(300, 360, 150, 30);
        
        l6 = new JLabel("Email");
        l6.setBounds(100, 420, 200, 30);
        l6.setFont(new Font("Tahoma",Font.PLAIN,20));
        l6.setForeground(Color.BLACK);
        
        tf6 = new JTextField();
        tf6.setBounds(300, 420, 150, 30);
        
        l7 = new JLabel("Event");
        l7.setBounds(100,480,200,30);
        l7.setFont(new Font("Tahoma",Font.PLAIN,20));
        l7.setForeground(Color.BLACK);
        
        
        c2 = new Choice();
        
        try{
            Conn conn = new Conn();
            String query = "select eventname from event";
            ResultSet rs = conn.s.executeQuery(query);
            while(rs.next()){
                c2.add(rs.getString("eventname"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        c2.setBounds(300,480,150,30);
        c2.setBackground(Color.WHITE);
        
        l8 = new JLabel("Register Time");
        l8.setBounds(100,540,200,30);
        l8.setFont(new Font("Tahoma",Font.PLAIN,20));
        l8.setForeground(Color.BLACK);
        
        Date date = new Date();
        tf8 = new JLabel("" + date);
        tf8.setBounds(300,540,300,30);
        tf8.setFont(new Font("Tahoma",Font.PLAIN,20));
        tf8.setForeground(Color.BLACK);
        
        l9 = new JLabel("Year");
        l9.setBounds(100,600,200,30);
        l9.setFont(new Font("Tahoma",Font.PLAIN,20));
        l9.setForeground(Color.BLACK);
        
        rb1 = new JRadioButton("1st Year");
        rb1.setBounds(300,600,100,30);
        rb2 = new JRadioButton("2nd Year");
        rb2.setBounds(400,600,100,30);
        rb3 = new JRadioButton("3rd Year");
        rb3.setBounds(500,600,100,30);
        rb4 = new JRadioButton("4rth Year");
        rb4.setBounds(600,600,100,30);
        rb5 = new JRadioButton("5th Year");
        rb5.setBounds(700,600,100,30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb2);
        bg.add(rb1);
        bg.add(rb3);
        bg.add(rb4);
        bg.add(rb5);
        
        s = new JButton("Submit");
        s.setBackground(Color.BLACK);
        s.setForeground(Color.WHITE);
        s.setBounds(100,670,150,40);
        s.setFont(new Font("Tahoma",Font.PLAIN,20));
        s.addActionListener(this);
        
        e = new JButton("Back");
        e.setBackground(Color.BLACK);
        e.setForeground(Color.WHITE);
        e.setBounds(300,670,150,40);
        e.setFont(new Font("Tahoma",Font.PLAIN,20));
        e.addActionListener(this);
        
        f = new JFrame("Register For Event");
        f.setSize(1000,800);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(new Color(150,200,150));
        f.setLayout(null);
        f.setVisible(true);
        f.add(l);
        f.add(l1);
        f.add(tf1);
        f.add(l2);
        f.add(tf2);
        f.add(l3);
        f.add(tf3);
        f.add(image);
        f.add(l4);
        f.add(c1);
        f.add(l5);
        f.add(tf5);
        f.add(l6);
        f.add(tf6);
        f.add(l7);
        f.add(c2);
        f.add(l8);
        f.add(tf8);
        f.add(rb1);
        f.add(rb2);
        f.add(rb3);
        f.add(rb4);
        f.add(rb5);
        f.add(l9);
        f.add(e);
        f.add(s);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == s){
            String name = tf1.getText();
            String registration = tf2.getText();
            String mobile = tf3.getText();
            String gender = (String) c1.getSelectedItem();
            String Course = tf5.getText();
            String email = tf6.getText();
            String time = tf8.getText();
            String event =  (String) c2.getSelectedItem();
            
            String Year = null;
            if(rb1.isSelected()){
                Year = "1st Year";
            } else if (rb2.isSelected()){
                Year = "2nd Year";
            } else if (rb3.isSelected()){
                Year = "3rd Year";
            } else if (rb4.isSelected()){
                Year = "4rth Year";
            } else if (rb5.isSelected()){
                Year = "5th Year";
            }

            
            try{
                Conn conn = new Conn();
                String str = "insert into register values('"+name+"','"+registration+"','"+mobile+"','"+gender+"','"+Course+"','"+email+"','"+event+"','"+time+"','"+Year+"')";
                
                conn.s.executeUpdate(str);
                
                JOptionPane.showMessageDialog(null, "New Student Added Successfully");
                //setVisible(false);
                f.dispose();
                new RegistrationForm();
                
            } catch(Exception e){
                e.printStackTrace();
            }
            
            
        }else {
            //setVisible(false);
            f.dispose();
            new RegistrationForm();
        }
    }
    public static void main(String[]args){
        new RegisterEvent();
    }
}
