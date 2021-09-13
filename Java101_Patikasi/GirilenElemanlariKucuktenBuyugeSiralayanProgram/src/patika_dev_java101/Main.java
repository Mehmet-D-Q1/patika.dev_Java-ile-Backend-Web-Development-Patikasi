package patika_dev_java101;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç elemanlı bir dizi oluşturmak istiyorsunuz: ");
        int number = input.nextInt();

        int[] myArray = new int[number];
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Lütfen "+ i +". indexteki elemanı giriniz: ");
            myArray[i] = input.nextInt();
        }
        //int[] newList = new int[myArray.length];
        //iç içe for ile küçükten büyüğe sıralama:
        int temp = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i+1; j < myArray.length; j++) {
                if (myArray[i] > myArray[j]){
                    temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;


                }
            }
        }
        System.out.print("Sıralama: ");
        for(int item : myArray){
            System.out.print(item + " ");
        }

        //System.out.println("Küçükten büyüğe sıralı dizi-1.yöntem: ");
        //iç içe for ile küçükten büyüğe sıralama:
        //System.out.println("Sıralama: " + Arrays.toString(myArray));
        //System.out.println();

        //System.out.println("Küçükten büyüğe sıralı dizi-2.yöntem: ");
        //Arrays.sort() ile küçükten büyüğe sıralama:
        //Arrays.sort(myArray);
        //System.out.println(Arrays.toString(myArray));




    }
}
