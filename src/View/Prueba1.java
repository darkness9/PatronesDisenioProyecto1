package View;

import Controller.*;
import Model.*;

public class Prueba1 {
    public static void main(String args[]){
        NoticiasData noticiasdata = new NoticiasData();
        IztapalapaDisplay muestraizt = new IztapalapaDisplay(noticiasdata);
        Noticia noticia = new Noticia("La uam en la luna", new Persona("Lidice"), new Unidad("Azcapotzalco"), new Area("Ciencia"),"Desarrollo Tecnológico", "La uam llega a la luna con un robot espacial", "12/03/15");
        //Noticia noticia2 = new Noticia("Misteriosa planta cura diabetes", new Persona("Rodrigo"), new Unidad("Xochimilco"), new Area("Salud"),"Investrigación", "La uam encuentra una cura para la diabetes", "12/06/15");
        noticiasdata.setAtributosNoticia("La uam en la luna", new Persona("Lidice"), new Unidad("Azcapotzalco"), new Area("Ciencia"),"Desarrollo Tecnológico", "La uam llega a la luna con un robot espacial", "12/03/15");
        //noticiasdata.setAtributosNoticia(noticia2);
        for(int i=1; i<32;i++){
            System.out.print("\""+i+"\""+",");
        }
    }
}
