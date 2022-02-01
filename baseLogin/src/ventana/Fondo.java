
package ventana;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class Fondo extends JPanel{
    
    private ImageIcon imagenFondo;
    
   @Override
   public void paint(Graphics g){
       imagenFondo= new ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"));
       g.drawImage(imagenFondo.getImage(), 0, 0,this.getWidth(),this.getHeight(), this);
       this.setOpaque(false);
       super.paint(g);
       
   }
}
