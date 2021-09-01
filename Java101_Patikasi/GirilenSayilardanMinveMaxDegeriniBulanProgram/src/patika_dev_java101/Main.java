package patika_dev_java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int max = 0;
        int min = 0;
        int iNumber;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen sayı adedini giriniz: ");
        int countNumber = input.nextInt();

        for (int i = 1; i <= countNumber; i++) {
            System.out.print("Lütfen "+i+". sayıyı giriniz: " );
            iNumber = input.nextInt();

            if (i == 1){ // ilk elemanı min. değer olarak kabul ettiğimiz için şart koyduk.
                min = iNumber; //assume first entered number as small one
            }

            //comparing each time entered number with large one
            if (iNumber > max){
                max = iNumber;
            }

            //comparing each time entered number with smallest one
            if (iNumber < min){
                min = iNumber;
            }

        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
