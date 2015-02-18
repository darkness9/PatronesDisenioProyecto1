/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author hugo
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
