package View;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

/**
 * @author Gerardo Hernández, Hugo Daniel Cabrera
 */

/**
 * Clase  que heeda de JPanel y es encargada de desplegar el detallle de la noticia que el suscriptor selecciona en la lista
 * de noticias
 */
public class DetalleNoticiaJPanel extends JPanel{
    
    JLabel leyenda_tituloNoticia;
    JLabel leyenda_autorNoticia;
    JLabel leyenda_unidadNoticia;
    JLabel leyenda_areaNoticia;
    JLabel leyenda_tipoNoticia;
    JLabel leyenda_textoNoticia;
    JLabel leyenda_fechaNoticia;

    public DetalleNoticiaJPanel() {
        leyenda_tituloNoticia = new JLabel("Titulo Noticia");
        leyenda_autorNoticia  = new JLabel("Autor Noticia");
        leyenda_unidadNoticia = new JLabel("Unidad Noticia");
        leyenda_areaNoticia   = new JLabel("Area Noticia");
        leyenda_tipoNoticia   = new JLabel("Tipo Noticia");
        leyenda_textoNoticia  = new JLabel("Texto Noticia");
        leyenda_fechaNoticia  = new JLabel("Fecha Noticia");
        setPreferredSize(new Dimension(395,272));
        setBackground(Color.red);
        
        SpringLayout layoutpaneladdnot = new SpringLayout();
        this.setLayout(layoutpaneladdnot);
        
        //Configuramos leyenda_tituloNoticia y deginimos las coordenadas x,y en que estará fija. 
        leyenda_tituloNoticia.setFont(new java.awt.Font("MV Boli", 1, 14));
        leyenda_tituloNoticia.setForeground(new java.awt.Color(241, 242, 235));
        layoutpaneladdnot.putConstraint(SpringLayout.WEST,leyenda_tituloNoticia,5, SpringLayout.WEST,this);
        layoutpaneladdnot.putConstraint(SpringLayout.NORTH,leyenda_tituloNoticia,5, SpringLayout.NORTH,this);
        
        //Configuramos leyenda_autorNoticia y deginimos las coordenadas x,y en que estará fija.        
        leyenda_autorNoticia.setFont(new java.awt.Font("MV Boli", 1, 14));
        leyenda_autorNoticia.setForeground(new java.awt.Color(241, 242, 235));
        layoutpaneladdnot.putConstraint(SpringLayout.WEST,leyenda_autorNoticia,5, SpringLayout.WEST,this);
        layoutpaneladdnot.putConstraint(SpringLayout.NORTH,leyenda_autorNoticia,45, SpringLayout.NORTH,this);
        
        //Configuramos leyenda_unidadNoticia y deginimos las coordenadas x,y en que estará fija.        
        leyenda_unidadNoticia.setFont(new java.awt.Font("MV Boli", 1, 14));
        leyenda_unidadNoticia.setForeground(new java.awt.Color(241, 242, 235));
        layoutpaneladdnot.putConstraint(SpringLayout.WEST,leyenda_unidadNoticia,5, SpringLayout.WEST,this);
        layoutpaneladdnot.putConstraint(SpringLayout.NORTH,leyenda_unidadNoticia,85, SpringLayout.NORTH,this);
        
        //Configuramos leyenda_areaNoticia y deginimos las coordenadas x,y en que estará fija.        
        leyenda_areaNoticia.setFont(new java.awt.Font("MV Boli", 1, 14));
        leyenda_areaNoticia.setForeground(new java.awt.Color(241, 242, 235));
        layoutpaneladdnot.putConstraint(SpringLayout.WEST,leyenda_areaNoticia,5, SpringLayout.WEST,this);
        layoutpaneladdnot.putConstraint(SpringLayout.NORTH,leyenda_areaNoticia,125, SpringLayout.NORTH,this);
        
        //Configuramos leyenda_tipoNoticia y deginimos las coordenadas x,y en que estará fija.        
        leyenda_tipoNoticia.setFont(new java.awt.Font("MV Boli", 1, 14));
        leyenda_tipoNoticia.setForeground(new java.awt.Color(241, 242, 235));
        layoutpaneladdnot.putConstraint(SpringLayout.WEST,leyenda_tipoNoticia,5, SpringLayout.WEST,this);
        layoutpaneladdnot.putConstraint(SpringLayout.NORTH,leyenda_tipoNoticia,165, SpringLayout.NORTH,this);
        
        //Configuramos leyenda_textoNoticia y deginimos las coordenadas x,y en que estará fija.        
        leyenda_textoNoticia.setFont(new java.awt.Font("MV Boli", 1, 14));
        leyenda_textoNoticia.setForeground(new java.awt.Color(241, 242, 235));
        layoutpaneladdnot.putConstraint(SpringLayout.WEST,leyenda_textoNoticia,5, SpringLayout.WEST,this);
        layoutpaneladdnot.putConstraint(SpringLayout.NORTH,leyenda_textoNoticia,205, SpringLayout.NORTH,this);
        
        //Configuramos leyenda_fechaNoticia y deginimos las coordenadas x,y en que estará fija.        
        leyenda_fechaNoticia.setFont(new java.awt.Font("MV Boli", 1, 14));
        leyenda_fechaNoticia.setForeground(new java.awt.Color(241, 242, 235));
        layoutpaneladdnot.putConstraint(SpringLayout.WEST,leyenda_fechaNoticia,5, SpringLayout.WEST,this);
        layoutpaneladdnot.putConstraint(SpringLayout.NORTH,leyenda_fechaNoticia,245, SpringLayout.NORTH,this);
        
        this.add(leyenda_tituloNoticia);
        this.add(leyenda_autorNoticia);
        this.add(leyenda_unidadNoticia);
        this.add(leyenda_areaNoticia);
        this.add(leyenda_tipoNoticia);
        this.add(leyenda_textoNoticia);
        this.add(leyenda_fechaNoticia);
    }
    
    
    
}
