package patika_dev_java101;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int row,column;
        Scanner input = new Scanner(System.in);
        System.out.println("Satır sayısı: ");
        row = input.nextInt();
        System.out.println("Sütun sayısı: ");
        column = input.nextInt();
        int matrix[][] = new int[row][column];
        System.out.print("Matrisin elemanları: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                matrix[i][j]=input.nextInt();
            }
        }

        System.out.println("Oluşturulan Matris: ");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<column; j++)
            {
                System.out.printf(matrix[i][j]+" ");
            }
            System.out.print("\n");
        }

        int transpose[][] = new int[column][row];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                transpose[j][i]=matrix[i][j];
            }
        }
        System.out.println("Matrisin Transpozu:");
        for(int i=0;i<column;i++)
        {
            for(int j=0;j<row;j++)
            {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }

    }
}
