import java.util.ArrayList;

public class Workshop < T extends CarPersonal>  {

    int max=8;
    ArrayList<T> loaded_cars = new ArrayList <>();
    ArrayList<T> unloaded_car = new ArrayList <>();



    public void load(T car) {
        if (loaded_cars.size() < max) {
            loaded_cars.add(car);}
    }

    public void unload(){
        int last_car= loaded_cars.size() -1;
        unloaded_car.add(loaded_cars.get(last_car));
        loaded_cars.remove(last_car);
    }
}

