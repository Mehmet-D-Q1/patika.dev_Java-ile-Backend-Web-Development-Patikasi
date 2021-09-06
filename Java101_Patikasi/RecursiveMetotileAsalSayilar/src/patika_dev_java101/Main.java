package patika_dev_java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");
        int number = input.nextInt();
        int i = 2;
        isPrime(number,  i);

    }

    static boolean isPrime(int number, int i) {

        boolean result = true;
        if (number<2){
            result = false;
        }

        while (i < number) {


            if (number % i == 0){ //number sayısı herhangi bir i değerine bölünürse; bir daha kontrol etmeye gerek yok.
                result =  false;
                break; //en yakın döngüden çıkılacak.
            }
            return isPrime(number,i+1);

        }

        if (result){
            System.out.println(number + " Sayısı Asal'dır.");
        }
        else {
            System.out.println(number + " Sayısı Asal değil'dir.");
        }

        return result;
    }
}