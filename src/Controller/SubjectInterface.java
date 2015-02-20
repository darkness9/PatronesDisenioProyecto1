
package Controller;

/**
 * @author Gerardo Hernández, Hugo Daniel Cabrera
 */

/**
 * Interface subject del patrón observador, es el objeto al cual monitorean los observadores y de quien
 * reciben las actualizaciones de la información
 */
public interface SubjectInterface {
    public void registerObserver(ObserverInterface ob);
    public void removeObserver(ObserverInterface ob);
    public void notifyObservers();
}
