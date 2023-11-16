public class HelperFlak {
    //ska inte extendas
    //Bara rampen som har bounds, max och min 10, 0 grader

    public double vinkel;
    protected double max;
    protected double min;

    public HelperFlak(double the_max, double the_min, double the_vinkel) {
        max = the_max;
        min = the_min;
        vinkel = the_vinkel;
    }


    public boolean check_iftrue() {
        if (vinkel > min && vinkel <= max) {
            return true;}
        else if (vinkel == min) {
            return false;}
        else {
            return true;
        }
    }


    public void höj_flak() {
       // if (check_iftrue()) {
            vinkel += 5;
            if (vinkel > 70) {
                vinkel = 70;
            }
        }
  //  }


    public void sänk_flak() {
   //     if (check_iftrue()) {
            vinkel -= 5;
            if (vinkel < 0) {
                vinkel = 0;
            }
        }
  //  }


}











