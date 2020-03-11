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
	    Bandeau b = new Bandeau();
            Scenario s = new Scenario(b);
            
            Scenario.run();
            
            
    }
}
