package Controller;

import Model.Noticia;

/**
 * @author Gerardo Hernández, Hugo Daniel Cabrera
 */
public class IztapalapaDisplay implements ObserverInterface, DisplayElementInterface{

    private Noticia noticia;
    private SubjectInterface noticiasdata;

    public IztapalapaDisplay(SubjectInterface noticiasdata) {
        this.noticiasdata = noticiasdata;
        noticiasdata.registerObserver(this);
    }
    
    @Override
    public void update(Object noticia) {
        this.noticia=(Noticia) noticia;
        display();
    }
    
    @Override
    public void display() {
        System.out.println("Imprimiendo noticias en Iztapalapa");
        System.out.println("----------------------------------");
        System.out.println("Titulo: "+noticia.getTituloNoticia());
        System.out.println("Autor: "+noticia.getAutorNoticia());
        System.out.println("Unidad: "+noticia.getUnidadNoticia());
        System.out.println("Area: "+noticia.getAreaNoticia());
        System.out.println("Tipo: "+noticia.getTipoNoticia());
        System.out.println("Texto: "+noticia.getTextoNoticia());
        System.out.println("Fecha: "+noticia.getFechaNoticia()+"\n");
    }

    @Override
    public void displayatJFrame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
