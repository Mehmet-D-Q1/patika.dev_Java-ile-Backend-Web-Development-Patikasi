package patika_dev_java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int number;
        int total = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Lütfen bir sayı giriniz: ");
            number = input.nextInt();
            if (number % 2 == 1) {
                total = total + number;
            }
        }
        while (number > 0);
        System.out.println("Tek sayıların toplama: " + total);


    }
}
