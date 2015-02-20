package Model;

/**
 * @author Gerardo Hernández, Hugo Daniel Cabrera
 */

/**
 * Clase que representa la Unidad en la cual fue publicada una noticia
 */
public class Unidad {
    String nombreUnidad;

    public Unidad(String nombreUnidad) {
        this.nombreUnidad = nombreUnidad;
    }
    
    public String getNombreUnidad(){
        return nombreUnidad;
    }
}
