
package View;

import Controller.AlmacenistaDeNoticias;
import Controller.NoticiasData;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.SpringLayout;

/**
 * @author Gerardo Hernández, Hugo Daniel Cabrera
 */
public class AdministradorJFrame extends javax.swing.JFrame{

    //Los paneles se agregan como atributos al JFrame
    RemSuscriptorJPanel  panelRemSuscriptor;
    AddSuscriptorJPanel  panelAddSuscriptor;
    AddNoticiaJPanel     panelAddNoticia;
    ControlesAdminJPanel panelControlesAdmin;
    NoticiasData noticiasdata = new NoticiasData();
    AlmacenistaDeNoticias elalmacenista= new AlmacenistaDeNoticias();
    
    //Se crea la referencia al panel base que trae el JFrame
    Container contenedor = getContentPane();
    SpringLayout layout = new SpringLayout();
    
    public AdministradorJFrame() {
        /*Configuración de la pantalla  principal*/
        setTitle("VENTANA DEL ADMINISTRADOR DE NOTICIAS");
        setSize(700,600);
        setLocation(350,75);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contenedor.setLayout(layout);
        panelControlesAdmin= new ControlesAdminJPanel();
        contenedor.add(panelControlesAdmin);
        
        //Se personalizan los eventos del panelControlesAdmin
        panelControlesAdmin.btn_addobserver.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                contenedor.removeAll();
                panelAddSuscriptor = new AddSuscriptorJPanel(noticiasdata);
                layout.putConstraint(SpringLayout.WEST,panelAddSuscriptor,220, SpringLayout.WEST,contenedor);
                layout.putConstraint(SpringLayout.NORTH,panelAddSuscriptor,120, SpringLayout.NORTH,contenedor);
                contenedor.add(panelAddSuscriptor);
                contenedor.add(panelControlesAdmin);
                contenedor.repaint();
            }
        });
        
        panelControlesAdmin.btn_remObserver.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                contenedor.removeAll();
                panelRemSuscriptor = new RemSuscriptorJPanel(noticiasdata);
                layout.putConstraint(SpringLayout.WEST,panelRemSuscriptor,220, SpringLayout.WEST,contenedor);
                layout.putConstraint(SpringLayout.NORTH,panelRemSuscriptor,120, SpringLayout.NORTH,contenedor);
                contenedor.add(panelRemSuscriptor);
                contenedor.add(panelControlesAdmin);
                contenedor.repaint();
            }
        });
        
        panelControlesAdmin.btn_addnoticia.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                contenedor.removeAll();
                panelAddNoticia    = new AddNoticiaJPanel(noticiasdata,elalmacenista);
                layout.putConstraint(SpringLayout.WEST,panelAddNoticia,220, SpringLayout.WEST,contenedor);
                layout.putConstraint(SpringLayout.NORTH,panelAddNoticia,120, SpringLayout.NORTH,contenedor);
                contenedor.add(panelAddNoticia);
                contenedor.add(panelControlesAdmin);
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
