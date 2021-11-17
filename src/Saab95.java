import java.awt.*;
//Create an inheritance,(like class Car?, check the example files!).
// Set the variables, methods and class attributes to private, as all are public at the moment!(Make Class car abstract!)
//Method for turbo should be left in Saab(because it is unique to Saab)
//public Saab95(int nrDoors, double enginePower...)
//We should then here write implements movable, since a interface is empty?
public class Saab95 extends Car{

    private boolean turboOn; //Private

    public Saab95(){
        super(2, 100, Color.red,
                "Saab95", 0, 0,0);
        turboOn = false;
        stopEngine();

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
        return this.getEnginePower()* 0.01 * turbo;
    }

}
