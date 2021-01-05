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
public class Forgot extends JFrame implements ActionListener{
    
    private JPanel contentPane;
    private JTextField tf1,tf2,tf3,tf4,tf5;
    private JButton b1,b2,b3;
    
    public static void main(String[] args){
        new Forgot().setVisible(true);
    }
    
    public Forgot(){
        
        setBounds(500,200,650,500);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
        contentPane.setLayout(null);
        
        JLabel l1 = new JLabel("Username");
        l1.setFont(new Font("Tahoma",Font.BOLD,13));
        l1.setBounds(109,83,87,29);
        contentPane.add(l1);
        
        JLabel l2 = new JLabel("Name");
        l2.setFont(new Font("Tahoma",Font.BOLD,13));
        l2.setBounds(109,122,75,21);
        contentPane.add(l2);
        
        JLabel l3 = new JLabel("Your Security Question");
        l3.setFont(new Font("Tahoma",Font.BOLD,13));
        l3.setBounds(109,154,156,27);
        contentPane.add(l3);
        
        JLabel l4 = new JLabel("Answer");
        l4.setFont(new Font("Tahoma",Font.BOLD,13));
        l4.setBounds(109,192,104,21);
        contentPane.add(l4);
        
        JLabel l5 = new JLabel("Password");
        l5.setFont(new Font("Tahoma",Font.BOLD,13));
        l5.setBounds(109,224,104,21);
        contentPane.add(l5);
        
        tf1 = new JTextField();
        tf1.setFont(new Font("Tahoma",Font.BOLD,13));
        tf1.setForeground(new Color(105,105,105));
        tf1.setBounds(277,88,139,20);
        contentPane.add(tf1);
        tf1.setColumns(10);
        
        tf2 = new JTextField();
        tf2.setEditable(false);
        tf2.setFont(new Font("Tahoma",Font.BOLD,13));
        tf2.setForeground(new Color(165,42,42));
        tf2.setBounds(277,123,139,20);
        contentPane.add(tf2);
        tf2.setColumns(10);
        
        tf3 = new JTextField();
        tf3.setEditable(false);
        tf3.setFont(new Font("Tahoma",Font.BOLD,13));
        tf3.setForeground(new Color(72,61,139));
        tf3.setBounds(277,161,221,20);
        contentPane.add(tf3);
        tf3.setColumns(10);
        
        tf4 = new JTextField();
        tf4.setFont(new Font("Tahoma",Font.BOLD,13));
        tf4.setForeground(new Color(205,92,92));
        tf4.setBounds(277,193,139,20);
        contentPane.add(tf4);
        tf4.setColumns(10);
        
        tf5 = new JTextField();
        tf5.setEditable(false);
        tf5.setFont(new Font("Tahoma",Font.BOLD,13));
        tf5.setForeground(new Color(50,205,50));
        tf5.setBounds(277,225,139,20);
        contentPane.add(tf5);
        tf5.setColumns(10);
        
        b1 = new JButton("Search");
        b1.addActionListener(this);
        b1.setFont(new Font("Tahoma",Font.BOLD,12));
        b1.setBounds(428,83,80,29);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        contentPane.add(b1);
        
        b2 = new JButton("Retrieve");
        b2.addActionListener(this);
        b2.setFont(new Font("Tahoma",Font.BOLD,12));
        b2.setBounds(426,188,85,29);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        contentPane.add(b2);
        
        b3 = new JButton("Back");
        b3.addActionListener(this);
        b3.setFont(new Font("Tahoma",Font.BOLD,12));
        b3.setBounds(233,270,101,29);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        contentPane.add(b3);
        
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(139,69,19),2),"Forgot-Panel",
                        TitledBorder.LEADING,TitledBorder.TOP,null,new Color(178,34,34)));
        panel.setBounds(47,45,508,281);
        panel.setBackground(Color.WHITE);
        contentPane.add(panel);
        
    
        
            
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try{
                conn con = new conn();
                if(ae.getSource() == b1){
                    String sql = "select * from account where username = ?";
                    PreparedStatement st = con.c.prepareStatement(sql);
                    
                    st.setString(1,tf1.getText());
                    ResultSet rs = st.executeQuery();
                    
                    while(rs.next()){
                        tf2.setText(rs.getString("name"));
                        tf3.setText(rs.getString("sec_q"));
                    }
                    
                }
                if(ae.getSource() == b2){
                    String sql = "select * from account where sec_ans = ?";
                    PreparedStatement st = con.c.prepareStatement(sql);
                    
                    st.setString(1,tf4.getText());
                    ResultSet rs = st.executeQuery();
                    
                    while(rs.next()){
                        tf5.setText(rs.getString("Password"));
                    }
                }
                
                if(ae.getSource() == b3){
                    this.setVisible(false);
                    new Login_user().setVisible(true);
                }
            }catch(Exception e){
                
            }
    }
}
