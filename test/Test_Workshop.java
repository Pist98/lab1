import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Test_Workshop {
    Volvo240 volvo1 = new Volvo240();
    Volvo240 volvo2 = new Volvo240();
    Saab95 saab1 = new Saab95();
    Saab95 saab2 = new Saab95();
    Scania scania= new Scania();


    @Test
    public void load_on_volvos() {//cannot load on saabs
        Workshop<Volvo240> workshop = new Workshop<>();
        workshop.load(volvo1);
        workshop.load(volvo2);
        assertTrue(workshop.loaded_cars.size()==2);
    }
    @Test

    public void load_on_saabs() {//Load on ONLY saabs
        Workshop<Saab95> workshop = new Workshop<Saab95>();
        workshop.load(saab1);
        workshop.load(saab2);
        assertTrue(workshop.loaded_cars.size()==2);
    }
    @Test

    public void load_on_cars_all() {//Load on all kind of personal cars but not trucks such as scania and mantgx440
        Workshop<CarPersonal> workshop = new Workshop<CarPersonal>();
        workshop.load(saab1);
        workshop.load(volvo2);
        workshop.load(saab1);
        assertTrue(workshop.loaded_cars.size()==3);
    }


    @Test
    public void load_off_cars() {
        Workshop<CarPersonal> car_workshop = new Workshop<CarPersonal>();
        car_workshop.load(volvo1);
        car_workshop.load(saab1);
        car_workshop.unload();
        assertTrue(car_workshop.loaded_cars.size()==1);
    }
    @Test
    public void check_unloaded_cars() {
        Workshop<CarPersonal> workshop = new Workshop<CarPersonal>();
        workshop.load(volvo1);
        workshop.load(saab1);
        CarPersonal last_car= workshop.loaded_cars.get(1);
        workshop.unload();
        assertTrue(last_car== workshop.unloaded_car.get(0));
    }

    @Test
    public void load_more_than_limit() {
        Workshop workshop = new Workshop();
        for (int i = 0; i < 15; i++) {
            workshop.load(saab2);
        }
        assertTrue(workshop.loaded_cars.size()==8);
    }


}
