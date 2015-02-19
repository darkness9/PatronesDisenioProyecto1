package View;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.SpringLayout;

/**
 * @author Gerardo Hernández, Hugo Daniel Cabrera
 */
public class SuscriptorJFrame extends javax.swing.JFrame{
    
    SuscriptorJPanel suscriptorpanel;
    //Se crea la referencia al panel base que trae el JFrame
    Container contenedor = getContentPane();
    SpringLayout layout = new SpringLayout();
    
    public SuscriptorJFrame(String nombresuscriptor) {
    
    /*Configuración de la pantalla  principal*/
    setTitle("VENTANA SUSCRIPTOR "+nombresuscriptor);
    setSize(400,300);
    setLocation(700,75);
    setResizable(false);
    setVisible(true);
    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    contenedor.setLayout(layout);
    suscriptorpanel = new SuscriptorJPanel();
    contenedor.add(suscriptorpanel);
    
    } 
}
