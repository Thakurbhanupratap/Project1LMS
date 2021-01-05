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
import java.sql.*;
import java.awt.event.*;
import javax.swing.border.*;

public class SignUp extends JFrame implements ActionListener{
    
     private JPanel contentPane;
    private JTextField textField1 , textField2 , textField3 , textField4;
    private JButton b1,b2;
    private JComboBox comboBox;
    
    public static void main(String[] args){
        new SignUp().setVisible(true);
    }
    
    public SignUp(){
        setBounds(600,250,606,406);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
        contentPane.setLayout(null);
        
        JLabel userName = new JLabel("Username :");
        userName.setForeground(Color.DARK_GRAY); 
        userName.setFont(new Font("Tahoma",Font.BOLD,14));
        userName.setBounds(99,86,92,26);
        contentPane.add(userName);
        
        JLabel name = new JLabel("Name :");
        name.setForeground(Color.DARK_GRAY); 
        name.setFont(new Font("Tahoma",Font.BOLD,14));
        name.setBounds(99,123,92,26);
        contentPane.add(name);
        
        JLabel password = new JLabel("Password :");
        password.setForeground(Color.DARK_GRAY); 
        password.setFont(new Font("Tahoma",Font.BOLD,14));
        password.setBounds(99,160,92,26);
        contentPane.add(password);
        
        JLabel answer = new JLabel("Answer :");
        answer.setForeground(Color.DARK_GRAY); 
        answer.setFont(new Font("Tahoma",Font.BOLD,14));
        answer.setBounds(99,234,92,26);
        contentPane.add(answer);
        
        comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[]
                         {"Your NickName?",
                          "Your SuperHero?",
                          "Yout BestFriendName?",
                          "Your DateOfBirth",
                          "Your CollegeName"}));
        comboBox.setBounds(265,202,148,20);
        contentPane.add(comboBox);
        
        
        JLabel securityQuestion = new JLabel("Security Question :");
        securityQuestion.setForeground(Color.DARK_GRAY); 
        securityQuestion.setFont(new Font("Tahoma",Font.BOLD,14));
        securityQuestion.setBounds(99,197,140,26);
        contentPane.add(securityQuestion);
        
        textField1 = new JTextField();
        textField1.setBounds(265,91,148,20);
        contentPane.add(textField1);
        textField1.setColumns(10);
        
        textField2 = new JTextField();
        textField2.setBounds(265,120,148,20);
        contentPane.add(textField2);
        textField2.setColumns(10);
        
        textField3 = new JTextField();
        textField3.setBounds(265,165,148,20);
        contentPane.add(textField3);
        textField3.setColumns(10);
        
        textField4 = new JTextField();
        textField4.setBounds(265,239,148,20);
        contentPane.add(textField4);
        textField4.setColumns(10);
        
        b1 = new JButton("Create");
        b1.addActionListener(this);
        b1.setFont(new Font("Tahoma",Font.BOLD,13));
        b1.setBounds(140,289,100,30);
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        contentPane.add(b1);
        
        b2 = new JButton("Back");
        b2.addActionListener(this);
        b2.setFont(new Font("Tahoma",Font.BOLD,13));
        b2.setBounds(300,289,100,30);
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        contentPane.add(b2);
        
        JPanel panel = new JPanel();
        panel.setForeground(new Color(4,139,34));
        panel.setBorder(new TitledBorder(new LineBorder(new Color(128,128,0),2),"Create-Accout",
                        TitledBorder.LEADING,TitledBorder.TOP,null,new Color(34,139,34)));
        panel.setBounds(31,46,476,296);
        panel.setBackground(Color.WHITE);
        contentPane.add(panel);
    }
    
    public void actionPerformed(ActionEvent e){
        try{
            conn con = new conn();
            
            if(e.getSource() == b1){
                String sql = "insert into account(username, name,password,sec_q,sec_ans) values(?,?,?,?,?)";
                PreparedStatement st = con.c.prepareStatement(sql);
                
                st.setString(1, textField1.getText());
                st.setString(2, textField2.getText());
                st.setString(3, textField3.getText());
                st.setString(4, (String) comboBox.getSelectedItem());
                st.setString(5, textField4.getText());
                
                int i = st.executeUpdate();
                if(i > 0){
                    JOptionPane.showMessageDialog(null,"successfully Created");
                }
                
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");
            }
            
            if(e.getSource() == b2){
                this.setVisible(false);
                new Login_user().setVisible(true);
            }
        }catch(Exception ea){
            
            }
    }
}
