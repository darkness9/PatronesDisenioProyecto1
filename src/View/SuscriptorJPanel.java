package View;

import java.awt.Dimension;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.SpringLayout;

/**
 * @author Gerardo Hernández, Hugo Daniel Cabrera
 */
public class SuscriptorJPanel extends javax.swing.JPanel{
    
    //Elementos de la interfáz//
    private JLabel fondo_jpanel;
    private JList listadenoticias;
    private JScrollPane elscroll;
    public DefaultListModel modelodelalista;

    public SuscriptorJPanel() {
        setPreferredSize(new Dimension(600,300));
        SpringLayout layoutpanelcontroles = new SpringLayout();
        this.setLayout(layoutpanelcontroles);
        
        //inicializacion de los elementos de la interfáz//
        fondo_jpanel = new JLabel();
        modelodelalista = new DefaultListModel();
        listadenoticias = new JList(modelodelalista);
        
        //Atributos de los elementos
        listadenoticias.setOpaque(false);
        listadenoticias.setBackground(new java.awt.Color(0,0,0,0));
        listadenoticias.setForeground(new java.awt.Color(241, 242, 235));
        listadenoticias.setFont(new java.awt.Font("MV Boli", 1, 12));
        elscroll = new JScrollPane();
        elscroll.setPreferredSize(new Dimension(600,300));
        elscroll.setOpaque(false);
        elscroll.getViewport().setOpaque(false);
        elscroll.setViewportView(listadenoticias);
        
        //Se personaliza el fondo_jpanel
        fondo_jpanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo600x300.png")));
        
        //Se agregan los alementos al panel
        this.add(elscroll);
        this.add(fondo_jpanel);        
    }
    
    
}
