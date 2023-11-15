import jdk.internal.classfile.impl.ClassPrinterImpl;

import java.awt.*;

public class MANTGX440 extends Car {

        public MANTGX440() {
            nrDoors = 2;
            color = Color.black;
            enginePower = 530;
            modelName = "MANTGX440";
            last = 8;
            stopEngine();
        }


    protected void ramp_ner(){
            check_flak();}

    protected void ramp_upp(){
            check_flak();}


    public void load (String bil){
            check_flak();
            if(flak){
            if (count<lastad.length){
                lastad[count]=bil;
                count+=1;
            }
        }
        }

   public  void load_off(int nr) {
       check_flak();
       if (flak) {
           int sum_nr;
           for (String s : lastad) {
               if (s == null) {
                   null_count += 1;
               }
           }

           if (nr > lastad.length) {
               sum_nr = lastad.length;
           } else {
               sum_nr = nr + null_count;
           }

           int j = lastad.length;
           for (int i = 0; i < sum_nr; i++) {
               removed[i] = lastad[j - 1];
               j = j - 1;
           }

           for (int i = lastad.length - 1; i >= (lastad.length - sum_nr); i--) {
               lastad[i] = null;
           }
       }
   }

    //Biltransporten ska inte kunna lasta på en annan biltransport.

    //Under det att en bil är lastad på biltransporten ska dess
    //position i världen alltid vara densamma som biltransportens position.

    }










