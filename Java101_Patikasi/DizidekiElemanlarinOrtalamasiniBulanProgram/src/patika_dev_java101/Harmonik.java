package patika_dev_java101;

public class Harmonik {
    public static void main(String[] args) {

        int[] list = {15,6,7,12,7,9,3};
        double hAvarage = 0.0;
        double hSum = 1;
        for (int i = 0; i < list.length; i++) {
            hSum += 1.0/list[i];
            hAvarage = list.length / hSum;
        }

        System.out.println("Sayıların Harmonik Ortalaması: " + hAvarage);
    }
}
