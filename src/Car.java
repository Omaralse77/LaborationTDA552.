import java.awt.*;
//
//Will later be written as "public abstract class Car implements Movable"
//Create abstract method of incrementSpeed for example, since it is implemented in different ways in Saab resp. Volvo
public abstract class Car  {
//
    private final int nrDoors; //Is it better to use private and super in the main class? Yes, use private instead, then use getters,
    private final double enginePower; //should not exist
    public double currentSpeed; //should it be public?
    private Color color; //should not exist
    private final String modelName; //should not exist
    private final double xCoordinate; //should exist? but in private, should it be private?
    private final double yCoordinate; //Should also be public, as X coordinate
    private final int direction; //should be public



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


    //public Car(int nrDoors
    // this.nrDoors = nrDoors

    //private in nrDoors
    //...
    //public Car(int nrDoors, enginePwer, color, modelname
    //this.nrDoors = nrDoors
    //...
    //
    //Should have setCurrentspeed (private)
    //this.currentSpeed

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
    public String getModelName() {
        return modelName;
    }
    public Color getColor(){
        return color;
    }
    public void setColor(Color clr){
        color = clr;
    }
    public double getxCoordinate() {
        return xCoordinate;
    }
    public double getyCoordinate() {
        return yCoordinate;
    }
    public int getDirection() {
        return direction;
    }
    public void startEngine(){
        currentSpeed = 0.1;
    }
    public void stopEngine(){
        currentSpeed = 0;
    }
    // (TODO fix this method according to lab pm)
    protected void gas(double amount){
        incrementSpeed(amount);
    }
    // TODO fix this method according to lab pm
    protected void brake(double amount){
        decrementSpeed(amount);
    }
}

//Gas function, should only be able to take in values from 0 to 1. For example if greater or less than 0, do something!
//If less than or equal to 1, continue. Should take in the variable "amount"

//"move" should be dependent on "currentSpeed"
//The move function should only update x-cordinates when it is used, for example it should move 10 x-coordinates.
//When "turn-right" is used, then the direction of car should change, but not a coordinate