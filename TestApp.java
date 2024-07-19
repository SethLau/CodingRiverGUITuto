import javax.swing.JOptionPane;




public class TestApp {

    
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog("How are you?");
        JOptionPane.showMessageDialog(null,str,"Greeting",0);
    }
    
}
