package Controller;

import Model.Noticia;
import View.SuscriptorJFrame;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Gerardo Hernández, Hugo Daniel Cabrera
 */

/**
 * Clase que representa al observador conncreto en el patron observador, (suscriptor) declararla de esta manera nos permite crear n instancias de suscriptores
 */
public class Suscriptor implements ObserverInterface, DisplayElementInterface{
    
    private String nombresuscriptor;
    public ArrayList noticiasdelsuscriptor;
    private NoticiasData noticiasdata;
    private String fitronoticia;
    SuscriptorJFrame elsuscriptorJframe;
 
    public Suscriptor( String nombreSuscriptor, NoticiasData noticiasdata,String filtronoticia){
        noticiasdelsuscriptor = new ArrayList();
        this.nombresuscriptor = nombreSuscriptor;
        this.noticiasdata = noticiasdata;
        this.fitronoticia = filtronoticia;
        noticiasdata.registerObserver(this);
        elsuscriptorJframe = new SuscriptorJFrame(this.nombresuscriptor,this.fitronoticia,this);
    }      

    @Override
    public void update(Object noticia) {
        System.out.println(((Noticia)noticia).getUnidadNoticia()+","+((Noticia)noticia).getAreaNoticia()+","+((Noticia)noticia).getTipoNoticia());
        if(((Noticia)noticia).getUnidadNoticia().contains(this.fitronoticia)||((Noticia)noticia).getAreaNoticia().contains(this.fitronoticia)||((Noticia)noticia).getTipoNoticia().contains(this.fitronoticia)){
            noticiasdelsuscriptor.add(noticia);
            display();            
            displayatJFrame((Noticia)noticia);
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
        Iterator iteradorNoticiasSuscriptor = noticiasdelsuscriptor.iterator();
        while( iteradorNoticiasSuscriptor.hasNext() ){
            Noticia noticia = ( Noticia )iteradorNoticiasSuscriptor.next();
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
    public void displayatJFrame(Noticia noticia) {
        elsuscriptorJframe.agregaElementoaLista(noticia.getTituloNoticia()+","+noticia.getAutorNoticia());
    }

    public void peticionRemover(){
        noticiasdata.removeObserver(this);
    }
    
    public void cerrarJFrame(){
        elsuscriptorJframe.dispose();
    }
        
}
