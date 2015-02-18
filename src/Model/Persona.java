package Model;

/**
 * @author Gerardo Hernández, Hugo Daniel Cabrera
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
