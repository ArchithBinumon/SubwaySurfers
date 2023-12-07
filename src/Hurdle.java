import processing.core.PApplet;

import javax.xml.stream.Location;

public class Hurdle {
    private double height;   // <-- make int
    private int lane;
    private int yCoord;
    public void randomPlaceLow(){
        //place at a random location
    }
    public void draw(PApplet window) {
        if (height == 0) {
            window.fill(255, 0, 0);
        } else {
            window.fill(0, 255, 0);
        }

        if (lane == 0) {
            window.rect(15, y, width,height);
        } else if (lane == 1) {

        }
    }

    public void update() {
        /*
        add 5 to the y coord
        if ( y is off the screen then ) {
            alive = false;
        }

        if (Math.random() < percentChance ) {
            lane = random lane number from 0 to 3.
        }
         */
    }
}
