package Controller;

import Model.*;
import java.util.ArrayList;

/**
 * @author Gerardo Hernández, Hugo Daniel Cabrera
 */
public class NoticiasData implements SubjectInterface{

    private ArrayList observers;
    private Noticia noticia;

    public NoticiasData() {
        observers = new ArrayList();
    } 
    
    @Override
    public void registerObserver(ObserverInterface ob) {
        observers.add(ob);
    }

    @Override
    public void removeObserver(ObserverInterface ob) {
        int i = observers.indexOf(ob);
        if(i>0){
            observers.remove(i);
        }else{
            System.out.println("El suscritor");
        }
    }

    @Override
    public void notifyObservers() {
        for(int i=0;i<observers.size();i++){
            ObserverInterface observer = (ObserverInterface) observers.get(i);
            observer.update(noticia);
        }
    }
    
    public void modelChanged(){
        notifyObservers();
    }
    
    public void setAtributosNoticia(String tituloNoticia, Persona autorNoticia, Unidad unidadNoticia, Area areaNoticia, String tipoNoticia, String textoNoticia, String fechaPublicacion){
        System.out.println("Noticia recibida!");
        noticia = new Noticia(tituloNoticia, autorNoticia, unidadNoticia, areaNoticia, tipoNoticia, textoNoticia, fechaPublicacion);
        modelChanged();
    }    
}
