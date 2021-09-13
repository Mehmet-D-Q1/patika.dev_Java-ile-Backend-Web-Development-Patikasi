package patika_dev_java101;

public class Main {

    public static void main(String[] args) {

        int[] list = {15,6,7,12,7,9,3};
        double avarage = 0.0;
        double sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        avarage = sum / list.length;
        System.out.println(avarage);

    }
}
