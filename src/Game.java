import processing.core.PApplet;

import javax.xml.stream.Location;

public class Game extends PApplet {
    // TODO: declare game variables

    Player player = new Player(5, 10, 1, 225, 700);

    public void settings() {
        size(450, 800);   // set the window size

    }

    @Override
    public void keyPressed() {
        if (keyPressed) {
            if (key == 'a' || key == 'A') {

                player.locationX += 150;

            }
        }
        if (keyPressed) {
            if (key == 'd' || key == 'D') {
                player.locationX += 150;
            }
        }
    }

    public void setup() {
        // TODO: initialize game variables
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
        ellipse(player.locationX, player.locationY, 75, 75);
//        ellipse(mouseX, mouseY, 60, 60);  // draw circle at mouse loc
//        ellipse(mouseX - 80, mouseY, 60, 60);  // draw circle at mouse loc
//        ellipse(mouseX + 80, mouseY, 60, 60);  // draw circle at mouse loc
    }

    public static void main(String[] args) {
        PApplet.main("Game");
    }
}
