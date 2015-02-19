package View;

import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.SpringLayout;

/**
 * @author Gerardo Hernández, Hugo Daniel Cabrera
 */
public class SuscriptorJPanel extends javax.swing.JPanel{
    
    //Elementos de la interfáz//
    JLabel fondo_jpanel;

    public SuscriptorJPanel() {
        setPreferredSize(new Dimension(400,300));
        SpringLayout layoutpanelcontroles = new SpringLayout();
        this.setLayout(layoutpanelcontroles);
        
        //inicializacion de los elementos de la interfáz//
        fondo_jpanel = new JLabel();
        
        /*Se personaliza el fondo_jpanel*/
        fondo_jpanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo400x300.png")));
        
        this.add(fondo_jpanel);
    }
    
    
}
