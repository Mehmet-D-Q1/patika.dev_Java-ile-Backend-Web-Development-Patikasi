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
            if (number % 2 == 0 && number % 4 == 0) {
                total = total + number;
            }
        }
        while (number %2 == 0);
        System.out.println("Çift ve 4'ün katı olan sayıların toplama: " + total);

    }
}
