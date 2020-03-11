/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

/**
 *
 * @author cjankowi
 */
public class Clignotant extends Effet {
    
    private int nbclign;
    
    public Clignotant(Bandeau bandeau, int nbclign){
        super(bandeau);
        this.nbclign=nbclign;
    }

    @Override
    public void run() {
        String message = bandeau.getMessage();
        for (int i = 0; i < this.nbclign; i++) {
            bandeau.setMessage("");
            this.bandeau.sleep(200);
            bandeau.setMessage(message);
        }
    }
    
    
    
}
