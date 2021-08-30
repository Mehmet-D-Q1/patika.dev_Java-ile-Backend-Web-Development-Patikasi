package patika_dev_java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int number;
        double Average = 0;
        int total = 0;
        int count = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz: ");
        number = input.nextInt();

        for (int i = 1; i < number ; i++) {
            if ((i %3 == 0)&&(i %4 == 0)){
                System.out.println(i);
                total = total + i;
                count++;
                Average = total/count;

            }
        }
        System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + Average);
    }
}
