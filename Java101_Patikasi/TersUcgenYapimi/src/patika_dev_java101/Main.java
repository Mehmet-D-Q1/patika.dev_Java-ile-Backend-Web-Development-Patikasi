package patika_dev_java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Basamak sayısını giriniz: ");
        int row = input.nextInt();

        for (int i = row; i >= 1; i--) {
            // ilgili i satırına ait boşlukları basma:
            for (int j = 1; j <= row-i ; j++) {
                System.out.print(" ");
            }
            // ilgili i satırına ait yıldızları basma:
            for (int k = 1; k <= 2*i-1 ; k++) {
                System.out.print("*");
            }

            System.out.println();
        }


    }
}
