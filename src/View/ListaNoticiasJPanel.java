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
public class ListaNoticiasJPanel extends javax.swing.JPanel{
    
    //Elementos de la interfáz//
    private JLabel fondo_jpanel;
    private JList listadenoticias;
    private JScrollPane elscroll;
    public DefaultListModel modelodelalista;
    AdministradorJFrame adminjframe;
    boolean controlfondo;

    public ListaNoticiasJPanel(boolean controlfondo,int alto,AdministradorJFrame adminjframe) {
        setPreferredSize(new Dimension(393,alto));
        SpringLayout layoutpanelcontroles = new SpringLayout();
        this.setLayout(layoutpanelcontroles);
        this.controlfondo=controlfondo;
        this.adminjframe=adminjframe;
        //inicializacion de los elementos de la interfáz//
        fondo_jpanel = new JLabel();
        modelodelalista = new DefaultListModel();
        listadenoticias = new JList(modelodelalista);
        
        //Atributos de los elementos
        listadenoticias.setOpaque(false);
        listadenoticias.setBackground(new java.awt.Color(0,0,0,0));
        listadenoticias.setForeground(new java.awt.Color(241, 242, 235));
        listadenoticias.setFont(new java.awt.Font("MV Boli", 1, 12));
        elscroll = new JScrollPane(listadenoticias,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        elscroll.setPreferredSize(new Dimension(393,alto));
        elscroll.setOpaque(false);
        elscroll.getViewport().setOpaque(false);     
         
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
