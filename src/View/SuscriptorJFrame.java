package View;

import Controller.NoticiasData;
import Controller.Suscriptor;
import Model.Noticia;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.SpringLayout;

/**
 * @author Gerardo Hernández, Hugo Daniel Cabrera
 */

/**
 * Clase que hereda de JFrame y es el contenedor que le permite al cliente ver la lista de las noticias a las cuales está suscrito
 */
public class SuscriptorJFrame extends javax.swing.JFrame{
    
    public ListaNoticiasJPanel listanoticiasjpanel;
    public DetalleNoticiaJPanel detallenoticia;
    //Se crea la referencia al panel base que trae el JFrame
    public Container contenedor = getContentPane();
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
    detallenoticia  = new DetalleNoticiaJPanel(270,true);
    listanoticiasjpanel = new ListaNoticiasJPanel(true,270);
    contenedor.setLayout(layout);    
    contenedor.add(listanoticiasjpanel);
    contenedor.add(detallenoticia);
    this.suscriptorobjeto=suscriptor;
    
    listanoticiasjpanel.listadenoticias.addMouseListener(new MouseListener() {

        @Override
        public void mouseClicked(MouseEvent e) {
                System.out.println("Estoy en: "+listanoticiasjpanel.listadenoticias.locationToIndex(e.getPoint())+", "+((Noticia) suscriptorobjeto.noticiasdelsuscriptor.get(listanoticiasjpanel.listadenoticias.locationToIndex(e.getPoint()))).getTituloNoticia());
                detallenoticia.modelodelalista.removeAllElements();
                detallenoticia.leyenda_tituloNoticia.setText("Titulo: "+((Noticia) suscriptorobjeto.noticiasdelsuscriptor.get(listanoticiasjpanel.listadenoticias.locationToIndex(e.getPoint()))).getTituloNoticia());
                detallenoticia.modelodelalista.addElement(detallenoticia.leyenda_tituloNoticia.getText());
                detallenoticia.leyenda_autorNoticia.setText("Autor: "+((Noticia) suscriptorobjeto.noticiasdelsuscriptor.get(listanoticiasjpanel.listadenoticias.locationToIndex(e.getPoint()))).getAutorNoticia());
                detallenoticia.modelodelalista.addElement(detallenoticia.leyenda_autorNoticia.getText());
                detallenoticia.leyenda_unidadNoticia.setText("Autor: "+((Noticia) suscriptorobjeto.noticiasdelsuscriptor.get(listanoticiasjpanel.listadenoticias.locationToIndex(e.getPoint()))).getUnidadNoticia());
                detallenoticia.modelodelalista.addElement(detallenoticia.leyenda_unidadNoticia.getText());
                detallenoticia.leyenda_areaNoticia.setText("Autor: "+((Noticia) suscriptorobjeto.noticiasdelsuscriptor.get(listanoticiasjpanel.listadenoticias.locationToIndex(e.getPoint()))).getAreaNoticia());
                detallenoticia.modelodelalista.addElement(detallenoticia.leyenda_areaNoticia.getText());
                detallenoticia.leyenda_tipoNoticia.setText("Autor: "+((Noticia) suscriptorobjeto.noticiasdelsuscriptor.get(listanoticiasjpanel.listadenoticias.locationToIndex(e.getPoint()))).getTipoNoticia());
                detallenoticia.modelodelalista.addElement(detallenoticia.leyenda_tipoNoticia.getText());
                detallenoticia.leyenda_textoNoticia.setText("Autor: "+((Noticia) suscriptorobjeto.noticiasdelsuscriptor.get(listanoticiasjpanel.listadenoticias.locationToIndex(e.getPoint()))).getTextoNoticia());
                detallenoticia.modelodelalista.addElement(detallenoticia.leyenda_textoNoticia.getText());
                detallenoticia.leyenda_fechaNoticia.setText("Autor: "+((Noticia) suscriptorobjeto.noticiasdelsuscriptor.get(listanoticiasjpanel.listadenoticias.locationToIndex(e.getPoint()))).getFechaNoticia());
                detallenoticia.modelodelalista.addElement(detallenoticia.leyenda_fechaNoticia.getText());
                listanoticiasjpanel.setVisible(false);
                detallenoticia.setVisible(true);
        }

        @Override
        public void mousePressed(MouseEvent e) {}

        @Override
        public void mouseReleased(MouseEvent e) {}

        @Override
        public void mouseEntered(MouseEvent e) {}

        @Override
        public void mouseExited(MouseEvent e) {}
    });
    
    detallenoticia.cerrardetalle.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            listanoticiasjpanel.setVisible(true);
            detallenoticia.setVisible(false);
        }
    });
    
    } 
    
    public void agregaElementoaLista(String noticia){
        listanoticiasjpanel.modelodelalista.addElement(noticia);
    }   
    
}
