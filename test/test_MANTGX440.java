import org.junit.Test;

import javax.swing.table.DefaultTableCellRenderer;
import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class test_MANTGX440 {

//car still = true, car speed = false

    @Test
    public void lower_ramp_MANTGX440() {
        MANTGX440 truck = new MANTGX440();
        truck.ramp_up();
        boolean Flak = truck.flak;
        System.out.println(Flak);
        assertTrue(Flak == true);
    }


    @Test
    public void raise_ramp_MANTGX440() {
        MANTGX440 truck = new MANTGX440();
        truck.startEngine();
        truck.gas(0.7);
        truck.ramp_up();
        boolean Flak = truck.flak;
        System.out.println(Flak);
        assertTrue(Flak == false);
    }


    @Test
    public void load_cars_MANTGX440() {
        MANTGX440 truck = new MANTGX440();
        truck.load("volvo240");
        truck.load("saab95");
        System.out.println(Arrays.toString(truck.lastad));
        System.out.println(truck.count);
        assertTrue(truck.count <= truck.lastad.length);
    }

    @Test
    public void load_too_many_cars_MANTGX440() {
        MANTGX440 truck = new MANTGX440();
        for (int i = 0; i < 20; i++) {
            truck.load("volvo" + (i));
        }
        System.out.println(Arrays.toString(truck.lastad));
        System.out.println(truck.count);
        assertTrue(truck.count <= truck.lastad.length);
    }


    @Test //skiter i det för tillfället, ty metoderna fungerar som de ska så det är bara och skriva test
    public void load_off_cars_MANTGX440() {
        MANTGX440 truck = new MANTGX440();
        for (int i = 0; i < 4; i++) {
            truck.load("volvo" + (i));
        }
        truck.load_off(3);
        System.out.println(truck.lastad[0]);
        assertTrue(truck.lastad[0] == "volvo0");
    }


    @Test
    public void load_cars_if_ramp_up() {
        MANTGX440 truck = new MANTGX440();
        String[] before = truck.get_lastad();
        truck.ramp_up();
        truck.load("volvo240");
        String[] after = truck.get_lastad();
        assertTrue(before == after);
    }

    @Test
    public void load_off_cars_if_ramp_up() {
        MANTGX440 truck = new MANTGX440();
        truck.load("volvo240");
        String[] before = truck.get_lastad();
        truck.gas(0.7);
        truck.load_off(1);
        String[] after = truck.get_lastad();
        assertTrue(before == after);
    }





}

