public class Helper implements VerkstadHelper  {


    int count = 0;
    int null_count=0;
    public Car[] lastad = new Car[8];
    public Car[] removed = new Car[8];



    Car bil = new Car();
    public Car[] get_lastad(){return lastad;}

    double Hastighet = bil.getCurrentSpeed();

    public Helper (int Max_antal) {


    }


    public void load (Car loaded){
            if (count<lastad.length){
                lastad[count]=loaded;
                count+=1;}
    }

    public  void load_off(int nr) {
            int sum_nr;
            for (Car s : lastad) {
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




