import processing.core.PApplet;

import java.util.ArrayList;

public class Hurdle {
    private int lane;
    private int yCoord;
    private static int width;
    private boolean alive;
    private static double percentChance = 0.1;

    public Hurdle(int lane, int yCoord, int width) {
        this.lane = lane;
        this.yCoord = yCoord;
        this.width = width;
        this.alive = true;
    }
    public int getyCoord(){
        return this.yCoord;
    }
    public int getWidth(){
       int x = 0;
        if (lane == 0) {
            x = 15;
        } else if (lane == 1) {
            x = 165;
        } else {
            x = 315;
        }
        return x;
    }

    public int randomLane() {
        int random = (int) (Math.random() * 3);
        return random;
    }


    public void draw(PApplet window) {

        if (lane == 0) {
            window.rect(0, yCoord, width, 50);
        } else if (lane == 1) {
            window.rect(150, yCoord, width, 50);
        } else {
            window.rect(300, yCoord, width, 50);
        }
    }

    public void update(ArrayList<Hurdle> hurdles) {
        this.yCoord += 3;
        if (this.yCoord > 800) {
            hurdles.remove(this);
        }
        for (int i = 0; i < hurdles.size(); i++) {
            Hurdle hurd = hurdles.get(i);
//            if (!hurd.alive){
//                hurdles.remove(i);
//            }
        }


    }
}
