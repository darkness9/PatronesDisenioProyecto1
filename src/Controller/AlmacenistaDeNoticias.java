package Controller;

import Model.*;

/**
 *
 * @author darkness
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
