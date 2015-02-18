package IteradoresConcretos;

import Model.Noticia;
import PatronIterador.Iterator;
import java.util.ArrayList;

/**
 * @author Gerardo Hernández, Hugo Daniel Cabrera
 */
public class IteradorNoticiasSuscriptor implements Iterator {
    
    ArrayList noticiasDelSuscriptor;
    int position = 0;
    
    public IteradorNoticiasSuscriptor( ArrayList noticiasDelSuscriptor){
        this.noticiasDelSuscriptor =  noticiasDelSuscriptor;
    }
    
    @Override
    public boolean hasNext() {
        if( position >= noticiasDelSuscriptor.size() || noticiasDelSuscriptor.get( position ) == null ){
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Noticia noticia = (Noticia) noticiasDelSuscriptor.get(position);
        position = position+1;
        return noticia;
    }

    @Override
    public void remove() {
        
    }
}
