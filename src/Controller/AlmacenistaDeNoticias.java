package Controller;

import Model.*;

/**
 * @author Gerardo Hernández, Hugo Daniel Cabre
 */

/**
 * Clase controlador encargada de guardar la nueva noticia ingesada por el administrador al modelo su unica responsabilidad es guadar noticias
 * Tiene un metodo con el mismo nombre que el de la clase NoticiasData ya que al igual que ésta recibe los atributos de la noticia para luego
 * crear con ellos al objeto noticia particular
 */
public class AlmacenistaDeNoticias {
    
    private Noticia noticia;
    private ColeccionNoticias lasNoticias = new ColeccionNoticias();

    public AlmacenistaDeNoticias() {
    }  
    
    public void setAtributosNoticia(String tituloNoticia, Persona autorNoticia, Unidad unidadNoticia, Area areaNoticia, String tipoNoticia, String textoNoticia, String fechaPublicacion){
        this.noticia = new Noticia(tituloNoticia, autorNoticia, unidadNoticia, areaNoticia, tipoNoticia, textoNoticia, fechaPublicacion);
        lasNoticias.addNoticia(noticia);
    } 
}
