package bandeau;

import bandeau.Bandeau;
import bandeau.Effet;
import java.awt.Font;

public class Zoom extends Effet {
    
    private int tailleZoom;
    
    public Zoom(Bandeau bandeau, int tailleZoom){
        super(bandeau);
        this.tailleZoom=tailleZoom;
    }

    @Override
    public void run() {
        for (int i = bandeau.getFont().getSize(); i < this.tailleZoom ; i+=5) {
		this.bandeau.setFont(new Font("Zoom", Font.BOLD, 5+i));
		this.bandeau.sleep(100);
        }
    }
    
}
