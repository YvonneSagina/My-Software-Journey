import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToDo{ 
    
    public static void main(String[] args) {

        //initialize
        JButton refresh = new JButton("Refresh");
        JFrame fr1 = new JFrame();
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();
        JPanel panel11 = new JPanel();
        JPanel panel12 = new JPanel();
        JPanel panel13 = new JPanel();
        JPanel panel14 = new JPanel();
        JPanel panel15 = new JPanel();
        ImageIcon logo = new ImageIcon("Todo.png");
        JLabel Monday = new JLabel("Monday");
        JLabel Tuesday = new JLabel("Tuesday");
        JLabel Wednesday = new JLabel("Wednesday");
        JLabel Thursday = new JLabel("Thursday");
        JLabel Friday = new JLabel("Friday");
        JLabel Saturday = new JLabel("Saturday");
        JLabel Sunday = new JLabel("Sunday");
        JCheckBox check1 = new JCheckBox();
        JCheckBox check2 = new JCheckBox();
        JCheckBox check3 = new JCheckBox();
        JCheckBox check4 = new JCheckBox();
        JCheckBox check5 = new JCheckBox();
        JCheckBox check6 = new JCheckBox();
        JCheckBox check7 = new JCheckBox();
        JCheckBox check8 = new JCheckBox();
        JCheckBox check9 = new JCheckBox();
        JCheckBox check10 = new JCheckBox();
        JCheckBox check11 = new JCheckBox();
        JCheckBox check12 = new JCheckBox();
        JCheckBox check13 = new JCheckBox();
        JCheckBox check14 = new JCheckBox();
        JTextField text1 = new JTextField(38);
        JTextField text2 = new JTextField(38);
        JTextField text3 = new JTextField(38);
        JTextField text4 = new JTextField(38);
        JTextField text5 = new JTextField(38);
        JTextField text6 = new JTextField(38);
        JTextField text7 = new JTextField(38);
        JTextField text8 = new JTextField(38);
        JTextField text9 = new JTextField(38);
        JTextField text10 = new JTextField(38);
        JTextField text11 = new JTextField(38);
        JTextField text12 = new JTextField(38);
        JTextField text13 = new JTextField(38);
        JTextField text14 = new JTextField(38);

        //How the frame will look
        fr1.setSize(700, 700);
        fr1.setTitle("ToDo List");//sets the title of the page
        fr1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//close operation not that its jframe and not fr1
        //DO_NOTHING_ON_CLOSE - This literally does nothing when you hit x
        //HIDE_ON_CLOSE - This is what the default usually is which is why if you don't specify exitonclose it just seems as if you've cancelled but in reality its still running ut just in the background
        //fr1.setResizable(false);// this will ensure the window size cannot be altered with
        //fr1.getContentPane().setBackground(Color.blue);//getContentPane returns the main are of the jframe
        fr1.getContentPane().setBackground(new Color(212, 70, 100));//customize the color
        fr1.setIconImage(logo.getImage());//this sets the logo of the page

        //panel
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        //panel ya Monday
        panel2.setLayout(new FlowLayout());
        panel3.setLayout(new FlowLayout());
        panel.add(Monday);
        panel.add(Box.createVerticalStrut(5));// for padding
        panel2.add(check1);
        panel2.add(text1);
        panel3.add(check2);
        panel3.add(text2);
        panel.add(panel2);
        panel.add(panel3); 
        panel.add(Box.createVerticalStrut(5));

        //panel ya Tuesday
        panel4.setLayout(new FlowLayout());
        panel5.setLayout(new FlowLayout());
        panel.add(Tuesday);
        panel.add(Box.createVerticalStrut(5));
        panel4.add(check3);
        panel4.add(text3);
        panel5.add(check4);
        panel5.add(text4);
        panel.add(panel4);
        panel.add(panel5);
        panel.add(Box.createVerticalStrut(5));

        //panel ya Wednesday
        panel6.setLayout(new FlowLayout());
        panel7.setLayout(new FlowLayout());
        panel.add(Wednesday);
        panel.add(Box.createVerticalStrut(5));
        panel6.add(check5);
        panel6.add(text5);
        panel7.add(check6);
        panel7.add(text6);
        panel.add(panel6);
        panel.add(panel7);
        panel.add(Box.createVerticalStrut(5));

        //panel ya Thursday
        panel8.setLayout(new FlowLayout());
        panel9.setLayout(new FlowLayout());
        panel.add(Thursday);
        panel.add(Box.createVerticalStrut(5));
        panel8.add(check7);
        panel8.add(text7);
        panel9.add(check8);
        panel9.add(text8);
        panel.add(panel8);
        panel.add(panel9);
        panel.add(Box.createVerticalStrut(5));

        //panel ya Friday
        panel10.setLayout(new FlowLayout());
        panel11.setLayout(new FlowLayout());
        panel.add(Friday);
        panel.add(Box.createVerticalStrut(5));
        panel10.add(check9);
        panel10.add(text9);
        panel11.add(check10);
        panel11.add(text10);
        panel.add(panel10);
        panel.add(panel11);
        panel.add(Box.createVerticalStrut(5));

        //panel ya Saturday
        panel12.setLayout(new FlowLayout());
        panel13.setLayout(new FlowLayout());
        panel.add(Saturday);
        panel.add(Box.createVerticalStrut(5));
        panel12.add(check11);
        panel12.add(text11);
        panel13.add(check12);
        panel13.add(text12);
        panel.add(panel12);
        panel.add(panel13);
        panel.add(Box.createVerticalStrut(5));

        //panel ya Sunday
        panel14.setLayout(new FlowLayout());
        panel15.setLayout(new FlowLayout());
        panel.add(Sunday);
        panel.add(Box.createVerticalStrut(5));
        panel14.add(check13);
        panel14.add(text13);
        panel15.add(check14);
        panel15.add(text14);
        panel.add(panel14);
        panel.add(panel15);
        panel.add(Box.createVerticalStrut(5));
        panel.add(refresh);

        //Refresh Button
        

        //add Things to the frame
        fr1.add(panel);
        fr1.setVisible(true);//sets the frame to be visible

    
    refresh.addActionListener(new ActionListener() {
        @Override
            public void actionPerformed(ActionEvent e) {
                fr1.dispose();
            }
        });
 }
}
