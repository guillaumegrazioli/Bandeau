/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

/**
 *
 * @author mborde01
 */
public class main {
    public static void main(String[] args) {
            
            //Création bandeau
	    Bandeau monBandeau = new Bandeau();
            monBandeau.setMessage("Hello");
            monBandeau.sleep(1000);
            
            //Création Sceanrio
            Scenario s = new Scenario(monBandeau);
            
            
            //Lancement de la séquence
            Scenario.run();
            
            
    }
}
