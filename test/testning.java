import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class testning {

    @Test
    public void nr_doors_saab() {
        Saab95 s_doors = new Saab95();
       int doors = s_doors.getNrDoors();
       assertTrue(doors == 2);
    }

    @Test
    public void enginePower_test_volvo () {
        Volvo240 engine = new Volvo240();
        double x = engine.getEnginePower();
        assertTrue(x == 100);
    }


    @Test
    public void test_gas_saab95() {
        Saab95 gas_test = new Saab95();
        gas_test.startEngine();
        double current_speed_1= gas_test.getCurrentSpeed();
        gas_test.gas(0,5);
        double current_speed_2= gas_test.getCurrentSpeed();

        assertTrue(current_speed_2>current_speed_1);



    }

        assertTrue(current_speed_2==current_speed_1);
    }

    @Test
    public void test_break_saab95_amount_out_of_low_bound_saab95() { //Break method should not work when "amout" i
        Saab95 saab95_speed = new Saab95();
        saab95_speed.startEngine();  // speed 0.1 always
        double current_speed_1= saab95_speed.getCurrentSpeed();
        saab95_speed.brake(-1);
        double current_speed_2= saab95_speed.getCurrentSpeed();

        assertTrue(current_speed_2==current_speed_1);
    }

    @Test
    public void move_method_saab95() {
        Saab95 move_method = new Saab95();
        move_method.startEngine();  //speed 0.1 always
        double x0= move_method.x; //0
        double y0= move_method.y; //0
        move_method.move();
        double x1= move_method.x; //another value
        double y1= move_method.y; //another value

        assertTrue((x0 == x1) && (y1 > y0)); //bilen tittar upp mot positivt x i startläge

    }

    @Test
    public void turn_left_method_saab95() {
        Saab95 left = new Saab95();
        double d0= left.direction;
        left.turnLeft();
        left.turnLeft();
        double d1 = left.direction;
        assertTrue(d1 > d0);
    }
    @Test
    public void right() {
        Saab95 right = new Saab95();
        double d0= right.direction;
        right.turnRight();
        right.turnRight();
        double d1 = right.direction;
        assertTrue(d0 > d1);
    }

    /*
    @Test
    public void road_trip_saab95() {
        Saab95 trip= new Saab95();
        trip.startEngine();//speed 0.1 always
        double x0 = trip.x;
        double y0= trip.y;
        double d0= trip.direction;
        trip.move();
        trip.turnRight();
        trip.turnRight();
        trip.turnRight();
        trip.move();
        double x1 = trip.x;
        double y1 = trip.y;
        double d1 = trip.direction;
        System.out.println(x0);
        System.out.println(x1);
        System.out.println(y0);
        System.out.println(y1);
        System.out.println(d0);
        System.out.println(d1);


        trip.turnRight();
        trip.move();
        trip.turnRight();
        trip.move();



       assertTrue((x0==x1) && (y0 == y1) && (d0==d1));


     */

    }








}
