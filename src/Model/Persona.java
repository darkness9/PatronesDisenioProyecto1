package Model;

/**
 * @author Gerardo Hernández, Hugo Daniel Cabrera
 */

/**
 * Clase que representa el autor al cual pertenece una noticia
 */
public class Persona {
    String nombrePersona;

    public Persona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }
    
    public String getNombrePersona(){
        return nombrePersona;
    }
}
