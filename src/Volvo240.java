import java.awt.*;

public class Volvo240 extends CarPersonal {
    private final static double trimFactor = 1.25;  // subclass adds one more field

    public Volvo240() {
        nrDoors = 4;
        color = Color.black;
        enginePower = 100;
        modelName = "Volvo240";
        stopEngine();
    }

    @Override
    public double speedFactor() {
        return enginePower * 0.01 * trimFactor;
    }



}

