
package Model;

/**
 * @author Gerardo Hernández, Hugo Daniel Cabrera
 */

/**
 * Clase que representa el Area a la cual pertenece una noticia
 */
public class Area {
    String nombreArea;

    public Area(String nombreArea) {
        this.nombreArea = nombreArea;
    }
    
    public String getNombreArea(){
        return nombreArea;
    }
}
