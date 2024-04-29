package registration.form;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;


public class RegisteredUsers extends JFrame implements ActionListener{
    
    JFrame f;
    JTable t;
    JButton b;
    JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9;
    
    RegisteredUsers(){
        
        l = new JLabel("Registered Users");
        l.setBounds(320,30,800,60);
        l.setFont(new Font("Tahoma",Font.PLAIN,46));
        l.setForeground(Color.black);
        
        l1 = new JLabel("Name");
        l1.setBounds(10,120,100,20);
        l1.setFont(new Font("Tahoma",Font.PLAIN,15));
        l1.setForeground(Color.BLACK);
        
        l2 = new JLabel("Registration No");
        l2.setBounds(115,120,100,20);
        l2.setFont(new Font("Tahoma",Font.PLAIN,15));
        l2.setForeground(Color.BLACK);
        
        l3 = new JLabel("Mobile No.");
        l3.setBounds(225,120,100,20);
        l3.setFont(new Font("Tahoma",Font.PLAIN,15));
        l3.setForeground(Color.BLACK);
        
        l4 = new JLabel("Gender");
        l4.setBounds(330,120,100,20);
        l4.setFont(new Font("Tahoma",Font.PLAIN,15));
        l4.setForeground(Color.BLACK);
       
        l5 = new JLabel("Course");
        l5.setBounds(440,120,100,20);
        l5.setFont(new Font("Tahoma",Font.PLAIN,15));
        l5.setForeground(Color.BLACK);
        
        l6 = new JLabel("Email");
        l6.setBounds(550,120,100,20);
        l6.setFont(new Font("Tahoma",Font.PLAIN,15));
        l6.setForeground(Color.BLACK);
        
        l7 = new JLabel("Event");
        l7.setBounds(655,120,100,20);
        l7.setFont(new Font("Tahoma",Font.PLAIN,15));
        l7.setForeground(Color.BLACK);
        
        l8 = new JLabel("Time");
        l8.setBounds(760,120,100,20);
        l8.setFont(new Font("Tahoma",Font.PLAIN,15));
        l8.setForeground(Color.BLACK);
        
        l9 = new JLabel("Year");
        l9.setBounds(870,120,100,20);
        l9.setFont(new Font("Tahoma",Font.PLAIN,15));
        l9.setForeground(Color.BLACK);
        
        t = new JTable();
        t.setBounds(5,140,970,550);
        t.setBackground(Color.white);
        DefaultTableModel model = new DefaultTableModel();
        try{
            Conn conn = new Conn();
            ResultSet rs = conn.s.executeQuery("Select * from register");
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
            model.addColumn(metaData.getColumnName(columnIndex));
            }
            while (rs.next()) {
            Object[] row = new Object[columnCount];
            for (int i = 0; i < columnCount; i++) {
            row[i] = rs.getObject(i + 1);
            }
            model.addRow(row);
            }
            t.setModel(model);
        } catch (Exception e){
            e.printStackTrace();
        }
        
        
        b = new JButton("Back");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(390,700,200,30);
        b.addActionListener(this);
        
        
        f = new JFrame("Registered Users");
        f.setSize(1000,800);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(new Color(250,100,100));
        f.setLayout(null);
        f.setVisible(true);
        f.add(l);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(l7);
        f.add(l8);
        f.add(l9);
        f.add(b);
        f.add(t);
    }
    
    public void actionPerformed(ActionEvent ae){
        //setVisible(false);
        f.dispose();
        new RegistrationForm();
    }
    
    public static void main(String[]args){
        new RegisteredUsers();
    }
}
