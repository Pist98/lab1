import java.awt.*;
import java.util.ArrayList;

public class MANTGX440 extends Car {

    int max_load;

    ArrayList<CarPersonal> loaded_cars =new ArrayList<CarPersonal>();


    public MANTGX440() {
        nrDoors = 2;
        color = Color.black;
        enginePower = 530;
        modelName = "MANTGX440";
        max_load = 8;
        stopEngine();

    }

    public void load(CarPersonal car) {
        if (loaded_cars.size() < 8 && (car.x==x)) {
            loaded_cars.add(car);}
    }
    public void unload(){
        int last_car= loaded_cars.size() -1;
        loaded_cars.remove(last_car);
    }

    @Override
    public void move(){
        x = x + currentSpeed * (int)Math.cos(Math.toRadians(direction));
        y = y + currentSpeed * (int)Math.sin(Math.toRadians(direction));
        for (CarPersonal car :loaded_cars){
            car.x=x;
            car.y=y;
        }
    }

}





