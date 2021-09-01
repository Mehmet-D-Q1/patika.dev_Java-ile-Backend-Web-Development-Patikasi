package patika_dev_java101;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int digitValue;
        int digitPow;

        for (int i = 100; i < 1000; i++) {
            int resultValue = 0;
            int sayi = i;
            //Girilen sayının 1'ler basamağındaki sayı ve üs alma işlemleri:
            while (sayi != 0) {
                digitValue = sayi % 10; //birler basamağındaki sayı(yani 10 ile bölümünden kalan)
                digitPow = 1;

                //Basamak sayısı kadar basamaktaki değerin çarpımı(yani üs alma işlemi)
                for (int j = 1; j <= 3; j++) {
                    digitPow = digitPow * digitValue;
                }

                sayi = sayi / 10; //sayının 10'a bölümünden elde edilen bölüm(yani basamağı sondan 1 eksiltmiş olduk)
                resultValue = resultValue + digitPow;
            }
            if (resultValue == i) {
                System.out.println(resultValue);
            }
        }

    }
}
