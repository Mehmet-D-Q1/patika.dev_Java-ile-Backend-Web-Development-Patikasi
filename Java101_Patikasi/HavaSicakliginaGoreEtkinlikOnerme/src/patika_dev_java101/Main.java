package patika_dev_java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen hava sıcaklığını giriniz: ");
        double temperature = input.nextDouble();

        if (temperature < 5){
            System.out.println("Kayak yapabilirsiniz...");
        }
        else if (5 <= temperature && temperature < 15){
            System.out.println("Sinemaya gidebilirsiniz...");
        }
        else if (15 <= temperature && temperature < 25){
            System.out.println("Pikniğe gidebilirsiniz...");
        }
        else if (temperature >= 25){
            System.out.println("Yüzmeye gidebilirsiniz...");
        }

    }
}
