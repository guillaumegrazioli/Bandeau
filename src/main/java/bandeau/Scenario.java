/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author ggraziol
 */
public class Scenario {
    
    private ArrayList<Effet> effets= new ArrayList();
    
    private Bandeau bandeau;
    
    public Scenario(Bandeau b){
        this.bandeau = b;
        effets.add(new Rotation(bandeau, 90));
        effets.add(new Zoom(bandeau, 100));
    }
    
    public Scenario(Bandeau b, ArrayList<Effet> effets){
        
    }
    
    public void run(){
        int i;
        for (i = 0; i<this.effets.size(); i++){
            effets.get(i).run();
        }
    }
    
    
}
