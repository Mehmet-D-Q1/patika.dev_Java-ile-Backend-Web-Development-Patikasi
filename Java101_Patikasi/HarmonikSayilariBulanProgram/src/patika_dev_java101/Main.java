package patika_dev_java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int number = input.nextInt();
        double s = 0;

        for (int i = 1; i <= number; i++) {
             s = s + 1.0/i ;

        }
        System.out.println(s);

    }
}
