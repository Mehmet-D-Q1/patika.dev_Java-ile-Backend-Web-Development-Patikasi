package patika_dev_java101;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        int month,day;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen doğduğunuz ayı sayı olarak giriniz: ");
        month = input.nextInt();
        System.out.println("Lütfen doğduğunuz günü sayı olarak giriniz: ");
        day = input.nextInt();

        String burc = "";
        boolean isError = false;

        if (month == 1){
                if ((day >= 22 && day <= 31)){
                    burc = "Kova";
                }
                else if ((day <= 21 && day > 0)){
                    burc = "Oğlak";
                }
                else isError = true;
        }

        else if (month == 2) {
                if ((day >= 20 && day <= 28)) {
                    burc = "Balık";
                } else if ((day <= 19 && day > 0)) {
                    burc = "Kova";
                } else isError = true;
        }

        else if (month == 3) {

                if ((day >= 21 && day <= 31)) {
                    burc = "Koç";
                } else if ((day <= 20 && day > 0)) {
                    burc = "Balık";
                } else isError = true;
        }

        else if (month == 4) {

                if ((day >= 21 && day <= 30)) {
                    burc = "Boğa";
                } else if ((day <= 20 && day > 0)) {
                    burc = "Koç";
                } else isError = true;
        }

        else if (month == 5) {

                if ((day >= 22 && day <= 31)) {
                    burc = "İkizler";
                } else if ((day <= 21 && day > 0)) {
                    burc = "Boğa";
                } else isError = true;
        }

        else if (month == 6) {

                if ((day >= 23 && day <= 30)) {
                    burc = "Yengeç";
                } else if ((day <= 22 && day > 0)) {
                    burc = "İkizler";
                } else isError = true;
        }

        else if (month == 7) {

                if ((day >= 23 && day <= 31)) {
                    burc = "Aslan";
                } else if ((day <= 22 && day > 0)) {
                    burc = "Yengeç";
                } else isError = true;
        }

        else if (month == 8) {

                if ((day >= 23 && day <= 31)) {
                    burc = "Başak";
                } else if ((day <= 22 && day > 0)) {
                    burc = "Aslan";
                } else isError = true;
        }

        else if (month == 9) {

                if ((day >= 23 && day <= 30)) {
                    burc = "Terazi";
                } else if ((day <= 22 && day > 0)) {
                    burc = "Başak";
                } else isError = true;
        }

        else if (month == 10) {

                if ((day >= 23 && day <= 31)) {
                    burc = "Akrep";
                } else if ((day <= 22 && day > 0)) {
                    burc = "Terazi";
                } else isError = true;
        }

        else if (month == 11) {

                if ((day >= 23 && day <= 30)) {
                    burc = "Yay";
                } else if ((day <= 21 && day > 0)) {
                    burc = "Akrep";
                } else isError = true;
        }

        else if (month == 12) {

                if ((day >= 22 && day <= 31)) {
                    burc = "Oğlak";
                } else if ((day <= 21 && day > 0)) {
                    burc = "Yay";
                } else isError = true;
        }

        else{
                isError = true;
        }

        if (isError){
            System.out.println("Hatalı giriş yaptınız...");
        }
        else {
            System.out.println("Merhaba, Burcunuz: " + burc);
        }

    }
}
