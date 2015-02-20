package Controller;

import Model.Noticia;

/**
 * @author Gerardo Hernández, Hugo Daniel Cabrera
 */

/**
 * Interfaz que contiene los metodos relacionados con el despliegue de información en las vistas
 */
public interface DisplayElementInterface {
    public void display();
    public void displayatJFrame(Noticia noticia);
}
