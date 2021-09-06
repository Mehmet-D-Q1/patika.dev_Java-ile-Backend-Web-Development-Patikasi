package patika_dev_java101;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(isPalindrom(2442));

    }

    static boolean isPalindrom(int number){

        int temp = number, reverseNumber = 0, lastDigit;
        while (temp != 0){
            //System.out.println("Number: " + temp);
            lastDigit = temp % 10; //birler basamağındaki sayı(yani 10 ile bölümünden kalan)
            //System.out.println("Son basamak: " + lastDigit);

            reverseNumber = (reverseNumber * 10) + lastDigit;
            //System.out.println("Yeni sayı: " + reverseNumber);

            temp = temp / 10; //sayının 10'a bölümünden elde edilen bölüm(yani basamağı sondan 1 eksiltmiş olduk)
        }
        if (number == reverseNumber){
            return true;
        }
        else {
            return false;
        }

    }
}
