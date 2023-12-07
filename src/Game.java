import processing.core.PApplet;

import javax.xml.stream.Location;

public class Game extends PApplet {
    // TODO: declare game variables

    Player player = new Player(5, 10, 1, 225, 700);

    /*
    ArrayList<Hurdle> hurdles = new arraylist;
     */

    public void settings() {
        size(450, 800);   // set the window size

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

    public void setup() {
        // TODO: initialize game variables
        // add 1 or 3 or more hurdles to start
    }


    /***
     * Draws each frame to the screen.  Runs automatically in a loop at frameRate frames a second.
     * tick each object (have it update itself), and draw each object
     */
    public void draw() {
        System.out.println(frameCount);

        background(255);    // paint screen white
        fill(0, 255, 0);          // load green paint color
        line(150, 0, 150, 800);
        line(300, 0, 300, 800);
        ellipse(player.locationX, player.locationY, 75, 75);
//        ellipse(mouseX, mouseY, 60, 60);  // draw circle at mouse loc
//        ellipse(mouseX - 80, mouseY, 60, 60);  // draw circle at mouse loc
//        ellipse(mouseX + 80, mouseY, 60, 60);  // draw circle at mouse loc

        /*
        loop over every Hurdle int he hurdles list:
             hurd.draw(this);
             hurd.update();
         */

    }

    // DELETE THIS
    public void hurdles() {
        int y = 120;
        int random = (int) (Math.random() * 3 + 1);
        switch (random) {
            case 1:
                rect(15, y, 120, 120);
                y += 1;
                for (int i = 0; i < 100; i++) {
                    y += 5;
                }
                break;
            case 2:
                rect(165, y, 120, 120);
                y += 1;
                for (int i = 0; i < 100; i++) {
                    y += 5;
                }
                break;
            case 3:
                rect(315, y, 120, 120);
                y += 1;
                for (int i = 0; i < 100; i++) {
                    y += 5;
                }
                break;
        }

    }

    public static void main(String[] args) {
        PApplet.main("Game");
    }
}
