package patika_dev_java101;

import java.util.Arrays;

public class Main1 {

    public static void main(String[] args) {

        int[] myArray = new int[]{10, 20, 20, 10, 10, 20, 5, 20, 5, 9, 20};
        //int counter = 0;
        for (int i = 0; i < myArray.length ; i++) {
            int counter = 0;
            for (int j = 0; j < myArray.length; j++) {

                if ((i != j) && (myArray[i] == myArray[j])){
                    if (isExist(myArray,i,myArray[i])){
                        break;
                    }
                    counter++;

                }
                else if ((i == j) && (myArray[i] == myArray[j])){

                    if (isExist(myArray,i,myArray[i])){
                        break;
                    }
                    counter++;
                }


            }System.out.println(myArray[i]+""+counter);

        }
        System.out.println(Arrays.toString(myArray));


    }

    public static boolean isExist(int[] arr, int ind, int elm){
        boolean status = false;
        for (int i = 0; i < ind; i++) {
            if (arr[i] == elm ){
                status = true;
                break;
            }

        }
        return status;

    }
}
