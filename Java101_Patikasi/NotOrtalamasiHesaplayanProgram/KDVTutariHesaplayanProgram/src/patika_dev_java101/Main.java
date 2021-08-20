package patika_dev_java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double tutar;
        double kdvOrani;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen ücret tutarını giriniz: ");
        tutar = input.nextDouble();
        boolean limitTutar = tutar < 1000 && tutar > 0;
        kdvOrani = limitTutar? 0.18: 0.08;

        double kdvTutari = tutar * kdvOrani;
        double kdvliTutar = tutar + kdvTutari;
        System.out.println("KDV'siz tutar: " + tutar);
        System.out.println("KDV orani: " + kdvOrani);
        System.out.println("Girdiğiniz ücretin KDV tutarı: " + kdvTutari);
        System.out.println("Girdiğiniz ücretin KDV'li tutarı: " + kdvliTutar);


    }
}
