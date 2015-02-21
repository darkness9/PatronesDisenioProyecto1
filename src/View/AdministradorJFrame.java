
package View;

import Controller.AlmacenistaDeNoticias;
import Controller.NoticiasData;
import Model.Noticia;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.SpringLayout;

/**
 * @author Gerardo Hernández, Hugo Daniel Cabrera
 */

/**
 * Clase que hereda de JFrame, es el contenedor donde se mostraran los Jpaneles relacionados con el administrador al igual que los metodos del panel  controlesadmin
 * que es el panel principal de la intefaz del admin
 */
public class AdministradorJFrame extends javax.swing.JFrame{

    //Los paneles se agregan como atributos al JFrame
    RemSuscriptorJPanel  remsuscriptorjpanel;
    AddSuscriptorJPanel   addsuscriptorjpanel;
    AddNoticiaJPanel         addnoticiajpanel;
    ControlesAdminJPanel controlesadminjpanel;
    ListaNoticiasJPanel  listadenoticiasjpanel;
    NoticiasData noticiasdata = new NoticiasData();
    AlmacenistaDeNoticias elalmacenista= new AlmacenistaDeNoticias();
    boolean controlfondo=false;
   
    
    //Se crea la referencia al panel base que trae el JFrame
    Container contenedor = getContentPane();
    SpringLayout layout = new SpringLayout();
    
    public AdministradorJFrame() {
        /*Configuración de la pantalla  principal*/
        setTitle("VENTANA DEL ADMINISTRADOR DE NOTICIAS");
        setSize(1140,600);
        setLocation(75,75);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contenedor.setLayout(layout);
        controlesadminjpanel= new ControlesAdminJPanel();
        listadenoticiasjpanel= new ListaNoticiasJPanel(controlfondo,440 );       
        layout.putConstraint(SpringLayout.WEST,listadenoticiasjpanel,710, SpringLayout.WEST,contenedor);                                             
        layout.putConstraint(SpringLayout.NORTH,listadenoticiasjpanel,120, SpringLayout.NORTH,contenedor); 
        contenedor.add(listadenoticiasjpanel);
        contenedor.add(controlesadminjpanel);
        addnoticiajpanel    = new AddNoticiaJPanel(noticiasdata,elalmacenista,listadenoticiasjpanel,this);
        
        //Se personalizan los eventos del controlesadminjpanel
        controlesadminjpanel.btn_addobserver.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                contenedor.removeAll();
                addsuscriptorjpanel = new AddSuscriptorJPanel(noticiasdata);
                layout.putConstraint(SpringLayout.WEST,addsuscriptorjpanel,220, SpringLayout.WEST,contenedor);
                layout.putConstraint(SpringLayout.NORTH,addsuscriptorjpanel,120, SpringLayout.NORTH,contenedor);
                layout.putConstraint(SpringLayout.WEST,listadenoticiasjpanel,710, SpringLayout.WEST,contenedor);                                                          
                layout.putConstraint(SpringLayout.NORTH,listadenoticiasjpanel,120, SpringLayout.NORTH,contenedor); 
                contenedor.add(addsuscriptorjpanel);
                 contenedor.add(listadenoticiasjpanel);
                contenedor.add(controlesadminjpanel);
                contenedor.repaint();
            }
        });
        
        controlesadminjpanel.btn_remObserver.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                contenedor.removeAll();
                remsuscriptorjpanel = new RemSuscriptorJPanel(noticiasdata);
                layout.putConstraint(SpringLayout.WEST,remsuscriptorjpanel,220, SpringLayout.WEST,contenedor);
                layout.putConstraint(SpringLayout.NORTH,remsuscriptorjpanel,120, SpringLayout.NORTH,contenedor);
                layout.putConstraint(SpringLayout.WEST,listadenoticiasjpanel,710, SpringLayout.WEST,contenedor);                       
                layout.putConstraint(SpringLayout.NORTH,listadenoticiasjpanel,120, SpringLayout.NORTH,contenedor); 
                contenedor.add(remsuscriptorjpanel);
                contenedor.add(listadenoticiasjpanel);
                contenedor.add(controlesadminjpanel);
                contenedor.repaint();
            }
        });
        
        controlesadminjpanel.btn_addnoticia.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                contenedor.removeAll();
                layout.putConstraint(SpringLayout.WEST,addnoticiajpanel,220, SpringLayout.WEST,contenedor);
                layout.putConstraint(SpringLayout.NORTH,addnoticiajpanel,120, SpringLayout.NORTH,contenedor);
                layout.putConstraint(SpringLayout.WEST,listadenoticiasjpanel,710, SpringLayout.WEST,contenedor);                                                                                                //****************************************************************************///By Huaca
                layout.putConstraint(SpringLayout.NORTH,listadenoticiasjpanel,120, SpringLayout.NORTH,contenedor);     
                contenedor.add(addnoticiajpanel);
                contenedor.add(listadenoticiasjpanel);
                contenedor.add(controlesadminjpanel);
                contenedor.repaint();
            }
        });        
    }     
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdministradorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministradorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministradorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministradorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministradorJFrame().setVisible(true);
            }
        });
    }
}
