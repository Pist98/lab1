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
        höja.check_speed_for_flak();
        double upp_vinkel= höja.vinkel;

        System.out.println(upp_vinkel);
        //System.out.println(vinkel1);
        assertTrue(upp_vinkel == 5);
    }

    @Test
    public void sänk_flak_scania_stilla (){
        Scania sänk= new Scania();
        double vinkel = sänk.vinkel;
        System.out.println(vinkel);
        sänk.check_speed_for_flak();
        double ny_vinkel= sänk.vinkel;
        System.out.println(ny_vinkel);
        assertTrue(ny_vinkel == vinkel);

    }

    @Test
    public void höj_flak_scania_över_70 (){
        Scania höj= new Scania();
        for (int i = 0; i < 20; i++){
        höj.raise();}
        double ny_vinkel= höj.vinkel;
        assertTrue(ny_vinkel == 70);
    }


    @Test
    public void start_engine_scania_flak_vinkel_större_noll (){
        Scania scania_flak= new Scania();
        scania_flak.raise();
        scania_flak.startEngine();
        scania_flak.gas(0.7);
        double speed = scania_flak.getCurrentSpeed();
        assertTrue(speed==0);}



    @Test
    public void höj_flak_scania_if_speed_greater_than_zero(){
        Scania höj_om_speed = new Scania();
        höj_om_speed.startEngine();
        höj_om_speed.gas(0.7);
        höj_om_speed.raise();
        double vinkel_flak = höj_om_speed.vinkel;
        assertTrue(vinkel_flak==0);

     }


}
