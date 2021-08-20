package patika_dev_java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a,b,c;
        double alan,cevre,u;

        Scanner input = new Scanner(System.in);
        System.out.println("1. Kenar uzunluğunu giriniz: ");
        a = input.nextInt();
        System.out.println("2. Kenar uzunluğunu giriniz: ");
        b = input.nextInt();
        System.out.println("3. Kenar uzunluğunu giriniz: ");
        c = input.nextInt();

        cevre = (a + b + c);
        u = cevre/2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgenin Alanı : " + alan);
        System.out.println("Üçgenin Çevresi : " + cevre);
    }
}
