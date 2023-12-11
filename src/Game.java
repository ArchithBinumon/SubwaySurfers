import processing.core.PApplet;

import javax.xml.stream.Location;
import java.util.ArrayList;

public class Game extends PApplet {
    // TODO: declare game variables

    Player player = new Player(225, 700, "Bobby");

    ArrayList<Hurdle> hurdles = new ArrayList<>();

    public void settings() {
        size(700, 800);   // set the window size
    }

    @Override
    public void keyPressed() {
        if (keyPressed) {
            if (key == 'a' || key == 'A') {
                if (!(player.locationX < 100)) {
                    player.locationX -= 150;
                }
            }
        }
        if (keyPressed) {
            if (key == 'd' || key == 'D') {
                if (!(player.locationX > 350)) {
                    player.locationX += 150;
                }
            }
        }
    }

    public int randomLane() {
        int random = (int) (Math.random() * 3);
        return random;
    }

    public void setup() {
        // TODO: initialize game variables
        hurdles.add(new Hurdle(randomLane(),0,140));
    }


    /***
     * Draws each frame to the screen.  Runs automatically in a loop at frameRate frames a second.
     * tick each object (have it update itself), and draw each object
     */
    public void draw() {

        background(255);    // paint screen white
        fill(0, 255, 0);          // load green paint color
        line(150, 0, 150, 800);
        line(300, 0, 300, 800);
        line(450, 0, 450, 800);
        ellipse(player.locationX, player.locationY, 75, 75);
        text("Score: " + frameCount / 60, 475, 50);
        textSize(40);
        /*
        loop over every Hurdle int he hurdles list:
             hurd.draw(this);
             hurd.update();
         */

    }

    public static void main(String[] args) {
        PApplet.main("Game");
    }
}
