package patika_dev_java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int r,a;
        double pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz: ");
        r = input.nextInt();
        System.out.println("Dairenin merkez açısının ölçüsünü giriniz: ");
        a = input.nextInt();

        double alan = (pi * r * r * a)/360;
        double cevre = (2 * pi * r * a)/360;

        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevre Yay Uzunluğu: " + cevre);


    }
}
