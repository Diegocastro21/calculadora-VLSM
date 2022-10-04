
package subnetapp;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class SubNetApp {

  
    public static void main(String[] args) {
        // TODO code application logic here
         Starting star = new Starting();
         star.setIconImage(new ImageIcon("subnetIcon.png").getImage());
        
        star.setVisible(true);
        star.pack();
        star.setLocationRelativeTo(null);
        star.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }
    
}
