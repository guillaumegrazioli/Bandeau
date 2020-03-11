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
    private ArrayList<Integer> iterations = new ArrayList();
    
    private Bandeau bandeau;
    
    public Scenario(Bandeau b){
        this.bandeau = b;
        effets.add(new Rotation(bandeau, 180));
        effets.add(new Zoom(bandeau, 100));
    }
    
    public Scenario(Bandeau b, ArrayList<Effet> effets, ArrayList<Integer> iterations){
        this.bandeau = b;
        this.effets = effets;
        this.iterations = iterations;
    }
    
    public void run(){
        
        for (int i = 0; i<this.effets.size(); i++){
           for (int j = 0; j<this.iterations.get(i); j++){
            effets.get(i).run();
           }
        }
        
        
            
        }
        
    }
    
    

