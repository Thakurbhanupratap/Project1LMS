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

public class ReadMe extends JFrame{
    
    private JPanel contentPane;

        public static void main(String[] args) {
            new ReadMe().setVisible(true);			
	}
    public ReadMe(){
        super("Read Me - Tech Phantom BPS");
            setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ram\\Desktop\\rohit.jpg"));
           setBackground(new Color(173, 216, 230));
           setBackground(Color.WHITE);
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
            l1.setBackground(Color.WHITE);
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
            
            JTextArea l10 = new JTextArea("Library management system is a project which aims in\ndeveloping a computerized "
                    + "system to maintain all the \ndaily work of a library. The system helps both students\nand library "
                    + "manager to keep a constant track of all the \nbooks available in the library. It allows both the"
                    + "admin \nand the student to search for the desired book.");
            l10.setFont(new Font("Trebuchet MS",Font.BOLD,20));
            l10.setBounds(50,270,600,150);
            l10.setBackground(Color.LIGHT_GRAY);
            contentPane.add(l10);
            
            
    }
}
