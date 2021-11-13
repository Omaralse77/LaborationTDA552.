import java.awt.*;
//

//Create abstract method of incrementSpeed for example, since it is implemented in different ways in Saab resp. Volvo
public abstract class Car {

    protected int nrDoors;
    protected double enginePower;
    protected double currentSpeed;
    protected Color color;
    protected String modelName;
    protected double xCoordinate;
    protected double yCoordinate;

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
}

