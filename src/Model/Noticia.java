package Model;

/**
 * @author Gerardo Hernández, Hugo Daniel Cabrera
 */

/**
 * Clase que representa la noticia que será ingresada por el administrador, la cual forma parte del modelo y que tambien le llega a
 * cada uno de los suscriptores (observadores)
 */
public class Noticia {
    String tituloNoticia;
    Persona autorNoticia;
    Unidad unidadNoticia;
    Area areaNoticia;
    String tipoNoticia;
    String textoNoticia;
    String fechaPublicacion;
    //TODO Resolver como agregar una imagen

    public Noticia(String tituloNoticia, Persona autorNoticia, Unidad unidadNoticia, Area areaNoticia, String tipoNoticia, String textoNoticia, String fechaPublicacion) {
        this.tituloNoticia = tituloNoticia;
        this.autorNoticia = autorNoticia;
        this.unidadNoticia = unidadNoticia;
        this.areaNoticia = areaNoticia;
        this.tipoNoticia = tipoNoticia;
        this.textoNoticia = textoNoticia;
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getTituloNoticia(){
        return tituloNoticia;
    }
    
    public String getAutorNoticia(){
        return autorNoticia.getNombrePersona();
    }
        
    public String getUnidadNoticia(){
        return unidadNoticia.getNombreUnidad();
    }
    
    public String getAreaNoticia(){
        return areaNoticia.getNombreArea();
    }   

    public String getTipoNoticia() {
        return tipoNoticia;
    }
    
    public String getTextoNoticia(){
        return textoNoticia;
    }
    
    public String getFechaNoticia(){
        return fechaPublicacion;
    }
}
