package patika_dev_java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int number;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz: ");
        number = input.nextInt();

        System.out.println("---for---");

        for (int i = 1; i < number; i++) {
            if (i %2 == 0){

                System.out.println(i);
            }

        }


        System.out.println("---while---");

        int j=1;
        while (j<number){
            if (j %2 == 0){

                System.out.println(j);
            }
            j++;
        }


        System.out.println("---do-while---");
        int k = 1;
        do {
            if (k %2 ==0){
                System.out.println(k);
            }
            k++;
        }
        while (k<number);



    }
}
