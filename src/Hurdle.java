import processing.core.PApplet;

import javax.xml.stream.Location;
import java.util.ArrayList;

public class Hurdle {
    private double height;   // <-- make int
    private int lane;
    private int yCoord;
    private int width;
    private boolean alive;
    private double percentChance;
public Hurdle(int lane, int yCoord, int width) {
    this.lane = lane;
    this.yCoord = yCoord;
    this.width = width;
}
public int randomLane(){
    int random = (int)(Math.random()*3);
    return random;
}



    public void draw(PApplet window) {

        if (lane == 0) {
            window.rect(15, yCoord, width,yCoord+20);
        } else if (lane == 1) {

        }
    }

    public void update() {
    this.yCoord+=5;
    if (this.yCoord>800){
        alive = false;
    }
    if (Math.random() < percentChance ){
        lane = (int)(Math.random()*3+1);
    }
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
