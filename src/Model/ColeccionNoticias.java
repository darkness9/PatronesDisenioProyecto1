package Model;

import java.util.ArrayList;

/**
 * @author Gerardo Hernández, Hugo Daniel Cabrera
 */

/**
 * Clase que guarda las noticias pertenece al modelo y simula lo que seria la BD donde se
 * podrian guargar igual las noticias
 */
public class ColeccionNoticias {
    public ArrayList lasNoticias;
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
