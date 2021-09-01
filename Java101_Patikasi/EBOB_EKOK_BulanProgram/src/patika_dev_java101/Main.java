package patika_dev_java101;

import java.util.Scanner;

public class Main {

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

        //Yöntem-1:
        int ebob = 1;
        for (int i = 1; i <=enKucuk ; i++) {
            if (number1 %i == 0 && number2 %i == 0){
                //System.out.println(i);
                ebob = i;
            }
        }
        System.out.println("Sayıların EBOB'u: " + ebob);

        System.out.println("-----------------------");

        //Yöntem-2:
        for (int j = enKucuk; j >=1 ; j--) {
            if (number1 %j == 0 && number2 %j == 0){
                //System.out.println(i);
                ebob = j;
                break;
            }
        }
        System.out.println("Sayıların EBOB'u: " + ebob);

        System.out.println("-----EKOK-----");
        int ekok = 1 ;
        for (int i = 1; i <= (number1*number2); i++) {
            if (i %number1 == 0 && i %number2 == 0){
                //System.out.println(i);
                ekok = i;
                break;
            }
        }
        System.out.println("Sayıların EKOK'u: " + ekok );

    }
}
