

import javax.xml.stream.Location;

public class Player {
    private double playerSpeed;
    private double speedIncreasePlayer;
    private double height;
    public int locationX;
    public int locationY;
    private boolean alive;

    public Player(double playerSpeed, double height, double speedIncreasePlayer, int locationX, int locationY) {
        this.playerSpeed = playerSpeed;
        this.height = height;
        this.speedIncreasePlayer = speedIncreasePlayer;
        this.locationX = locationX;
        this.locationY = locationY;

    }

    public void slide() {
        height -= 5;
        //change back after some amount of ticks
    }

    public void jump() {
        height += 5;
        //change back after some amount of ticks
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

    public void speedIncreasePlayer() {
        playerSpeed += 1;//after every x ticks
    }


}
