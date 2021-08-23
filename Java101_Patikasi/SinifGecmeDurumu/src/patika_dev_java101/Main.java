package patika_dev_java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        int mathI = 0, physicsI = 0, chemistryI = 0, turkishI = 0, historyI = 0, musicI = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Matematik Notunuz: ");
        int math = input.nextInt();
        if (math<100 && math>0){
            mathI = math;
            count++;
        }

        System.out.println("Fizik Notunuz: ");
        int physics = input.nextInt();
        if (physics<100 && physics>0){
            physicsI = physics;
            count++;
        }

        System.out.println("Kimya Notunuz: ");
        int chemistry = input.nextInt();
        if (chemistry<100 && chemistry>0){
            chemistryI = chemistry;
            count++;
        }

        System.out.println("Türkçe Notunuz: ");
        int turkish = input.nextInt();
        if (turkish<100 && turkish>0){
            turkishI = turkish;
            count++;
        }

        System.out.println("Tarih Notunuz: ");
        int history = input.nextInt();
        if (history<100 && history>0){
            historyI = history;
            count++;
        }

        System.out.println("Müzik Notunuz: ");
        int music = input.nextInt();
        if (music<100 && music>0){
            musicI = music;
            count++;
        }

        int toplam = mathI + physicsI + chemistryI + turkishI + historyI + musicI;
        double sonuc = (double) toplam / count;

        if (sonuc <= 55){
            System.out.println("Sınıfta kaldınız...");
            System.out.println("Not Ortalamanız:" + sonuc);
        }
        else {
            System.out.println("Tebrikler Geçtiniz.");
            System.out.println("Not Ortalamanız:" + sonuc);
        }


    }
}
