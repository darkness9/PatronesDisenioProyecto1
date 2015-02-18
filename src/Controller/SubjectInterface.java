
package Controller;

/**
 * @author Gerardo Hernández, Hugo Daniel Cabrera
 */
public interface SubjectInterface {
    public void registerObserver(ObserverInterface ob);
    public void removeObserver(ObserverInterface ob);
    public void notifyObservers();
}
