import processing.core.PApplet;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;


public class Game extends PApplet {
    // TODO: declare game variables

    Player player = new Player(225, 700, "Bobby");

    public ArrayList<Hurdle> hurdles = new ArrayList<>();

    public void settings() {
        size(700, 800);   // set the window size
    }

    @Override
    public void keyPressed() {
        if (player.alive) {
            if (keyPressed && !player.paused) {
                if (key == 'a' || key == 'A') {
                    if (!(player.locationX < 100)) {
                        player.locationX -= 150;
                    }
                }
            }
            if (keyPressed && !player.paused) {
                if (key == 'd' || key == 'D') {
                    if (!(player.locationX > 350)) {
                        player.locationX += 150;
                    }
                }
            }
            if (keyPressed && !player.paused) {
                if (key == 'r' || key == 'R') {
                    frameCount = 0;
                    hurdles.clear();
                    player.setLocationX();

                }
            }
            if (keyPressed) {
                if (key == 'p' || key == 'P') {
                    if (!player.paused) {
                        player.paused = true;

                    } else player.paused = false;
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
        hurdles.add(new Hurdle(randomLane(), 0, 150));
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
        if (player.alive == false) {
            frameCount -= 1;
        }
        text("Score: " + frameCount / 60, 475, 50);
        textSize(40);
        if ((player.alive == true) && player.paused == false) {
            for (int i = 0; i < hurdles.size(); i++) {
                Hurdle hurd = hurdles.get(i);
                hurd.draw(this);
                hurd.update(hurdles);

            }

            if (Math.random() * 10 < 0.15) {
                int lane = (int) (Math.random() * 3);
                hurdles.add(new Hurdle(lane, 0, 150));
            }
        }
        for (int i = 0; i < hurdles.size(); i++) {
            Hurdle hurd = hurdles.get(i);
            hurd.draw(this);
        }
        if (player.paused) {
            frameCount -= 1;

        }

        for (int i = 0; i < hurdles.size(); i++) {
            Hurdle hurd = hurdles.get(i);
            if (isColliding(player.locationX, player.locationY, hurd.getWidth(), hurd.getyCoord(), 37, 70, 20)) {

                player.alive = false;
                background(0);
                int score = frameCount / 60;
                score--;
                fill(255, 0, 0);
                text("Score: " + score, 290, 400);
                fill(255, 0, 0);
                text("YOU DIED", 290, 300);


            }
        }

    }



    public static void main(String[] args) {
        PApplet.main("Game");

    }


    private boolean isColliding(float ellipseX, float ellipseY, int rectX, int rectY, float ellipseRadius, float rectWidth, float rectHeight) {
        // Calculate the closest point on the rectangle to the center of the ellipse
        float closestX = Math.max(rectX, Math.min(ellipseX, rectX + rectWidth));
        float closestY = Math.max(rectY, Math.min(ellipseY, rectY + rectHeight));

        // Calculate the distance between the closest point and the center of the ellipse
        float distanceX = ellipseX - closestX;
        float distanceY = ellipseY - closestY;

        // Check if the distance is less than or equal to the ellipse radius
        return distanceX * distanceX + distanceY * distanceY <= ellipseRadius * ellipseRadius;
    }

}

