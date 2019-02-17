import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class MyFrame extends JFrame{
    
   MyFrame(){
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setSize(500,350);
       setTitle("My First Frame");
       setLocationRelativeTo(null);
       loadButton();
       setVisible(true);
    }
   void loadButton(){
       JButton b1=new JButton("North");
       b1.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null,"North Button Clicked...");
        }
       });
       add(b1,BorderLayout.NORTH);
       
       JButton b2=new JButton("South");
       b2.addActionListener(new ActionListener(){
       @Override
       public void actionPerformed(ActionEvent e){
           JOptionPane.showMessageDialog(null,"South Button Clicked...");
        }
       });
       add(b2,BorderLayout.SOUTH);
       
       JButton b3=new JButton("East");
       b3.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               JOptionPane.showMessageDialog(null,"East Button Clicked...");
           }
       });
       add(b3,BorderLayout.EAST);
       
       JButton b4=new JButton("West");
       b4.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               JOptionPane.showMessageDialog(null,"West Button Clicked...");
           }
       });
       add(b4,BorderLayout.WEST);
       
       JButton b5=new JButton("Centre");
       b5.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               JOptionPane.showMessageDialog(null,"Centre Button Clicked...");
           }
       });
       add(b5);
   }
}


public class Program {
    public static void main(String[] args) {
       
        MyFrame mf=new MyFrame();
    }
    
}
