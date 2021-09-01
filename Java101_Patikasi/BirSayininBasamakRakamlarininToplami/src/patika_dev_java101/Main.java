package patika_dev_java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int number = input.nextInt();

        int tempNumber = number;
        int digitValue = 0;
        int totalResult = 0;

        //Girilen sayının 1'ler basamağındaki sayı ve üs alma işlemleri:
        while (tempNumber != 0) {
            digitValue = tempNumber % 10; //birler basamağındaki sayı(yani 10 ile bölümünden kalan)
            tempNumber = tempNumber / 10; //sayının 10'a bölümünden elde edilen bölüm(yani basamağı sondan 1 eksiltmiş olduk)
            totalResult = totalResult + digitValue;

        }
        System.out.println("Girilen sayının basamak sayılarının toplamı: " + totalResult);

    }
}
