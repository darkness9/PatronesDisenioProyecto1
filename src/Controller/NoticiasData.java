package Controller;

import Model.*;
import java.util.*;

/**
 * @author Gerardo Hernández, Hugo Daniel Cabrera
 */
public class NoticiasData implements SubjectInterface{

    private ArrayList observers;
    private ArrayList observerscpopy;
    private Vector nombresobservadores;
    private Noticia noticia;

    public NoticiasData() {
        observers = new ArrayList();
        nombresobservadores = new Vector();
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
            getObserversNames();//de este modo cada que removamos un suscriptor se actualiza el combobox que contenia su nombre
            ((Suscriptor)ob).cerrarJFrame();//
            //ob=null;
            //System.gc();
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
    
     public Vector getObserversNames() {
        Iterator observersiterator = observers.iterator();
        nombresobservadores.removeAllElements();
        nombresobservadores.add("Suscriptores");
        while( observersiterator.hasNext() ){
            ObserverInterface observador =(ObserverInterface)observersiterator.next();
            Suscriptor suscriptor= (Suscriptor) observador;
            nombresobservadores.add(suscriptor.getName());
            //System.out.println("Yo soy el suscriptor: "+suscriptor.getName());
        }
        return nombresobservadores;
    }
     
    public void buscaObservadoraRemorer(String nombreobservador){
        if(observers.isEmpty()){
            System.out.println("El arreglo de observadores está vacio");
        }else{
            observerscpopy=observers;
            Iterator observersiterator = observerscpopy.iterator();
            while( observersiterator.hasNext() ){
                ObserverInterface observador =(ObserverInterface)observersiterator.next();
                Suscriptor suscriptor= (Suscriptor) observador;
                if(suscriptor.getName().equals(nombreobservador)){
                    removeObserver(observador);
                    break;
                }
            }
        }
        
    }
     
}
