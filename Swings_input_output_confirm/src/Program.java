import javax.swing.JOptionPane;

public class Program {
    public static void main(String[] args) {
        // TODO code application logic here
        
        //int result=JOptionPane.showConfirmDialog(null,"Are you sure to Exit ??");
        
        int result=JOptionPane.showConfirmDialog(null,"Are you sure to Exit?",
                                                  "My Question",JOptionPane.YES_NO_OPTION);
        
        switch(result){
            case JOptionPane.YES_OPTION :
                JOptionPane.showMessageDialog(null,"OK we do..");
                break;
                
            case JOptionPane.NO_OPTION :
                JOptionPane.showMessageDialog(null,"OK we do not..");
                break;
                
            case JOptionPane.CANCEL_OPTION :
                JOptionPane.showMessageDialog(null,"OK we cancel it..");
        }
    }
    
}
