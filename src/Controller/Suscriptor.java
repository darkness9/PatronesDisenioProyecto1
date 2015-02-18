package Controller;

import IteradoresConcretos.IteradorNoticiasSuscriptor;
import Model.Noticia;
import java.util.ArrayList;


/**
 *
 * @author hugo
 */
public class Suscriptor implements ObserverInterface, DisplayElementInterface {
    
    private String nombresuscriptor;
    private ArrayList noticiasdelsuscriptor;
    private NoticiasData noticiasdata;
    private String fitronoticia;
 
    public Suscriptor( String nombreSuscriptor, NoticiasData noticiasdata,String filtronoticia){
        noticiasdelsuscriptor = new ArrayList();
        this.nombresuscriptor = nombreSuscriptor;
        this.noticiasdata = noticiasdata;
        this.fitronoticia = filtronoticia;
        noticiasdata.registerObserver(this);        
        System.out.println("Suscriptor creado correctamente, el filtro es: "+this.fitronoticia);
    }      

    @Override
    public void update(Object noticia) {
        System.out.println(((Noticia)noticia).getUnidadNoticia()+","+((Noticia)noticia).getAreaNoticia()+","+((Noticia)noticia).getTipoNoticia());
        if(((Noticia)noticia).getUnidadNoticia().contains(this.fitronoticia)||((Noticia)noticia).getAreaNoticia().contains(this.fitronoticia)||((Noticia)noticia).getTipoNoticia().contains(this.fitronoticia)){
            noticiasdelsuscriptor.add(noticia);
            display();
        }
    }
    public String getName(  ){
        return this.nombresuscriptor;
    }
    public ArrayList getNoticias(  ){
        return this.noticiasdelsuscriptor;
    }

    @Override
    public void display() {
        System.out.println( "Suscriptor : " + this.getName() );
        ArrayList noticiasSus = this.getNoticias();
        int contador = 0;
        IteradorNoticiasSuscriptor iteradorNoticiasSuscriptor = new IteradorNoticiasSuscriptor( noticiasSus );
        while( iteradorNoticiasSuscriptor.hasNext() ){
            Noticia noticia = ( Noticia )iteradorNoticiasSuscriptor.next();
            contador++;
            System.out.println("Imprimiendo noticias desde: "+this.getName());
            System.out.println("----------------------------------");
            System.out.println("Titulo: "+noticia.getTituloNoticia());
            System.out.println("Autor: "+noticia.getAutorNoticia());
            System.out.println("Unidad: "+noticia.getUnidadNoticia());
            System.out.println("Area: "+noticia.getAreaNoticia());
            System.out.println("Tipo: "+noticia.getTipoNoticia());
            System.out.println("Texto: "+noticia.getTextoNoticia());
            System.out.println("Fecha: "+noticia.getFechaNoticia()+"\n");
        }
    }

    @Override
    public void displayatJFrame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
