package patika_dev_java101;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Matematik Notunuz: ");
        int math = input.nextInt();
        System.out.println("Fizik Notunuz: ");
        int physics = input.nextInt();
        System.out.println("Kimya Notunuz: ");
        int chemistry = input.nextInt();
        System.out.println("Türkçe Notunuz: ");
        int turkish = input.nextInt();
        System.out.println("Tarih Notunuz: ");
        int history = input.nextInt();
        System.out.println("Müzik Notunuz: ");
        int music = input.nextInt();
        int toplam = math + physics + chemistry + turkish + history + music;
        double sonuc = (double) toplam / 6.0D;
        boolean durum = sonuc > 60.0D;
        System.out.println(durum ? "Sınıfı Geçti" : "Sınıfta Kaldı");
        System.out.println("Not Ortalamanız:" + sonuc);
    }
}