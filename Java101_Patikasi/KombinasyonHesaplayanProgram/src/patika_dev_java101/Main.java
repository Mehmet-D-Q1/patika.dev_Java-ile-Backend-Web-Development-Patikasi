package patika_dev_java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Kombinasyon Formülü:
        //C(n,r) = n! / (r! * (n-r)!)
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen oluştutulacak kümenin eleman sayısını giriniz: ");
        int n = input.nextInt();
        System.out.println("Lütfen oluştutulacak gruplardaki eleman sayısını giriniz: ");
        int r = input.nextInt();

        int combination;

        int faktN = 1;
        for (int i = 1; i <= n; i++) {
            faktN = faktN * i;
        }

        int faktR = 1;
        for (int j = 1; j <= r; j++) {
            faktR = faktR * j;
        }

        int faktNR = 1;
        for (int k = 1; k <= (n-r); k++) {
            faktNR = faktNR * k;
        }

        combination = faktN / (faktR * faktNR);
        System.out.println("("+n+","+r+")"+" kombinasyonu: " + combination);



    }
}
