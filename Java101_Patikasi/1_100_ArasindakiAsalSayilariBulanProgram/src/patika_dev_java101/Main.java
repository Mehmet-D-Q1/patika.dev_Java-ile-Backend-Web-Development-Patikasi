package patika_dev_java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int i,j;
        for ( i = 2; i < 100; i++) { //En küçük asal sayı 2 dir. O yüzden 2 'den başlattık.Her sayı 1' e tam bölünür.
            for ( j = 2; j < i; j++) { //j'nin değeri, i ye kadar olan j değişkenine tek tek atanacak.
                if (i % j == 0) { // tam bölünme sağlandığında
                    break; //en yakın döngüden çıkılacak.
                }
            }
            if (i == j) { // sayılar eşitse, asal olanları basacak.
                System.out.println(i);
            }
        }

    }
}
