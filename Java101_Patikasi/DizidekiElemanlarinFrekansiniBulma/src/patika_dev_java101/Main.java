package patika_dev_java101;

public class Main {
    public static void main(String[] args) {
        int[] myArray = new int[]{10, 20, 20, 10, 10, 20, 5, 20, 5, 9, 20};
        int[] visitedArray = new int[myArray.length];
        
        int visited =-1;
        for (int i = 0; i < myArray.length; i++) {
            int counter = 1;
            for (int j = i+1; j < myArray.length; j++) {
                if (myArray[i] == myArray[j]){
                    counter++;
                    visitedArray[j] = visited;

                }
            }
            if (visitedArray[i] != visited){
                visitedArray[i] = counter;
            }
        }
        System.out.println("Tekrar Sayıları:");
        for (int i = 0; i < visitedArray.length; i++) {
            if (visitedArray[i] != visited){

                System.out.println( myArray[i]+" sayısı " + visitedArray[i] + " kere tekrar edildi.");
            }
        }
    }
}
