package patika_dev_java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double boy, kilo;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu metre olarak giriniz: ");
        boy = input.nextDouble();
        System.out.println("Lütfen kilonuzu kg olarak giriniz: ");
        kilo = input.nextDouble();

        double vki = kilo / (boy * boy) ;

        System.out.println("Vücut Kitle İndeks'iniz: " + vki);
    }
}
