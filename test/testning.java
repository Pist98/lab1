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



}
