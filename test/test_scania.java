import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class test_scania {

    @Test
    public void nr_doors_scania () {
        Scania S_doors = new Scania();
        int doors = S_doors.getNrDoors();
        assertTrue(doors == 2);
    }


    @Test
    public void test_gas_scania() {
        Scania scania_speed = new Scania();
        scania_speed.startEngine();
        double current_speed_1 = scania_speed.getCurrentSpeed();
        scania_speed.gas(0.7);
        double current_speed_2 = scania_speed.getCurrentSpeed();
        assertTrue(current_speed_2 > current_speed_1);
    }


    @Test
    public void höj_flak_scania_stilla (){
        Scania höja= new Scania();
        double vinkel=höja.vinkel;

        höja.höj_flak();
        double upp_vinkel= höja.vinkel;
        assertTrue(upp_vinkel == 5);
    }


    @Test
    public void höj_flak_scania_över_70 (){
        Scania höj= new Scania();
        for (int i = 0; i < 20; i++){
        höj.höj_flak();}
        double ny_vinkel= höj.vinkel;
        assertTrue(ny_vinkel == 70);
    }


    @Test
    public void sänk_flak_scania_stilla (){
        Scania sänk= new Scania();
        double vinkel=sänk.vinkel;
        sänk.sänk_flak();
        double ny_vinkel= sänk.vinkel;
        assertTrue(ny_vinkel == 0);

    }


    @Test
    public void start_engine_scania_flak_vinkel_större_än_noll (){
        Scania start_vinkel= new Scania();
         start_vinkel.höj_flak();
        start_vinkel.startEngine();
        start_vinkel.gas(0.7);
        double speed = start_vinkel.getCurrentSpeed();

        double v = start_vinkel.vinkel;
        System.out.println(speed);
        System.out.println(v);
    assertTrue(speed==0);




    }




}
