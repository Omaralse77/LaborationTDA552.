import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.awt.*;
//
//Will later be written as "public abstract class Car implements Movable"
public abstract class Car implements Movable {
//
    private final int nrDoors; //Is it better to use private and super in the main class? Yes, use private instead, then use getters,
    private final double enginePower; //should not exist
    private double currentSpeed; //should it be public?
    private Color color; //should not exist
    private final String modelName; //should not exist
    private double xCoordinate; //should exist? but in private, should it be private?
    private double yCoordinate; //Should also be public, as X coordinate
    private int direction; //should be public

    public Car(int nrDoors, double enginePower, Color color, String modelName,
               double xCoordinate, double yCoordinate, int direction) {
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.color = color;
        this.modelName = modelName;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.direction = direction;
    }
    protected abstract double speedFactor();

    public void incrementSpeed(double amount){
        currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower);
    }
    public void decrementSpeed(double amount){
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
    }
    public int getNrDoors() {
        return nrDoors;
    }
    public double getEnginePower(){
        return enginePower;
    }
    public double getCurrentSpeed(){
        return currentSpeed;
    }
    private void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
    public String getModelName() {return modelName;}

    public Color getColor(){return color;}

    public void setColor(Color clr){color = clr;}

    public double getxCoordinate() {return xCoordinate;}

    public double getyCoordinate() {return yCoordinate;}

    public int getDirection() {return direction;}

    public void startEngine(){currentSpeed = 0.1;}

    public void stopEngine(){
        currentSpeed = 0;
    }
    // (TODO fix this method according to lab pm)
    public void gas(double amount){
        incrementSpeed(amount);
    }
    // TODO fix this method according to lab pm
    public void brake(double amount){
        decrementSpeed(amount);
    }
    //Not OCP, but how is it supposed to be??
    public void move(){
        switch (this.direction) {
            case 0 -> this.xCoordinate = this.xCoordinate + currentSpeed;
            case 1 -> this.yCoordinate = this.yCoordinate - currentSpeed;
            case 2 -> this.xCoordinate = this.xCoordinate - currentSpeed;
            case 3 -> this.yCoordinate = this.yCoordinate + currentSpeed;
        }
    }
    public void turnLeft(){
        this.direction--;
        this.direction = Math.floorMod(direction, 4);
    }
    public void turnRight(){
        this.direction++;
        this.direction = Math.floorMod(direction, 4);
    }
}
//Gas function, should only be able to take in values from 0 to 1. For example if greater or less than 0, do something!
//If less than or equal to 1, continue. Should take in the variable "amount"

//"move" should be dependent on "currentSpeed"
//The move function should only update x-cordinates when it is used, for example it should move 10 x-coordinates.
//When "turn-right" is used, then the direction of car should change, but not a coordinate