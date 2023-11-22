import java.awt.*;

public class Scania extends Car {

    double vinkel;

    public Scania(){
        nrDoors = 2;
        color = Color.white;
        enginePower = 530;
        modelName = "Scania";
        stopEngine();

    }

    @Override
    public void raise_flak(){
        check_flak();
        if (flak){
         vinkel += 5;
         if (vinkel > 70) {vinkel = 70;}
        }
    }
    @Override
    public void lower_flak(){
        check_flak();
        if (flak){
            vinkel -= 5;
            if (vinkel < 0) {vinkel = 0;}
            }
        }

    @Override
    public void gas(double amount) {
        if (flak){
            currentSpeed=0;
        }
        else {
        if (amount >= 0 && amount <= 1) {
            incrementSpeed(amount);
            if (currentSpeed > enginePower) {
                currentSpeed = enginePower;}
        }
        }
    }
}
