package View;

import Controller.NoticiasData;
import Controller.Suscriptor;
import java.awt.Container;
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
    } 
    
    public void agregaElementoaLista(String noticia){
        suscriptorpanel.modelodelalista.addElement(noticia);
    }   
    
}
