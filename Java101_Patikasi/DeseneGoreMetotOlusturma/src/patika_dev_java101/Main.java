package patika_dev_java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Lütfen bir sayı giriniz: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int result2 = number;
        System.out.print(number + " ");

        decreaseNumber(number, result2);

    }

    static void decreaseNumber(int number, int result2) {
        int result = number;

        if (result > 0) {
            result = result - 5;
            System.out.print(result + " ");
            //call the method
            if (result > 0) {
                decreaseNumber(result, result2);
            } else {
                increaseNumber(result, result2);
            }
        }
    }

    static void increaseNumber(int number, int result2) {
        int result = number;

        if (result <= 0) {

            result = result + 5;
            System.out.print(result + " ");
            if (result == result2) {
                //System.out.println("eşitlendi...");
            } else {
                increaseNumber(result, result2);
            }

        } else {
            result = result + 5;
            System.out.print(result + " ");
            if (result == result2) {
                //System.out.println("eşitlendi...");
            } else {
                increaseNumber(result, result2);
            }

        }

    }

}
