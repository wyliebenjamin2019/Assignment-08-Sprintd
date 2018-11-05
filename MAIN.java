public class Main {

    public static double Effort;
    public static void main(String[] args) {
        Effort = 1570;
        calcCap(8, 3, 30);
        calcCap(9, 3, 30);
        calcCap(10, 3, 30);
        calcCap(11, 3, 30);
        calcCap(8, 4, 30);
        calcCap(8, 5, 30);
        calcCap(8, 6, 30);
        calcCap(8, 3, 35);
        calcCap(9, 3, 35);
        calcCap(10, 3, 35);
        calcCap(11, 3, 35);
        calcCap(8, 4, 35);
        calcCap(8, 5, 35);
        calcCap(8, 6, 35);
        calcCap(8, 3, 40);
        calcCap(9, 3, 40);
        calcCap(10, 3, 40);
        calcCap(11, 3, 40);
        calcCap(8, 4, 40);
        calcCap(8, 5, 40);
        calcCap(8, 6, 40);
    }
        public static void calcCap(int devs, int weeks, int hrswk) {
            double cap = (100*(Effort)/(devs*weeks*hrswk));
            System.out.printf("With %d developers working a %d week sprint with %d hrs/wk, the work capacity level would be at %.2f%%\n" ,devs,weeks,hrswk,cap);
        }
    }

