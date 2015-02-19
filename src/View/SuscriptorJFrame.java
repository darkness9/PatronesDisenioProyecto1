package View;

import Controller.NoticiasData;
import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.SpringLayout;

/**
 * @author Gerardo Hernández, Hugo Daniel Cabrera
 */
public class SuscriptorJFrame extends javax.swing.JFrame{
    
    SuscriptorJPanel suscriptorpanel = new SuscriptorJPanel();
    //Se crea la referencia al panel base que trae el JFrame
    Container contenedor = getContentPane();
    SpringLayout layout = new SpringLayout();
    String nombresuscriptor;
    NoticiasData noticiasdataremobs = new NoticiasData();
    
    public SuscriptorJFrame(String nombreusuario,String elfiltro) {
    
    /*Configuración de la pantalla  principal*/
    setTitle("SUSCRIPTOR: "+nombreusuario+" FILTRO: "+elfiltro);
    setSize(600,300);
    setLocation(600,75);
    setResizable(false);
    setVisible(true);
    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    contenedor.setLayout(layout); 
    contenedor.add(suscriptorpanel);
    
    } 
    
    public void agregaElemento(String titulo){
        suscriptorpanel.modelodelalista.addElement(titulo);
    }
    
    
}
