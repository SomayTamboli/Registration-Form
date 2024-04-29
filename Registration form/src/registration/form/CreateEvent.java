package registration.form;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;
import javax.swing.*;


public class CreateEvent extends JFrame implements ActionListener{
    
    JLabel image,l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
    JButton s,e;
    JTextField tf1,tf2,tf3,tf4,tf5,tf7,tf9,tf10,tf11;
    JComboBox c1;
    JFrame f;
    JRadioButton rb1,rb2,rb3,rb4;
    
    
    CreateEvent(){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/3.jpg"));
        image = new JLabel(i1);
        image.setBounds(700,200,200,200);
        
        
        l = new JLabel("Create New Event");
        l.setBounds(300,30,800,60);
        l.setFont(new Font("Tahoma",Font.PLAIN,46));
        l.setForeground(Color.WHITE);
        
        l1 = new JLabel("Event Name");
        l1.setBounds(100, 120, 250, 30);
        l1.setFont(new Font("Tahoma",Font.PLAIN,20));
        l1.setForeground(Color.BLACK);
        
        tf1 = new JTextField();
        tf1.setBounds(350, 120, 150, 30);
        
        l2 = new JLabel("Event Date");
        l2.setBounds(100, 180, 250, 30);
        l2.setFont(new Font("Tahoma",Font.PLAIN,20));
        l2.setForeground(Color.BLACK);
        
        tf2 = new JTextField();
        tf2.setBounds(350, 180, 150, 30);
        
        l3 = new JLabel("Event Time");
        l3.setBounds(100, 240, 250, 30);
        l3.setFont(new Font("Tahoma",Font.PLAIN,20));
        l3.setForeground(Color.BLACK);
        
        tf3 = new JTextField();
        tf3.setBounds(350, 240, 150, 30);
        
        l4 = new JLabel("Event Venue");
        l4.setBounds(100, 300, 250, 30);
        l4.setFont(new Font("Tahoma",Font.PLAIN,20));
        l4.setForeground(Color.BLACK);
        
        tf4 = new JTextField();
        tf4.setBounds(350, 300, 150, 30);
        
        l5 = new JLabel("Event Motive");
        l5.setBounds(100, 420, 250, 30);
        l5.setFont(new Font("Tahoma",Font.PLAIN,20));
        l5.setForeground(Color.BLACK);
        
        tf5 = new JTextField();
        tf5.setBounds(350, 420, 150, 30);
        
        l6 = new JLabel("Type of Event");
        l6.setBounds(100,360,250,30);
        l6.setFont(new Font("Tahoma",Font.PLAIN,20));
        l6.setForeground(Color.BLACK);
        
        String options1[] = {"Competition","Hackathon","Education","Stand-up Comedy","Workshop","Career","Health and Fitness","Acting"};
        c1 = new JComboBox(options1);
        c1.setBounds(350,360,150,30);
        c1.setBackground(Color.WHITE);
        
        l7 = new JLabel("Special Guest");
        l7.setBounds(100, 480, 250, 30);
        l7.setFont(new Font("Tahoma",Font.PLAIN,20));
        l7.setForeground(Color.BLACK);
        
        tf7 = new JTextField();
        tf7.setBounds(350, 480, 150, 30);
        
        l8 = new JLabel("Event Language");
        l8.setBounds(100,540,250,30);
        l8.setFont(new Font("Tahoma",Font.PLAIN,20));
        l8.setForeground(Color.BLACK);
        
        rb1 = new JRadioButton("Hindi");
        rb1.setBounds(350,540,100,30);
        rb2 = new JRadioButton("English");
        rb2.setBounds(450,540,100,30);
        rb3 = new JRadioButton("Punjabi");
        rb3.setBounds(550,540,100,30);
        rb4 = new JRadioButton("Other");
        rb4.setBounds(650,540,100,30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);
        bg.add(rb4);
        
        
        l9 = new JLabel("Event Creater Name");
        l9.setBounds(100, 600, 250, 30);
        l9.setFont(new Font("Tahoma",Font.PLAIN,20));
        l9.setForeground(Color.BLACK);
        
        tf9 = new JTextField();
        tf9.setBounds(350, 600, 150, 30);
        
        l10 = new JLabel("Event Creater Email id");
        l10.setBounds(100, 660,250, 30);
        l10.setFont(new Font("Tahoma",Font.PLAIN,20));
        l10.setForeground(Color.BLACK);
        
        tf10 = new JTextField();
        tf10.setBounds(350, 660, 150, 30);
        
        l11 = new JLabel("Event Creater Mobile No.");
        l11.setBounds(100, 720, 250, 30);
        l11.setFont(new Font("Tahoma",Font.PLAIN,20));
        l11.setForeground(Color.BLACK);
        
        tf11 = new JTextField();
        tf11.setBounds(350, 720, 150, 30);


        
        
        s = new JButton("Submit");
        s.setBackground(Color.BLACK);
        s.setForeground(Color.WHITE);
        s.setBounds(120,790,150,40);
        s.setFont(new Font("Tahoma",Font.PLAIN,20));
        s.addActionListener(this);
        
        e = new JButton("Back");
        e.setBackground(Color.BLACK);
        e.setForeground(Color.WHITE);
        e.setBounds(360,790,150,40);
        e.setFont(new Font("Tahoma",Font.PLAIN,20));
        e.addActionListener(this);
        
        
        f = new JFrame("Create Event");
        f.setSize(1000,900);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(new Color(150,150,200));
        f.setLayout(null);
        f.setVisible(true);
        f.add(image);
        f.add(l);
        f.add(s);
        f.add(e);
        f.add(l1);
        f.add(tf1);
        f.add(l2);
        f.add(tf2);
        f.add(l3);
        f.add(tf3);
        f.add(l4);
        f.add(tf4);
        f.add(l5);
        f.add(tf5);
        f.add(l6);
        f.add(c1);
        f.add(l7);
        f.add(tf7);
        f.add(l8);
        f.add(rb1);
        f.add(rb2);
        f.add(rb3);
        f.add(rb4);
        f.add(l9);
        f.add(tf9);
        f.add(l10);
        f.add(tf10);
        f.add(l11);
        f.add(tf11);

    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == s){
            String eventname = tf1.getText();
            String eventdate = tf2.getText();
            String eventtime = tf3.getText();
            String eventvenue = tf4.getText();
            String eventtype = (String) c1.getSelectedItem();
            String eventmotive = tf5.getText();
            String specialguest = tf7.getText();
            String eventlanguage = null;
            if(rb1.isSelected()){
                eventlanguage = "Hindi";
            } else if (rb2.isSelected()){
                eventlanguage = "English";
            } else if (rb3.isSelected()){
                eventlanguage = "Punjabi";
            } else if (rb4.isSelected()){
                eventlanguage = "Other";
            }
            String creatorname = tf9.getText();
            String creatormob = tf11.getText();
            String creatoremail = tf10.getText();
            
            
            try{
                Conn conn = new Conn();
                String str = "insert into event values('"+eventname+"','"+eventdate+"','"+eventtime+"','"+eventvenue+"','"+eventtype+"','"+eventmotive+"','"+specialguest+"','"+eventlanguage+"','"+creatorname+"','"+creatormob+"','"+creatoremail+"')";
                
                conn.s.executeUpdate(str);
                
                JOptionPane.showMessageDialog(null, "New Event Created Successfully");
                //setVisible(false);
                f.dispose();
                new RegistrationForm();
                
            } catch(Exception e){
                e.printStackTrace();
            }
            
            
        } else {
            //setVisible(false);
            f.dispose();
            new RegistrationForm();
        }
    }
    
public static void main(String[]args){
    new CreateEvent();
    }
}
