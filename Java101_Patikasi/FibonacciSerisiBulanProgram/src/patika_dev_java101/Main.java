package patika_dev_java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // 1 1  2  3  5  8  13 ...
        //n1 n2 n3
        //   n1 n2 n3
        //      n1 n2 n3

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Fibonacci Serisinin eleman sayısını giriniz: ");
        int number = input.nextInt();

        int n1 = 0, n2 = 1;
        int n3;
        for (int i = 0; i < number; i++) {
            System.out.print(n1 + " ");
            n3 =  n1 + n2;
            n1 = n2;
            n2 = n3;

        }

    }
}
