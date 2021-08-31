package patika_dev_java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // n! = 1*2*3*4*5*....*n

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int number = input.nextInt();

        System.out.println("-----For------");
        int total = 1;
        for (int i = 1; i <= number; i++) {
            total = total * i;

        }

        System.out.println("-----While------");
        System.out.println(number + " Faktöriyel: " + total);

        int j = 1;
        int fakt = 1;
        while (j <= number){
            fakt = fakt * j;
            j++;
        }
        System.out.println(number + " Faktöriyel: " + fakt);

    }
}
