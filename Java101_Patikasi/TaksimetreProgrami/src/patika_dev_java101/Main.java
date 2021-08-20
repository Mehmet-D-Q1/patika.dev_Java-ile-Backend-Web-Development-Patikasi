package patika_dev_java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int km;
        double perKm = 2.2, total, startPrice = 10;

        Scanner input = new Scanner(System.in);
        System.out.println("Gidilecek mesafeyi km olarak giriniz: ");
        km =input.nextInt();

        total = (km * perKm) + startPrice ;

        total = (total < 20)? 20 : total;
        System.out.println("Toplam Tksimetre Ücreti: " + total + "TL'dir.");

    }
}
