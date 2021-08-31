package patika_dev_java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen üs sayıyı giriniz: ");
        int base = input.nextInt();
        System.out.println("Lütfen taban sayıyı giriniz: ");
        int power = input.nextInt();

        System.out.println("----While----");
        int i = 1;
        int number = 1;
        while (i <= power){
            number = number*base;
            i++;
        }
        System.out.println("Girilen değerler sonucu: " + number);

        System.out.println("----For----");
        int total = 1;
        for (int j = 1; j <= power; j++) {
            total = total * base;
        }
        System.out.println("Girilen değerler sonucu: " + total);

    }
}
