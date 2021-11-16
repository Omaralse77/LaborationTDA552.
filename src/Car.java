import java.awt.*;
//

//Create abstract method of incrementSpeed for example, since it is implemented in different ways in Saab resp. Volvo
public abstract class Car {
//
    protected int nrDoors; //Is it better to use private and super in the main class? Yes, use private instead, then use getters,
    protected double enginePower;
    protected double currentSpeed;
    protected Color color;
    protected String modelName;
    protected double xCoordinate;
    protected double yCoordinate;
    protected int direction;

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
    public Color getColor(){
        return color;
    }
    public void setColor(Color clr){
        color = clr;
    }
    public void startEngine(){
        currentSpeed = 0.1;
    }
    protected void stopEngine(){
        currentSpeed = 0;
    }



    // TODO fix this method according to lab pm
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