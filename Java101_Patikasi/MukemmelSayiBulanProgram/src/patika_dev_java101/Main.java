package patika_dev_java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int number = input.nextInt();
        int total = 0;
        for (int i = 1; i < number; i++) {

            while (number %i == 0){
                //System.out.println(i);
                total = total + i;
                i++;
            }
        }
        if (total == number){
            System.out.println(number + " sayısı mükemmel bir sayıdır.");
        }
        else{
            System.out.println(number + " sayısı mükemmel bir sayı değildir.");
        }



    }
}
