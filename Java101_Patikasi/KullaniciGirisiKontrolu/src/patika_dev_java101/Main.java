package patika_dev_java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String userName, password;

        Scanner input = new Scanner(System.in);
        System.out.println("Kullanıcı adınız: ");
        userName = input.nextLine();
        System.out.println("Şifreniz: ");
        password = input.nextLine();

        String userName2 = "patika";
        String password2 = "java123";

        if (userName.equals(userName2) && password.equals(password2)){
            System.out.println("Sisteme başarılı bir şekilde giriş yaptınız.");
        }
        else{
            System.out.println("Sistem girişi başarısız! Lütfen bilgilerinizi kontrol ediniz...");
            System.out.println("Kullanıcı adı ve şifrenizi değiştirmek için lütfen 1'i giriniz.");
            char changeInfos = input.nextLine().charAt(0);
            if (changeInfos == '1'){
                System.out.println("Lütfen yeni kullanıcı adınızı giriniz:");
                userName2 = input.nextLine();
                System.out.println("Lütfen yeni kullanıcı şifrenizi giriniz:");
                password2 = input.nextLine();
                if (userName2.equals(userName) || password2.equals(password)){
                    System.out.println("Girdiğiniz kullanıcı bilgileriniz daha önceki bilgilerinizle aynı. Kullanıcı bilgileriniz oluşturulamadı.");
                }
                else {
                    System.out.println("Kullanıcı bilgileriniz başarılı bir şekilde oluşturuldu...");
                }
            }

        }

    }
}
