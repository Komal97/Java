import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

class MyFrame extends JFrame{
    
    /*MyFrame(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,250);
        setLocationRelativeTo(null);
        setTitle("My First Frame");
        loadButton();
        setVisible(true);        
    }
    
    void loadButton(){
        JButton b1=new JButton("North");
        add(b1,BorderLayout.NORTH);                 //add function defined in JFrame
        
        JButton b2=new JButton("South");
        add(b2,BorderLayout.SOUTH);
        
        JButton b3=new JButton("East");
        add(b3,BorderLayout.EAST);
        
        JButton b4=new JButton("West");
        add(b4,BorderLayout.WEST);
        
        JButton b5=new JButton("Centre");
        add(b5);
    }*/
}

public class Program {
    public static void main(String[] args) {
      MyFrame mf=new MyFrame();
      Program pp=new Program();
      // new MyFrame();
       
       mf.setDefaultCloseOperation(EXIT_ON_CLOSE);
       mf.setSize(400,250);
       mf.setLocationRelativeTo(null);
       mf.setTitle("My First Frame");
       
     /* JButton b1=new JButton("North");
        add(b1,BorderLayout.NORTH);                 //add function defined in JFrame
        
        JButton b2=new JButton("South");
        add(b2,BorderLayout.SOUTH);
        
        JButton b3=new JButton("East");
        add(b3,BorderLayout.EAST);
        
        JButton b4=new JButton("West");
        add(b4,BorderLayout.WEST);
        
        JButton b5=new JButton("Centre");
        add(b5);
     */
     
       pp.loadButton(mf);
       mf.setVisible(true);        
    }
    
    void loadButton(JFrame jf){
        JButton b1=new JButton("North");
        jf.add(b1,BorderLayout.NORTH);                 //add function defined in JFrame
        
        JButton b2=new JButton("South");
        jf.add(b2,BorderLayout.SOUTH);
        
        JButton b3=new JButton("East");
        jf.add(b3,BorderLayout.EAST);
        
        JButton b4=new JButton("West");
        jf.add(b4,BorderLayout.WEST);
        
        JButton b5=new JButton("Centre");
        jf.add(b5);
    }
    
}
