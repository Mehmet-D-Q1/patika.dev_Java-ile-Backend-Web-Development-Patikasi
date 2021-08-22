package patika_dev_java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double number1, number2;
        char selection;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 1. sayıyı giriniz: ");
        number1 = input.nextDouble();
        System.out.println("Lütfen 2. sayıyı giriniz: ");
        number2 = input.nextDouble();

        System.out.println("Lütfen yapmak istediğiniz matematiksel işlemi giriniz: " +
                "\nToplama: + \nÇıkarma: - \nÇaprma: * \nBölme: /");

        selection = input.next().charAt(0);

        switch (selection) {
            case '+':
                System.out.println("Toplama işlemini seçtiniz");
                System.out.println("Sonuç: " + (number1 + number2));
                break;
            case '-':
                System.out.println("Çıkarma işlemini seçtiniz");
                System.out.println("Sonuç: " + (number1 - number2));
                break;
            case '*':
                System.out.println("Çarpma işlemini seçtiniz");
                System.out.println("Sonuç: " + (number1 * number2));
                break;
            case '/':
                System.out.println("Bölme işlemini seçtiniz");
                if (number2 != 0) {
                    System.out.println("Sonuç: " + (number1 / number2));
                } else {
                    System.out.println("Bir sayı sıfıra bölünemez!, Lütfen sıfırdan farklı bir sayı giriniz...");
                }
                break;
            default:
                System.out.println("Lütfen doğru işlem seçiniz...");
        }

    }

}




