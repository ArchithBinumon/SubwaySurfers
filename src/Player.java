

import javax.xml.stream.Location;

public class Player {
   private String name;
    public int locationX;
    public int locationY;
    private boolean alive;

    public Player( int locationX, int locationY, String name) {

        this.locationX = locationX;
        this.locationY = locationY;

    }




    public void setLocationX() {
        locationX = 225;
    }

    public void setLocationY() {
        locationY = 700;
    }

    public int getLocationX() {
        return locationX;
    }

    public int getLocationY() {
        return locationY;
    }


    public void die() {
        alive = false;
    }



}
