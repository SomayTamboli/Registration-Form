package registration.form;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;


public class Events extends JFrame implements ActionListener{
    
    JFrame f;
    JTable t;
    JButton b;
    JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
    
    
    Events(){
        
        l = new JLabel("Events");
        l.setBounds(520,25,400,80);
        l.setFont(new Font("Tahoma",Font.PLAIN,50));
        l.setForeground(Color.black);
        
        l1 = new JLabel("Event Name");
        l1.setBounds(10,120,100,20);
        l1.setFont(new Font("Tahoma",Font.PLAIN,15));
        l1.setForeground(Color.BLACK);
        
        l2 = new JLabel("Event Date");
        l2.setBounds(115,120,100,20);
        l2.setFont(new Font("Tahoma",Font.PLAIN,15));
        l2.setForeground(Color.BLACK);
        
        l3 = new JLabel("Event Time");
        l3.setBounds(220,120,100,20);
        l3.setFont(new Font("Tahoma",Font.PLAIN,15));
        l3.setForeground(Color.BLACK);
        
        l4 = new JLabel("Event Venue");
        l4.setBounds(325,120,100,20);
        l4.setFont(new Font("Tahoma",Font.PLAIN,15));
        l4.setForeground(Color.BLACK);
       
        l5 = new JLabel("Event Type");
        l5.setBounds(432,120,100,20);
        l5.setFont(new Font("Tahoma",Font.PLAIN,15));
        l5.setForeground(Color.BLACK);
        
        l6 = new JLabel("Event Motive");
        l6.setBounds(540,120,100,20);
        l6.setFont(new Font("Tahoma",Font.PLAIN,15));
        l6.setForeground(Color.BLACK);
        
        l7 = new JLabel("Special Guest");
        l7.setBounds(645,120,100,20);
        l7.setFont(new Font("Tahoma",Font.PLAIN,15));
        l7.setForeground(Color.BLACK);
        
        l8 = new JLabel("Event Language");
        l8.setBounds(750,120,100,20);
        l8.setFont(new Font("Tahoma",Font.PLAIN,15));
        l8.setForeground(Color.BLACK);
        
        l9 = new JLabel("Creator Name");
        l9.setBounds(855,120,100,20);
        l9.setFont(new Font("Tahoma",Font.PLAIN,15));
        l9.setForeground(Color.BLACK);
        
        l10 = new JLabel("Creator Mob");
        l10.setBounds(960,120,100,20);
        l10.setFont(new Font("Tahoma",Font.PLAIN,15));
        l10.setForeground(Color.BLACK);
        
        l11 = new JLabel("Creator Email");
        l11.setBounds(1075,120,100,20);
        l11.setFont(new Font("Tahoma",Font.PLAIN,15));
        l11.setForeground(Color.BLACK);
        
        t = new JTable();
        t.setBounds(5,140,1170,700);
        t.setBackground(Color.white);
        DefaultTableModel model = new DefaultTableModel();
        try{
            Conn conn = new Conn();
            ResultSet rs = conn.s.executeQuery("Select * from event");
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
        b.setBounds(500,870,200,30);
        b.addActionListener(this);
        
        
        f = new JFrame("Events");
        f.setSize(1200,1000);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(new Color(200,250,250));
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
        f.add(l10);
        f.add(l11);
        f.add(b);
        f.add(t);
    }
    
    public void actionPerformed(ActionEvent ae){
        //setVisible(false);
        f.dispose();
        new RegistrationForm();
    }
    
    public static void main(String[]args){
        new Events();
    }
}
