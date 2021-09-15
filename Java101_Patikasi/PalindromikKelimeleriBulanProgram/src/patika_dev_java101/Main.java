package patika_dev_java101;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrom("kayak"));
        System.out.println(isPalindrom2("kayak"));

    }
    //1.yöntem:
    static boolean isPalindrom(String str){
        int start = 0;
        int end = str.length() - 1;
        while (start < end){
            if (str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    //2.yöntem:
    static boolean isPalindrom2(String str2){
        String reverse = "";
        for (int i = str2.length()-1; i >= 0; i--) {
            reverse += str2.charAt(i);
        }
        if (str2.equals(reverse)){
            return true;
        }
        else {
            return false;
        }
    }
}
