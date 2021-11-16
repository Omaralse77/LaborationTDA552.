import java.awt.*;
//Create an inheritance,(like class Car?, check the example files!).

// Set the variables and class attributes to private, as all are public at the moment!(Abstract method)

//Trimfactor method in volvo should be left, because it is unique to volvo

//Sök upp protected, föreläsning 9 november

public class Volvo240 extends Car{

    private final static double trimFactor = 1.25; //Variables should probably not be public? Applicable to everything here
    //volvo should be public instead
    private Volvo240(){
        nrDoors = 4;
        color = Color.black;
        modelName = "Volvo240";
        enginePower = 106;
        xCoordinate = 0;
        yCoordinate = 0;
        direction = 1;
        stopEngine();

    }
    protected double speedFactor(){
        return enginePower * 0.01 * trimFactor;
    }

}
