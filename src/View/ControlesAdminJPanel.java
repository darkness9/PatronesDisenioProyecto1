package View;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SpringLayout;

/**
 * @author Gerardo Hernández, Hugo Daniel Cabrera
 */
public class ControlesAdminJPanel extends javax.swing.JPanel {

    //Elementos de la interfáz//
    JLabel fondo_jpanel;
    JLabel titulo_ventana;
    JLabel leyenda_opciones;
    JPanel cuadrofalso;//Creo un objeto de la clase JPanel y lo utilizo como adorno de la interfaz
    JButton btn_addobserver;
    JButton btn_remObserver;
    JButton btn_addnoticia;
    JSeparator elseparador;
    JSeparator elseparador2;
      
    public ControlesAdminJPanel() {
        setBackground(new java.awt.Color(0, 0, 0,50));
        setPreferredSize(new Dimension(1140,600));
        SpringLayout layoutpanelcontroles = new SpringLayout();
        this.setLayout(layoutpanelcontroles);      
        
        //inicializacion de los elementos de la interfáz//
        fondo_jpanel = new JLabel();
        titulo_ventana = new JLabel("¡BIENVENIDO ADMINISTRADOR!");
        leyenda_opciones = new JLabel("Opciones disponibles");
        cuadrofalso = new JPanel();
        btn_addobserver = new JButton("Agregar suscriptor");
        btn_remObserver = new JButton("Eliminar suscritor");
        btn_addnoticia  = new JButton("Agregar noticia");
        elseparador = new JSeparator(JSeparator.VERTICAL);
        elseparador2 = new JSeparator(JSeparator.VERTICAL);
        
        //Configuramos titulo_ventana y deginimos las coordenadas x,y en que estará fija.
        titulo_ventana.setFont(new java.awt.Font("MV Boli", 1, 35));
        titulo_ventana.setForeground(new java.awt.Color(241, 242, 235));
        layoutpanelcontroles.putConstraint(SpringLayout.WEST,titulo_ventana,260, SpringLayout.WEST,this);
        layoutpanelcontroles.putConstraint(SpringLayout.NORTH,titulo_ventana,25, SpringLayout.NORTH,this);
        
        //Configuramos leyenda_opciones y deginimos las coordenadas x,y en que estará fija.
        leyenda_opciones.setFont(new java.awt.Font("MV Boli", 1, 15));
        leyenda_opciones.setForeground(new java.awt.Color(241, 242, 235));
        layoutpanelcontroles.putConstraint(SpringLayout.WEST,leyenda_opciones,25, SpringLayout.WEST,this);
        layoutpanelcontroles.putConstraint(SpringLayout.NORTH,leyenda_opciones,110, SpringLayout.NORTH,this);
        
        //Configuramos elseparador y deginimos las coordenadas x,y en que estará fija.
        elseparador.setPreferredSize(new java.awt.Dimension(10, 430));
        layoutpanelcontroles.putConstraint(SpringLayout.WEST,elseparador,178, SpringLayout.WEST,this);
        layoutpanelcontroles.putConstraint(SpringLayout.NORTH,elseparador,130, SpringLayout.NORTH,this);
        
        //Configuramos btn_addobserver y deginimos las coordenadas x,y en que estará fija.
        btn_addobserver.setPreferredSize(new Dimension(140, 30));
        layoutpanelcontroles.putConstraint(SpringLayout.WEST,btn_addobserver,25, SpringLayout.WEST,this);
        layoutpanelcontroles.putConstraint(SpringLayout.NORTH,btn_addobserver,160, SpringLayout.NORTH,this);
        
        //Configuramos btn_remObserver y deginimos las coordenadas x,y en que estará fija.
        btn_remObserver.setPreferredSize(new Dimension(140, 30));
        layoutpanelcontroles.putConstraint(SpringLayout.WEST,btn_remObserver,25, SpringLayout.WEST,this);
        layoutpanelcontroles.putConstraint(SpringLayout.NORTH,btn_remObserver,210, SpringLayout.NORTH,this);
        
        //Configuramos btn_addnoticia y deginimos las coordenadas x,y en que estará fija.//
        btn_addnoticia.setPreferredSize(new Dimension(140, 30));
        layoutpanelcontroles.putConstraint(SpringLayout.WEST,btn_addnoticia,25, SpringLayout.WEST,this);
        layoutpanelcontroles.putConstraint(SpringLayout.NORTH,btn_addnoticia,260, SpringLayout.NORTH,this);
        
        //Configuramos cuadrofalso y deginimos las coordenadas x,y en que estará fija./
        cuadrofalso.setBackground(new java.awt.Color(0,0,0,50));
        cuadrofalso.setPreferredSize(new Dimension(136,248));
        layoutpanelcontroles.putConstraint(SpringLayout.WEST,cuadrofalso,28, SpringLayout.WEST,this);
        layoutpanelcontroles.putConstraint(SpringLayout.NORTH,cuadrofalso,310, SpringLayout.NORTH,this);
        
        //Configuramos elseparador2 y definimos las coordenadas x,y en que estará fija.                      
        elseparador2.setPreferredSize(new java.awt.Dimension(10, 430));                                     
        layoutpanelcontroles.putConstraint(SpringLayout.WEST,elseparador2,690, SpringLayout.WEST,this);     
        layoutpanelcontroles.putConstraint(SpringLayout.NORTH,elseparador2,130, SpringLayout.NORTH,this); 
        
        /*Se personaliza el fondo_jpanel*/
        fondo_jpanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo1140x600.png")));
        
        this.add(titulo_ventana);
        this.add(leyenda_opciones);
        this.add(elseparador);
        this.add(elseparador2);
        this.add(btn_addobserver);
        this.add(btn_remObserver);
        this.add(btn_addnoticia);
        this.add(cuadrofalso);
        this.add(fondo_jpanel);
        
    }
    
    /*public void refrescaPantalla(){
       /this.removeAll();
        this.add(titulo_ventana);
        this.add(leyenda_opciones);
        this.add(elseparador);
        this.add(elseparador2);
        this.add(btn_addobserver);
        this.add(btn_remObserver);
        this.add(btn_addnoticia);
        this.add(cuadrofalso);
        this.add(panelDeNoticias);
        this.add(fondo_jpanel);
               
        this.removeAll();
        this.add(panelDeNoticias);
        this.add(btn_addnoticia);
        this.repaint();
    }*/
    
}
