package View;

import Controller.NoticiasData;
import Controller.Suscriptor;
import java.awt.Container;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;
import javax.swing.SpringLayout;

/**
 * @author Gerardo Hernández, Hugo Daniel Cabrera
 */
public class SuscriptorJFrame extends javax.swing.JFrame{
    
    ListaNoticiasJPanel suscriptorpanel = new ListaNoticiasJPanel(true,270,null);
    //Se crea la referencia al panel base que trae el JFrame
    Container contenedor = getContentPane();
    SpringLayout layout = new SpringLayout();
    String nombresuscriptor;
    Suscriptor suscriptorobjeto;
    NoticiasData noticiasdata = new NoticiasData();
    
    public SuscriptorJFrame(String nombreusuario,String elfiltro,Suscriptor suscriptor) {
    
    /*Configuración de la pantalla  principal*/
    setTitle("SUSCRIPTOR: "+nombreusuario+" FILTRO: "+elfiltro);
    setSize(400,300);
    setLocation(600,75);
    setResizable(false);
    setVisible(true);
    this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    contenedor.setLayout(layout); 
    contenedor.add(suscriptorpanel);
    this.suscriptorobjeto=suscriptor;
    
    /*this.addWindowListener(new WindowListener() {

        @Override
        public void windowOpened(WindowEvent e) {
            
        }

        @Override
        public void windowClosing(WindowEvent e) {
            suscriptorobjeto.peticionRemover();
        }

        @Override
        public void windowClosed(WindowEvent e) {
            //System.out.println("You are the best");
        }
        @Override
        public void windowIconified(WindowEvent e) {
            
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            
        }

        @Override
        public void windowActivated(WindowEvent e) {
            
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            
        }
    });*/
    } 
    
    public void agregaElementoaLista(String noticia){
        suscriptorpanel.modelodelalista.addElement(noticia);
    }   
    
}
