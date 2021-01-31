package employee.management.system;
import java.awt.*;
import javax.swing.*;
import java.lang.Thread;
import java.awt.event.*;

public class Front_page implements ActionListener{
    JFrame f; 
    JLabel id,l1;
    JButton b;
//everything in the constructor
    Front_page(){
 
        f=new JFrame("Employee Management System");
        //f.setBackground(Color.red);
        f.setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("employee/icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200,700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        //you can have only imageicon in a jlabel not an image
        
        l1.setBounds(0,150,1360,530);
        //x axis, y axis, length, breadth
        f.add(l1);


        b = new JButton("CLICK HERE TO CONTINUE");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        

        b.setBounds(500,600,300,70);
        b.addActionListener(this);

        id=new JLabel();
        id.setBounds(0,0,1360,750);
        id.setLayout(null);
        
   

        JLabel lid=new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        lid.setBounds(80,30,1600,100);
        lid.setFont(new Font("raleway",Font.BOLD,60));
        lid.setForeground(Color.red);
        id.add(lid);
//layering is as follows
        id.add(b);
        f.add(id);
        
        
        f.getContentPane().setBackground(Color.BLACK);

        f.setVisible(true);
        f.setSize(1360,750);
        f.setLocation(200,100);
//blinking for 500ms
        while(true){
            lid.setVisible(false); // lid =  j label
            try{
                Thread.sleep(500); //1000 = 1 second
            }catch(Exception e){} 
            lid.setVisible(true);
            try{
                Thread.sleep(500);
            }catch(Exception e){}
        }

    }
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b){
            f.setVisible(false);
            new login();    
        }
    }

    public static void main(String[] arg){
        Front_page f = new Front_page();
    }
}
