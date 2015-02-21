package View;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.SpringLayout;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * @author Gerardo Hernández, Hugo Daniel Cabrera
 */

/**
 * Clase que hedera de JPanel y tiene como funcion mostrar las noticias corespondientes en una lista
 * para hacerlas visibles al administrador o al suscriptor
 */
public class ListaNoticiasJPanel extends javax.swing.JPanel{
    
    //Elementos de la interfáz//
    private JLabel fondo_jpanel;
    public JList listadenoticias;
    private JScrollPane elscroll;
    public DefaultListModel modelodelalista;
    boolean controlfondo;

    public ListaNoticiasJPanel(boolean controlfondo,int alto) {
        setPreferredSize(new Dimension(393,alto));
        SpringLayout layoutlistanoticias = new SpringLayout();
        this.setLayout(layoutlistanoticias);
        this.controlfondo=controlfondo;
        //inicializacion de los elementos de la interfáz//
        fondo_jpanel = new JLabel();
        modelodelalista = new DefaultListModel();
        listadenoticias = new JList(modelodelalista);
        //detallenoticiajpanel = new DetalleNoticiaJPanel(270);
        
        //Atributos de los elementos
        listadenoticias.setOpaque(false);
        listadenoticias.setBackground(new java.awt.Color(0,0,0,0));
        listadenoticias.setForeground(new java.awt.Color(241, 242, 235));
        listadenoticias.setFont(new java.awt.Font("MV Boli", 1, 12));
        elscroll = new JScrollPane(listadenoticias,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        elscroll.setPreferredSize(new Dimension(393,alto));
        elscroll.setOpaque(false);
        elscroll.getViewport().setOpaque(false);     
        elscroll.setBackground(new java.awt.Color(0,0,0,0));
        
        //Se agregan los alementos al panel
        this.add(elscroll);
        if(controlfondo==true){
            //Se personaliza el fondo_jpanel
            fondo_jpanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo400x300.png")));
             this.add(fondo_jpanel); 
        }else{
            this.setOpaque(false);//Sin esta linea al poner el fondo transparente se altera el repintar
            this.setBackground(new java.awt.Color(0,0,0,0));
        }
    }
}
