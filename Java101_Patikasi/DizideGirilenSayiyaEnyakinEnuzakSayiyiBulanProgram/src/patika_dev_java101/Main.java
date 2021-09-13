package patika_dev_java101;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        int number = input.nextInt();

        int[] list = {15,12,788,1,-1,-778,2,0};
        System.out.println("Mevcut Dizi: " + Arrays.toString(list));
        System.out.println("Girilen Sayı: " + number);
        int[] newList = new int[list.length+1];//yeni bir array oluşturduk(eleman sayısı 1 fazla).

        //Kullanıcıdan girilecek değeri Array'e eklemek için yeni array'e mevcut array elemanlarını ekliyoruz.
        for (int i = 0; i < list.length; i++) {
            newList[i] = list[i];
        }
        //Kullanıcıdan alınan değeri yeni array'e ekledik.
        newList[newList.length-1] = number;

        //iç içe for ile küçükten büyüğe sıralama:
        int temp = 0;
        for (int i = 0; i < newList.length; i++) {
            for (int j = i+1; j < newList.length; j++) {
                if (newList[i] > newList[j]){
                    temp = newList[i];
                    newList[i] = newList[j];
                    newList[j] = temp;
                }
            }
        }

        //System.out.println("Küçükten büyüğe sıralı dizi-1.yöntem: ");
        //iç içe for ile küçükten büyüğe sıralama:
        //System.out.println(Arrays.toString(newList));

        //System.out.println("Küçükten büyüğe sıralı dizi-2.yöntem: ");
        //Arrays.sort() ile küçükten büyüğe sıralama:
        //Arrays.sort(newList);
        //System.out.println(Arrays.toString(newList));

        //Sıralanmış dizide, kullanıcının girdiği değerin index numarasını bulma:
        int index1 = Arrays.binarySearch(newList,number);
        //System.out.println(index1);
        if (newList[index1] == newList[0]){
            System.out.println("Girilen " + number + " sayısı dizinin en küçük elemanıdır.");
            System.out.println("Girilen sayıdan büyük en yakın sayı : " + newList[index1+1]);
        }
        else if(newList[index1] == newList[newList.length-1]){
            System.out.println("Girilen " + number + " sayısı dizinin en büyük elemanıdır.");
            System.out.println("Girilen sayıdan küçük en yakın sayı : " + newList[index1-1]);
        }
        else{
            System.out.println("Girilen sayıdan küçük en yakın sayı : " + newList[index1-1]);
            System.out.println("Girilen sayıdan büyük en yakın sayı : " + newList[index1+1]);
        }

    }
}

