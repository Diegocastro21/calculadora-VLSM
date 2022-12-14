
package subnetapp;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;


public class ImagePanel extends javax.swing.JPanel {
    
    private Image BackgroundImage;
    
    public ImagePanel () {
    
    }
    
    public static void main(String[] args){
    
    
    }
    
    public Image getImage(){
    return this.BackgroundImage;
    }

   public void setImage(Image image){
   this.BackgroundImage = image;
   Dimension size = new Dimension(this.getWidth(), this.getHeight());
   this.setPreferredSize(size);
   this.setMinimumSize(size);
   this.setMaximumSize(size);
   this.setSize(size);
   this.setOpaque(false);
    }
    
    
    @Override
    protected void paintComponent(Graphics g) {
       if(this.BackgroundImage != null){
       g.drawImage(BackgroundImage, 0, 0, this.getWidth(), this.getHeight(), this);
       }
    }
    
    
}
