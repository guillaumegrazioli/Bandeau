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
public class Rotation extends Effet{
    private int angle;
    
    public Rotation(Bandeau bandeau, int a){
        super(bandeau);
        angle = a;
    }
    public void run(){
        for (int i = 0; i <= angle; i++) {
		bandeau.setRotation(Math.PI*i / angle);
		bandeau.sleep(25);
	}
    }
}
