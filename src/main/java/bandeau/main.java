/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mborde01
 */
public class main {
    public static void main(String[] args) {
            
        
            Scanner sc = new Scanner(System.in);
            System.out.println("Message");
            String str = sc.nextLine();
            //Création bandeau
	    Bandeau monBandeau = new Bandeau();
            monBandeau.setMessage(str);
            monBandeau.sleep(1000);
            
            //ArrayList
            ArrayList<Effet> AR = new ArrayList<Effet>();
            AR.add(new Rotation(monBandeau,180));
            AR.add(new Zoom(monBandeau,100));
            AR.add(new Clignotant(monBandeau,10));
            
            ArrayList<Integer> AR2 = new ArrayList<Integer>();
            AR2.add(2);
            AR2.add(3);
            AR2.add(1);
            
            //Création Sceanrio
            Scenario s = new Scenario(monBandeau,AR,AR2);
            
            
            //Lancement de la séquence
            s.run();
            
            
    }
}
