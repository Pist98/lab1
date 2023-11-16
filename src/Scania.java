import java.awt.*;

public class Scania extends Car{
    double svinkel=0;
    double vinkel;
    HelperFlak s = new HelperFlak(70, 0, svinkel);

    public Scania(){
        nrDoors = 2;
        color = Color.white;
        enginePower = 530;
        modelName = "Scania";
        stopEngine();

    }

    protected void check_speed_for_flak() {
        if (getCurrentSpeed() == 0) {
            svinkel = svinkel + vinkel;}
        }

    protected void closed_flak() {
        if (getCurrentSpeed() > 0) {
            vinkel=0;
        }
    }

    public void raise(){
    if (s.check_iftrue()){
        s.höj_flak();
    }
    }

    public void lower(){
        if (s.check_iftrue()){
            s.sänk_flak();
        }
    }



    @Override // Den gör ingenting egentligen ty bilen är ej beroande av engine/motorn
    protected void startEngine() {
        if (vinkel>0) {stopEngine();}
        else {currentSpeed = 0.1;}
    }
}
