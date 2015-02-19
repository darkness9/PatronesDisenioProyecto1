package View;

import java.awt.Container;
import java.util.Vector;
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
    public Vector loselementos=new Vector();
    public String titulo;
    
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
    loselementos=suscriptorpanel.loselementos;  
    contenedor.add(suscriptorpanel);
    
    } 
}
