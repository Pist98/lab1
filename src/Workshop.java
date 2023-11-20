import java.util.ArrayList;

public class Workshop {
    int max=3;
    ArrayList<Volvo240> loaded_volvos = new ArrayList <>();
    public void load(Volvo240 car) {
        if (loaded_volvos.size() < max) {
            loaded_volvos.add(car);}
    }
    public void unload(){
        int last_car= loaded_volvos.size() -1;
        loaded_volvos.remove(last_car);
    }

}
