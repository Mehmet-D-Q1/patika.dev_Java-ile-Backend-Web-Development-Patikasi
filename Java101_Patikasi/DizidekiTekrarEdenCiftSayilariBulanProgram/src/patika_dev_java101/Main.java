package patika_dev_java101;

import java.util.Arrays;

public class Main {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {

        int[] myArray = {3, 7, 2,10, 3, 3, 8, 2, 9, 10, 21, 8, 1, 33, 9, 1, 10};
        int[] duplicatedArray = new int[myArray.length];
        int startIndex = 0;

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                if ((i != j) && (myArray[i] == myArray[j])) {
                    if (!isFind(duplicatedArray, myArray[i])) {
                        duplicatedArray[startIndex++] = myArray[i];

                    }
                    break;
                }
            }
        }
        //System.out.println(Arrays.toString(duplicate));
        for (int item : duplicatedArray) {
            if (item != 0 && item % 2 == 0) {
                System.out.print(item + " ");
            }
        }
    }
}