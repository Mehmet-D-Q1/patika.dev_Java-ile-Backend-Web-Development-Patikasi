package patika_dev_java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int kiloArmut,kiloElma,kiloDomates,kiloMuz,kiloPatlican;
        double kgFiyatArmut = 2.14, kgFiyatElma = 3.67, kgFiyatDomates = 1.11, kgFiyatMuz = 0.95, kgFiyatPatlican = 5.00;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen almak istediğiniz Armut miktarını(kg) giriniz: ");
        kiloArmut = input.nextInt();
        System.out.println("Lütfen almak istediğiniz Elma miktarını(kg) giriniz: ");
        kiloElma = input.nextInt();
        System.out.println("Lütfen almak istediğiniz Domates miktarını(kg) giriniz: ");
        kiloDomates = input.nextInt();
        System.out.println("Lütfen almak istediğiniz Muz miktarını(kg) giriniz: ");
        kiloMuz = input.nextInt();
        System.out.println("Lütfen almak istediğiniz Patlican miktarını(kg) giriniz: ");
        kiloPatlican = input.nextInt();

        double toplamTutar = kiloArmut * kgFiyatArmut + kiloElma * kgFiyatElma + kiloDomates * kgFiyatDomates + kiloMuz * kgFiyatMuz + kiloPatlican * kgFiyatPatlican;
        System.out.println("Toplam Alış-Veriş Tutarınız: " + toplamTutar + "TL'dir.");
    }
}
