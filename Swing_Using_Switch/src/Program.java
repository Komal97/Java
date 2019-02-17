import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class MyFrame extends JFrame implements ActionListener{        //JFrame is a class
                                                               //ActionListener is an interface
    MyFrame(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,450);
        setTitle("MY FRAME");
        setLocationRelativeTo(null);
        loadButton();
        setVisible(true);
    }
    
    void loadButton(){
        
        JButton b1=new JButton("North");
        b1.setActionCommand("North");
        b1.addActionListener(this);
        add(b1,BorderLayout.NORTH);
        
        JButton b2=new JButton("South");
        b2.setActionCommand("South");
        b2.addActionListener(this);
        add(b2,BorderLayout.SOUTH);
        
        JButton b3=new JButton("East");
        b3.setActionCommand("East");
        b3.addActionListener(this);
        add(b3,BorderLayout.EAST);
        
        JButton b4=new JButton("West");
        b4.setActionCommand("West");
        b4.addActionListener(this);
        add(b4,BorderLayout.WEST);
        
        JButton b5=new JButton("Centre");
        b5.setActionCommand("Centre");
        b5.addActionListener(this);
        add(b5);
    }
    
    public void actionPerformed(ActionEvent ae){
        switch(ae.getActionCommand()){
            case "North" :
                JOptionPane.showMessageDialog(null,"Welcome To North");break;
                
            case "South" :
                JOptionPane.showMessageDialog(null,"Welcome To South");break;
                
            case "East" :
                JOptionPane.showMessageDialog(null,"Welcome To East");break;
                
            case "West" :
                JOptionPane.showMessageDialog(null,"Welcome To West");break;
            
            case "Centre" :
                JOptionPane.showMessageDialog(null,"Welcome To Centre");break;
        }
    }
}

public class Program {
    public static void main(String[] args) {
      
     MyFrame mf=new MyFrame();        
   }
}
