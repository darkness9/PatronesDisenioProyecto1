package Controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

/**
 * @author Gerardo Hernández, Hugo Daniel Cabrera
 */

/**
 *Clase controlador encargada de crear suscriptores asi como de administrar los nombres de estos y las peticiones de remover a 
 * un suscriptor de la lista de observadores (desuscribirlo)
 */
public class CreadorEliminadorDeSuscriptores {
    
    private Suscriptor suscriptor;
    private NoticiasData noticiasdata;
    private Vector nombressuscriptores;
    private ArrayList observerscopy;
    
    public CreadorEliminadorDeSuscriptores( NoticiasData noticiasData){  
        nombressuscriptores=new Vector();
        this.noticiasdata = noticiasData;
    }
    
    public void crearSuscriptor( String name, String filtronoticia ){
        suscriptor = new Suscriptor(name, noticiasdata, filtronoticia );       
    }
    
    public Vector getNombreSuscriptor() {
        Iterator observersiterator = this.noticiasdata.observers.iterator();
        nombressuscriptores.removeAllElements();
        nombressuscriptores.add("Suscriptores");
        while( observersiterator.hasNext() ){
            ObserverInterface observador =(ObserverInterface)observersiterator.next();
            Suscriptor suscriptor= (Suscriptor) observador;
            nombressuscriptores.add(suscriptor.getName());
        }
        return nombressuscriptores;
    }
    
    public void peticionEliminarSuscriptorPorNombre(String nombreobservador){
        if(this.noticiasdata.observers.isEmpty()){
            System.out.println("El arreglo de observadores está vacio");
        }else{
            observerscopy=this.noticiasdata.observers;
            Iterator observersiterator = observerscopy.iterator();
            while( observersiterator.hasNext() ){
                ObserverInterface observador =(ObserverInterface)observersiterator.next();
                Suscriptor suscriptor= (Suscriptor) observador;
                if(suscriptor.getName().equals(nombreobservador)){
                   this.noticiasdata. removeObserver(observador);
                   getNombreSuscriptor();
                    break;
                }
            }
        }
        
    }
}
