package patika_dev_java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //Basamak Sayısı Bulma:
        //2451 / 10 : 245
        //245 / 10 : 24
        //24 / 10 : 2
        //2 / 10 : 0
        //0 / 10 : 0

        //1'ler Basamağındaki Rakam:
        //2451 % 10 : 1


        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int number = input.nextInt();

        int countOfDigit = 0;
        int digitValue;
        int resultValue = 0;
        int digitPow;
        int number2 = number, number1 = number;

        //Girilen sayının basamak sayısı:
        while (number1 != 0) {
            number1 = number1 / 10;
            countOfDigit++;
        }

        //Girilen sayının 1'ler basamağındaki sayı ve üs alma işlemleri:
        while (number2 != 0) {
            digitValue = number2 % 10;
            digitPow = 1;

            //Basamak sayısı kadar basamaktaki değerin çarpımı(yani üs alma işlemi)
            for (int i = 1; i <= countOfDigit; i++) {
                digitPow = digitPow * digitValue;
            }

            resultValue = resultValue + digitPow;
            number2 = number2 / 10;
        }
        System.out.println(resultValue);
        if (resultValue == number) {
            System.out.println(number + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(number + " sayısı bir Armstrong sayısı değildir.");
        }


    }
}
