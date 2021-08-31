package patika_dev_java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen sınır sayısını giriniz: ");
        int number = input.nextInt();


        for (int i = 1; i <= number ; i*=400) {

            System.out.println(i);
        }




    }
}
