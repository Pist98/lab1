import jdk.internal.classfile.impl.ClassPrinterImpl;

import java.awt.*;

public class MANTGX440 extends Car {

   double vinkel;
   HelperFlak x;
   Helper l;

    public MANTGX440() {
        nrDoors = 2;
        color = Color.black;
        enginePower = 530;
        modelName = "MANTGX440";
        stopEngine();
        HelperFlak x = new HelperFlak(0,120, vinkel);
        // if flak= true load car if not dont,
       // Helper l = new Helper();
    }


    protected void ramp_down() {
        if (getCurrentSpeed() == 0) {
            vinkel=120;
        }
    }

    protected void ramp_up() {
        if (getCurrentSpeed() > 0){
            vinkel = 0;
        }
    }

    protected void load_car() {
        if (x.check_iftrue()==true){

        }

    }

}





