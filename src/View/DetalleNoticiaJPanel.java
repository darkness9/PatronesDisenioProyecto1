package View;

import Model.Noticia;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SpringLayout;

/**
 * @author Gerardo Hernández, Hugo Daniel Cabrera
 */

/**
 * Clase  que heeda de JPanel y es encargada de desplegar el detallle de la noticia que el suscriptor selecciona en la lista
 * de noticias
 */
public class DetalleNoticiaJPanel extends JPanel{
    
    public JLabel leyenda_tituloNoticia;
    public JLabel leyenda_autorNoticia;
    public JLabel leyenda_unidadNoticia;
    public JLabel leyenda_areaNoticia;
    public JLabel leyenda_tipoNoticia;
    public JLabel leyenda_textoNoticia;
    public JLabel leyenda_fechaNoticia;
    public JButton cerrardetalle;
    JScrollPane elscroll;
    private JList listadenoticias;
    public DefaultListModel modelodelalista;
    private JLabel fondo_jpanel;
    

    public DetalleNoticiaJPanel(int alto) {
        fondo_jpanel = new JLabel();
        leyenda_tituloNoticia = new JLabel("Titulo Noticia");
        leyenda_autorNoticia  = new JLabel("Autor Noticia");
        leyenda_unidadNoticia = new JLabel("Unidad Noticia");
        leyenda_areaNoticia   = new JLabel("Area Noticia");
        leyenda_tipoNoticia   = new JLabel("Tipo Noticia");
        leyenda_textoNoticia  = new JLabel("Texto Noticia");
        leyenda_fechaNoticia  = new JLabel("Fecha Noticia");
        cerrardetalle = new JButton("Cerrar");
        setPreferredSize(new Dimension(395,alto));
        SpringLayout layoutdetallenoticia = new SpringLayout();
        this.setLayout(layoutdetallenoticia);
        modelodelalista = new DefaultListModel();
        listadenoticias = new JList(modelodelalista);
        
        //Atributos de los elementos
        listadenoticias.disable();
        listadenoticias.setFixedCellHeight(30);
        listadenoticias.setOpaque(false);
        listadenoticias.setBackground(new java.awt.Color(0,0,0,0));
        listadenoticias.setForeground(new java.awt.Color(241, 242, 235));
        listadenoticias.setFont(new java.awt.Font("MV Boli", 1, 12));
        elscroll = new JScrollPane(listadenoticias,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        elscroll.setPreferredSize(new Dimension(393,alto-30));
        elscroll.setOpaque(false);
        elscroll.getViewport().setOpaque(false);  
        elscroll.setBackground(new java.awt.Color(0,0,0,0));
        
        //Configuramos leyenda_tituloNoticia y deginimos las coordenadas x,y en que estará fija. 
        //leyenda_tituloNoticia.setText(lanoticiaseleccionada.getTituloNoticia());
        leyenda_tituloNoticia.setFont(new java.awt.Font("MV Boli", 1, 14));
        leyenda_tituloNoticia.setForeground(new java.awt.Color(241, 242, 235));
        modelodelalista.addElement(leyenda_tituloNoticia.getText());
        //Configuramos leyenda_autorNoticia y deginimos las coordenadas x,y en que estará fija.        
        leyenda_autorNoticia.setFont(new java.awt.Font("MV Boli", 1, 14));
        leyenda_autorNoticia.setForeground(new java.awt.Color(241, 242, 235));
        modelodelalista.addElement(leyenda_autorNoticia.getText());
        //Configuramos leyenda_unidadNoticia y deginimos las coordenadas x,y en que estará fija.        
        leyenda_unidadNoticia.setFont(new java.awt.Font("MV Boli", 1, 14));
        leyenda_unidadNoticia.setForeground(new java.awt.Color(241, 242, 235));
        modelodelalista.addElement(leyenda_unidadNoticia.getText());
        
        //Configuramos leyenda_areaNoticia y deginimos las coordenadas x,y en que estará fija.        
        leyenda_areaNoticia.setFont(new java.awt.Font("MV Boli", 1, 14));
        leyenda_areaNoticia.setForeground(new java.awt.Color(241, 242, 235));  
        modelodelalista.addElement(leyenda_areaNoticia.getText());
        
        //Configuramos leyenda_tipoNoticia y deginimos las coordenadas x,y en que estará fija.        
        leyenda_tipoNoticia.setFont(new java.awt.Font("MV Boli", 1, 14));
        leyenda_tipoNoticia.setForeground(new java.awt.Color(241, 242, 235));
        modelodelalista.addElement(leyenda_tipoNoticia.getText());
        
        //Configuramos leyenda_textoNoticia y deginimos las coordenadas x,y en que estará fija.        
        leyenda_textoNoticia.setFont(new java.awt.Font("MV Boli", 1, 14));
        leyenda_textoNoticia.setForeground(new java.awt.Color(241, 242, 235));
        modelodelalista.addElement(leyenda_textoNoticia.getText());
        
        //Configuramos leyenda_fechaNoticia y deginimos las coordenadas x,y en que estará fija.        
        leyenda_fechaNoticia.setFont(new java.awt.Font("MV Boli", 1, 14));
        leyenda_fechaNoticia.setForeground(new java.awt.Color(241, 242, 235));
        modelodelalista.addElement(leyenda_fechaNoticia.getText());
        
        //Configuramos el boton cerrar
        layoutdetallenoticia.putConstraint(SpringLayout.WEST,cerrardetalle,175, SpringLayout.WEST,this);
        layoutdetallenoticia.putConstraint(SpringLayout.NORTH,cerrardetalle,alto-30, SpringLayout.NORTH,this);
        
        this.add(cerrardetalle);
        this.add(elscroll);
        this.setOpaque(false);
        this.setBackground(new java.awt.Color(0,0,0,0));
        //fondo_jpanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo400x300.png")));
        this.add(fondo_jpanel); 
    }
}
