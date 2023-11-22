import org.junit.Test;

import javax.swing.table.DefaultTableCellRenderer;
import java.util.Arrays;

import static org.junit.Assert.assertTrue;
//Skriva ett test för att kolla falk
public class test_MANTGX440 {
    Volvo240 volvo1 = new Volvo240();
    Volvo240 volvo2 = new Volvo240();
    Saab95 saab1= new Saab95();
    MANTGX440 mantgx440= new MANTGX440();//Cannot load on mantgx440 bc it's a Car(truck) and not a personal car

    @Test
    public void Move_when_flak_is_open(){
        MANTGX440 truck = new MANTGX440();
        truck.raise_flak();
        truck.gas(0.7);
        assertTrue(truck.getCurrentSpeed()==0);
    }

    @Test
    public void load_on_cars() {
        MANTGX440 truck = new MANTGX440();
        truck.load(volvo1);
        truck.load(saab1);
        assertTrue(truck.loaded_cars.size()==2);
    }
    @Test
    public void Check_pos_for_the_loaded_cars() {
        MANTGX440 truck = new MANTGX440();
        truck.load(volvo1);
        truck.load(volvo2);
        truck.startEngine();
        truck.move();//the x_pos will remain the same cuz the truck is moving straight forward
        truck.move();
        double y1= truck.y;
        double y2= volvo1.y;
        double y3= volvo2.y;
        assertTrue(y1==y2 && y2==y3);
    }
    @Test
    public void load_on_cars_then_move() {
        MANTGX440 truck = new MANTGX440();
        double y0=truck.getYPos();
        truck.load(volvo1);
        truck.startEngine();
        truck.move();
        assertTrue(truck.getYPos()>y0);
    }
    @Test
    public void load_off_cars() {
        MANTGX440 truck = new MANTGX440();
        truck.load(volvo1);
        truck.load(saab1);
        truck.unload();
        assertTrue(truck.loaded_cars.size()==1);
    }

    @Test
    public void load_more_than_limit() {
        MANTGX440 truck = new MANTGX440();
        for (int i = 0; i < 15; i++) {
            truck.load(saab1);
        }
        assertTrue(truck.loaded_cars.size()==8);
    }

}





