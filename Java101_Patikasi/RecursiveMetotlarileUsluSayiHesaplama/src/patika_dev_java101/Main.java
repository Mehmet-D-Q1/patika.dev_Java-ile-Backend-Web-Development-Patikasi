package patika_dev_java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Tabanı gir: ");
        int base = input.nextInt();
        System.out.println("Us'sü gir :");
        int power = input.nextInt();
        System.out.println(recursivePower(base,power));

    }

    static int recursivePower(int base, int power){
/*

        //System.out.println("----While----");
        int i = 1;
        int result = 1;
        while (i <= power){
            result = recursivePower(base,power-1)*base;
            break;
        }
        return result;
*/
/*

        //System.out.println("----IF----");
        if (power == 0){
            return 1;
        }
        else {
            return recursivePower(base,power-1)*base;
        }
*/

        //System.out.println("----For----");
        int total = 1;
        for (int j = 1; j <= power; j++) {
            total = recursivePower(base,power-1) * base;
        }
        return total;


    }
}
