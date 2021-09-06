package patika_dev_java101;

public class Main {

    public static void main(String[] args) {

        //The Fibonacci numbers are the numbers in the following integer sequence.
        //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...

        int countOfFibElements = 10;
        System.out.println(fib(countOfFibElements)); //fibonacci serisindeki girilen sayıdaki değerini bulur.

        for (int i = 0; i <= countOfFibElements; i++) { //fibonacci serisindeki girilen sayıya kadar olan elemanları bulur.
            System.out.print(fib(i) + " ");
        }

    }

    static int fib(int n){

        if(n == 0 || n == 1){
            return n;
        }
        else {
            return fib(n-1)+fib(n-2);
        }

    }
}
