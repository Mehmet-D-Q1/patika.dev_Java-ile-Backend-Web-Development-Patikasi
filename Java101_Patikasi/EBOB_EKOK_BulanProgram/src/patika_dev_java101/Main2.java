package patika_dev_java101;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ilk sayıyı giriniz: ");
        int number1 = input.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz: ");
        int number2 = input.nextInt();

        System.out.println("-----EBOB-----");
        int enKucuk;
        if (number1 > number2){
            enKucuk = number2;
        }
        else enKucuk = number1;

        int ebob = 1;
        int i = 1;
        while (i <=enKucuk) {
            if (number1 %i == 0 && number2 %i == 0){
                //System.out.println(i);
                ebob = i;
            }
            i++;
        }
        System.out.println("Sayıların EBOB'u: " + ebob);

        System.out.println("-----------------------");

        System.out.println("-----EKOK-----");
        int ekok = 1 ;
        int j = 1;
        while (j <= (number1*number2)) {
            if (j %number1 == 0 && j %number2 == 0){
                //System.out.println(i);
                ekok = j;
                break;
            }
            j++;
        }
        System.out.println("Sayıların EKOK'u: " + ekok );

    }
}
