package Tests;

import Controller.*;
//import IteradoresConcretos.IteradorNoticiasSuscriptor;
import Model.*;
import java.util.ArrayList;

/**
 * @author Gerardo Hernández, Hugo Daniel Cabrera
 */

/**
 * Clase de testing del proyecto no se incluye en el diagrama ya que solo se improvisó para pruebas
 */
public class SuscriptorTest {
    public static void main ( String[] args ){
    
    //Creación del dataNews ( Centro de noticias )
        NoticiasData dataNews =  new NoticiasData();
        
    
        
    //Creación de los atributos de noticias y las noticias
        
        //Creación de las Areas ( Division academica )
        Area area1 = new Area( "Ciencias Basicas de Ingeniería" );
        Area area2 = new Area( "Ciencias Sociales y de Humanidades" );
        Area area3 = new Area( "Ciencias y Artes para le Diseño" );
        Area area4 = new Area( "Ciencias Biológicas y de la Salud" );


        //Creación de Personas ( Completamente Random )
        Persona persona1 =  new Persona( "Lisbeth Gallardo" ); 
        Persona persona2 =  new Persona( "Enrique Peña" ); 
        Persona persona3 =  new Persona( "Pablo Marmol" ); 
        Persona persona4 =  new Persona( "Dr Who" ); 
        Persona persona5 =  new Persona( "Steve Jobs" ); 
        Persona persona6 =  new Persona( "Hugo Cabrera" ); 
        Persona persona7 =  new Persona( "Gerardo Hernández" ); 
        Persona persona8 =  new Persona( "Bob Sponja" ); 

        //Creación de unidades
        Unidad unidad1 = new Unidad( "Azcapotzalco" );
        Unidad unidad2 = new Unidad( "Iztapalapa" );
        Unidad unidad3 = new Unidad( "Lerma" );
        Unidad unidad4 = new Unidad( "Xochimilco" );
        Unidad unidad5 = new Unidad( "Cuajimalpa" );
        
        //Creación de las Noticias        
        
        Noticia noticia1;
        noticia1 = new  Noticia( "Titulo 1", persona1, unidad1, area1, "Investigación", "Desarrollo de la noticia .... solo visible en el suscriptor 1 ", "fechadepublicacion." );
        
        Noticia noticia2;
        noticia2 = new  Noticia( "Titulo 2", persona2, unidad2, area2, "Investigación", "Desarrollo de la segunda noticia .... ", "fechadepublicacion de la segunda noticia" );
        
        Noticia noticia3;
        noticia3 = new  Noticia( "Titulo 3", persona3, unidad3, area3, "Desarrollo Tecnologico", "Desarrollo de la Tercera noticia .... ", "fechadepublicacion de la Tercera noticia" );
        
        Noticia noticia4;
        noticia4 = new  Noticia( "Titulo 4", persona4, unidad4, area4, "Investigación", "Desarrollo de la Cuarta noticia .... ", "fechadepublicacion de la Cuarta noticia" );

        Noticia noticia5;
        noticia5 = new  Noticia( "Titulo 5", persona5, unidad5, area1, "Desarrollo Tecnologico", "Desarrollo de la Quinta noticia .... ", "fechadepublicacion de la Quinta noticia" );


    //Agregación de los suscriptores y las noticias para ver trancisiones.
        
        //Creación del suscriptor1 al dataNews y la noticia que solo sera accesible por el primer suscriptor
        Suscriptor suscriptor1 =  new Suscriptor( "Azcapotzalco", dataNews,null );
        //dataNews.setAtributosNoticia( noticia1 );

        //Creación de lsuscriptor 2 y la noticia2 que sera accesible solo por suscriptor1 y suscriptor2
        Suscriptor suscriptor2 =  new Suscriptor( "Iztapalapa", dataNews,null );
        //dataNews.setAtributosNoticia( noticia2 );
        
        //Creación del suscriptor 3 y las noticias 3 y 4 que sera accesible por los primeros 3 suscriptores
        Suscriptor suscriptor3 =  new Suscriptor( "Lerma", dataNews,null );
        //dataNews.setAtributosNoticia( noticia3 );
        //dataNews.setAtributosNoticia( noticia4 );

        //Se hizo viral todos se sucribe y todos ven la noticia4
        Suscriptor suscriptor4 =  new Suscriptor( "Cuajimalpa", dataNews,null );
        Suscriptor suscriptor5 =  new Suscriptor( "Xochimilco", dataNews,null );
        Suscriptor suscriptor6 =  new Suscriptor( "ITAM", dataNews,null );

        //dataNews.setAtributosNoticia( noticia5 );                           //Accesible por todos
    /*    
    //Impresión de las noticias
        
        //Impresión del suscriptor1
        System.out.println( "Suscriptor : " + suscriptor1.getName() );
        ArrayList noticiasSus1 = suscriptor1.getNoticias();
        int contador = 0;
        IteradorNoticiasSuscriptor iteradorNotSus1 = new IteradorNoticiasSuscriptor( noticiasSus1 );
        while( iteradorNotSus1.hasNext() ){
            Noticia noticia = ( Noticia )iteradorNotSus1.next();
            contador++;
            //Noticia noticia = (Noticia) noticiasSus1.iterator().next();
            System.out.println( "\t " + contador + " " +  noticia.getTituloNoticia() + " " + noticia.getTextoNoticia() );
        }

        //Impresión del suscriptor2
        System.out.println( "Suscriptor : " + suscriptor2.getName() );
        ArrayList noticiasSus2 = suscriptor2.getNoticias();
        contador = 0;
        IteradorNoticiasSuscriptor iteradorNotSus2 = new IteradorNoticiasSuscriptor( noticiasSus2 );
        while( iteradorNotSus2.hasNext() ){
            Noticia noticia = ( Noticia )iteradorNotSus2.next();
            contador++;
            //Noticia noticia = (Noticia) noticiasSus2.iterator().next();
            System.out.println( "\t " + contador + " " +  noticia.getTituloNoticia() + " " + noticia.getTextoNoticia() );
        }

        //Impresión del suscriptor3
        System.out.println( "Suscriptor : " + suscriptor3.getName() );
        ArrayList noticiasSus3 = suscriptor3.getNoticias();
        contador = 0;
        IteradorNoticiasSuscriptor iteradorNotSus3 = new IteradorNoticiasSuscriptor( noticiasSus3 );
        while( iteradorNotSus3.hasNext() ){
            Noticia noticia = ( Noticia )iteradorNotSus3.next();
            contador++;
            //Noticia noticia = (Noticia) noticiasSus3.iterator().next();
            System.out.println( "\t " + contador + " " +  noticia.getTituloNoticia() + " " + noticia.getTextoNoticia() );
        }

        //Impresión del suscriptor4
        System.out.println( "Suscriptor : " + suscriptor4.getName() );
        ArrayList noticiasSus4 = suscriptor4.getNoticias();
        contador = 0;
        IteradorNoticiasSuscriptor iteradorNotSus4 = new IteradorNoticiasSuscriptor( noticiasSus4 );
        while( iteradorNotSus4.hasNext() ){
            Noticia noticia = ( Noticia )iteradorNotSus4.next();
            contador++;
            //Noticia noticia = (Noticia) noticiasSus4.iterator().next();
            System.out.println( "\t " + contador + " " +  noticia.getTituloNoticia() + " " + noticia.getTextoNoticia() );
        }

        //Impresión del suscriptor5
        System.out.println( "Suscriptor : " + suscriptor5.getName() );
        ArrayList noticiasSus5 = suscriptor5.getNoticias();
        contador = 0;
        IteradorNoticiasSuscriptor iteradorNotSus5 = new IteradorNoticiasSuscriptor( noticiasSus5 );
        while( iteradorNotSus5.hasNext() ){
            Noticia noticia = ( Noticia )iteradorNotSus5.next();
            contador++;
            //Noticia noticia = (Noticia) noticiasSus5.iterator().next();
            System.out.println( "\t " + contador + " " +  noticia.getTituloNoticia() + " " + noticia.getTextoNoticia() );
        }
       
        //Impresión del suscriptor6
        System.out.println( "Suscriptor : " + suscriptor6.getName() );
        ArrayList noticiasSus6 = suscriptor6.getNoticias();
        contador = 0;
        IteradorNoticiasSuscriptor iteradorNotSus6 = new IteradorNoticiasSuscriptor( noticiasSus6 );
        while( iteradorNotSus6.hasNext() ){
            Noticia noticia = ( Noticia )iteradorNotSus6.next();
            contador++;
            //Noticia noticia = (Noticia) noticiasSus6.iterator().next();
            System.out.println( "\t " + contador + " " +  noticia.getTituloNoticia() + " " + noticia.getTextoNoticia() );
        }
        
        
        */
    }
}
