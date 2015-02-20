package Controller;

import Model.*;
import java.util.*;

/**
 * @author Gerardo Hernández, Hugo Daniel Cabrera
 */

/**
 * Clase que representa el Subject concreto del patron observador,  sus funciones son:
 *      -Registrar suscriptores
 *      -Remover suscriptores
 *      -Notificar a sus obsevadores de cambios
 *      -Setear los atributos del objeto noticia
 */
public class NoticiasData implements SubjectInterface{

    protected ArrayList observers;
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
        if(i>=0){
            observers.remove(i);
            System.out.println("Objetor removido");
            ((Suscriptor)ob).cerrarJFrame();
        }else{
            System.out.println("El suscritor no existe");
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
