import java.awt.*;
//Create an inheritance,(like class Car?, check the example files!).

// Set the variables, methods and class attributes to private, as all are public at the moment!(Make Class car abstract!)

//Method for turbo should be left in Saab(because it is unique to Saab)

//public Saab95(int nrDoors, double enginePower...)

//We should then here write implements movable, since a interface is empty?
public class Saab95 extends Car{

    private boolean turboOn; //Private

    public Saab95(){
        super(1, 2, Color.red, "Saab 95");
//        //nrDoors = 2;
//        //color = Color.red; //All cars will have this
//        enginePower = 125;
//        turboOn = false; //The attributes of every car should not be defined, except currentSpeed that should be zero?
//        modelName = "Saab95";
//        xCoordinate = 0; //X and Y coordinates should also be defined? And direction
//        yCoordinate = 0;
//        direction = 1;
//        stopEngine();

    }


    private void setTurboOn(){
        turboOn = true;
    }

    private void setTurboOff(){
        turboOn = false;
    }

    @Override
    protected double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return enginePower * 0.01 * turbo;
    }


}
