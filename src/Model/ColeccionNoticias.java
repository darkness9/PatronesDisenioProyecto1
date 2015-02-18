package Model;

import java.util.ArrayList;

/**
 * @author Gerardo Hernández, Hugo Daniel Cabrera
 */
public class ColeccionNoticias {
    ArrayList lasNoticias;
    Noticia noticia;

    public ColeccionNoticias() {
        lasNoticias = new ArrayList();
    }
    
    public void addNoticia(Noticia not){
        this.noticia = not;
        System.out.println("Noticia agregada "+lasNoticias.size());
        lasNoticias.add(noticia);
    }
}
