package patika_dev_java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int distanceKm;
        int age;
        int typeOfTravel;
        double pricePerKm = 0.1;
        double totalPriceOfFlying;
        double discountedAge = 0, discountedTravel = 0;
        double totalDiscountedPriceOfFlying = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yolculuk mesafesini(km) giriniz: ");
        distanceKm = input.nextInt();
        System.out.println("Lütfen yaşınızı giriniz: ");
        age = input.nextInt();
        System.out.println("Lütfen yolculuk tipini giriniz: \n Tek-Yön: 1 \n Gidiş-Dönüş: 2' yi giriniz.");
        typeOfTravel = input.nextInt();

        totalPriceOfFlying = distanceKm * pricePerKm;

        if ((typeOfTravel == 1) && (age > 0) && (distanceKm > 0)){

            if (age < 12){
                discountedAge = totalPriceOfFlying * 0.5;
                System.out.println("Yaş indirimi: " + discountedAge);
            }
            else if (age > 12 && age < 24){
                discountedAge = totalPriceOfFlying * 0.1;
                System.out.println("Yaş indirimi: " + discountedAge);
            }
            else if (age > 65){
                discountedAge = totalPriceOfFlying * 0.3;
                System.out.println("Yaş indirimi: " + discountedAge);
            }
            else{
                totalDiscountedPriceOfFlying = totalPriceOfFlying;
                System.out.println("Toplam Uçuş Fiyatı: " + totalDiscountedPriceOfFlying + "TL'dir.");
                return;
            }
            totalDiscountedPriceOfFlying = (totalPriceOfFlying - discountedAge);
            System.out.println("Toplam İndirimli Uçuş Fiyatı: " + totalDiscountedPriceOfFlying + "TL'dir.");
        }

        else if ((typeOfTravel == 2) && (age > 0) && (distanceKm > 0)) {
            discountedTravel = totalPriceOfFlying * 0.2;
            totalPriceOfFlying = totalPriceOfFlying - discountedTravel;
            System.out.println("Seyahat Tipi İndirimi: " + discountedTravel);
            if (age < 12){
                discountedAge = totalPriceOfFlying * 0.5;
                System.out.println("Yaş indirimi: " + discountedAge);
            }
            else if (age > 12 && age < 24){
                discountedAge = totalPriceOfFlying * 0.1;
                System.out.println("Yaş indirimi: " + discountedAge);
            }
            else if (age > 65){
                discountedAge = totalPriceOfFlying * 0.3;
                System.out.println("Yaş indirimi: " + discountedAge);
            }
            else {
                totalDiscountedPriceOfFlying = totalPriceOfFlying * 2;
                System.out.println("Toplam Uçuş Fiyatı: " + totalDiscountedPriceOfFlying + "TL'dir.");
                return;
            }

            totalDiscountedPriceOfFlying = (totalPriceOfFlying - discountedAge) * 2;
            System.out.println("Toplam İndirimli Uçuş Fiyatı: " + totalDiscountedPriceOfFlying + "TL'dir.");
        }
        else {
            System.out.println("Hatalı veri girdiniz...");
        }

    }
}
