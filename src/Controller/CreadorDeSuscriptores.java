package Controller;

/**
 * @author Gerardo Hernández, Hugo Daniel Cabrera
 */
public class CreadorDeSuscriptores {
    
    private Suscriptor suscriptor;
    private NoticiasData noticiasData;
    
    public CreadorDeSuscriptores(){
        
    }
    
    public void crearSuscriptor( String name, NoticiasData noticiasData, String filtronoticia ){
        this.noticiasData = noticiasData;
        suscriptor = new Suscriptor(name, noticiasData, filtronoticia );       
    }
}
