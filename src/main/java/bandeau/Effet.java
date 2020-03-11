/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

/**
 *
 * @author ggraziol
 */
abstract class Effet {
    
    public Bandeau bandeau;
    
    public Effet(Bandeau bandeau){
        this.bandeau=bandeau;
    }
    
    public abstract void run();
    
}
