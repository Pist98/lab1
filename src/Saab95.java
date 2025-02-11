import java.awt.*;

public class Saab95 extends CarPersonal {

    private boolean turboOn; //subclass adds one more field

    
     public Saab95(){
         nrDoors = 2;
         color = Color.red;
         enginePower = 125;
	     turboOn = false;
         modelName = "Saab95";
         stopEngine();
    }

    public void setTurboOn(){
	    turboOn = true;
    }

    public void setTurboOff(){
	    turboOn = false;
    }
    
    @Override public double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return enginePower * 0.01 * turbo;
    }

}
