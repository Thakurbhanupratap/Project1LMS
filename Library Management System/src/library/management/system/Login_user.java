/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system;

/**
 *
 * @author Thakur Bhanu
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login_user extends JFrame implements ActionListener{
    
    private JPanel panel;
    private JTextField textField;
    private JPasswordField passwordField;
    private JButton b1,b2,b3;
    
    public Login_user(){
        setLayout(null);
        setBackground(Color.gray);
        setBounds(600,300,600,400);
        
        panel = new JPanel();
        panel.setBackground(Color.gray);
        setContentPane(panel);
        panel.setLayout(null);
        
        JLabel l1 = new JLabel ("Username: ");
        l1.setBounds(124,89,95,24);
        panel.add(l1);
        
        JLabel l2 = new JLabel("Password: ");
        l2.setBounds(124,124,95,24);
        panel.add(l2);
        
        textField = new JTextField();
        textField.setBounds(210,93,157,20);
        panel.add(textField);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(210,128,157,20);
        panel.add(passwordField);
        
        b1 = new JButton("Login");
        b1.addActionListener(this);
        b1.setBounds(149,181,113,39);
        b1.setForeground(new Color(46,139,87));
        b1.setBackground(new Color(250,250,210));
        panel.add(b1);
        
        b2 = new JButton("SignUp");
        b2.addActionListener(this);
        b2.setForeground(new Color(139,69,19));
        b2.setBackground(new Color(255,235,205));
        b2.setBounds(289,181,113,39);
        panel.add(b2);
        
        b3 = new JButton("Forgot Password");
        b3.addActionListener(this);
        b3.setForeground(new Color(205,92,92));
        b3.setBackground(new Color(253,245,230));
        b3.setBounds(199,231,179,39);
        panel.add(b3);
        
        JLabel l3 = new JLabel("Trouble in Login?");
        l3.setFont(new Font("Tahoma",Font.BOLD,15));
        l3.setForeground(Color.CYAN);
        l3.setBounds(70,240,130,20);
        panel.add(l3);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            Boolean status = false;
            try{
                conn con = new conn();
            String sql = "Select * from account where username=? and password=?";
            PreparedStatement st = con.c.prepareStatement(sql);
            
            st.setString(1,textField.getText());
            st.setString(2,passwordField.getText());
            
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                this.setVisible(false);
                new Loading().setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null,"Invalid Login!");
            }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        if(ae.getSource() == b2){
            setVisible(false);
            new SignUp().setVisible(true);
        }
        if(ae.getSource() == b3){
            setVisible(false);
            new Forgot().setVisible(true);
        }
    }
    
    public static void main(String[] args){
        new Login_user().setVisible(true);
    }
}
