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
import javax.swing.border.*;
import java.awt.event.*;
public class AboutUs extends JFrame implements ActionListener{
    
    private JPanel contentPane;

        public static void main(String[] args) {
            new AboutUs().setVisible(true);			
	}
    
        public AboutUs() {
            
            super("About Us - Tech Phantom BPS");
            setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ram\\Desktop\\rohit.jpg"));
            setBackground(new Color(173, 216, 230));
            setBounds(350, 150, 700, 500);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel l1 = new JLabel("New label");
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/logo.png"));
            Image i2 = i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l1 = new JLabel(i3);
            l1.setBounds(500, 40, 100, 100);
            contentPane.add(l1);


            JLabel l3 = new JLabel("Library");
            l3.setForeground(new Color(0, 250, 154));
            l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l3.setBounds(160, 40, 150, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("Mangement System");
            l4.setForeground(new Color(127, 255, 0));
            l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l4.setBounds(70, 90, 405, 40);
            contentPane.add(l4);

            JLabel l5 = new JLabel("v3.9");
            l5.setForeground(new Color(30, 144, 255));
            l5.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
            l5.setBounds(185, 140, 100, 21);
            contentPane.add(l5);


            JLabel l6 = new JLabel("Developed By : Bhanu Pratap Singh &");
            l6.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
            l6.setBounds(55, 198, 600, 35);
            contentPane.add(l6);
            
             JLabel l9 = new JLabel( "Apporv Verma"
                    );
            l9.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
            l9.setBounds(270, 230, 600, 35);
            contentPane.add(l9);

            JLabel l7 = new JLabel("Contact Us : mrstark.00003@gmail.com");
            l7.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l7.setBounds(70, 260, 600, 50);
            contentPane.add(l7);

            JLabel l8 = new JLabel("Subscribe me on Youtube : Tech Phantom BPS");
            l8.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l8.setBounds(70, 290, 600, 34);
            contentPane.add(l8);

            JLabel l10 = new JLabel("**We are RKGITAN and this is our first projrct.**");
            l10.setForeground(new Color(47, 79, 79));
            l10.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
            l10.setBounds(70, 330, 600, 34);
            contentPane.add(l10);
            
            JButton b1 = new JButton("back");
            b1.addActionListener(this);
            b1.setBounds(443, 395, 105, 29);
            b1.setBackground(Color.BLACK);
            b1.setForeground(Color.WHITE);
            contentPane.add(b1);
                
                
            contentPane.setBackground(Color.WHITE);
	}
        
        public void actionPerformed(ActionEvent ae){
            this.setVisible(false);
            new Home().setVisible(true);
        }
}
