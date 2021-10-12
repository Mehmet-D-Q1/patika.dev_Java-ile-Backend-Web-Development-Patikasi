package patika_dev_java101;

import java.util.Random;
import java.util.Scanner;

public class Grid {
    int width, height, size;
    int[][] mapBoard;
    int[][] gameBoard;

    Scanner input = new Scanner(System.in);
    Random random = new Random();


    Grid(int h, int w) {
        this.height = h;
        this.width = w;
        this.size = h * w;
        this.mapBoard = new int[h][w];
        this.gameBoard = new int[h][w];
    }

    //Mine Board:
    public void prepareGame(int[][] board) {
        int randRow, randCol, count = 0;
        while (count < (size / 4)) {
            randRow = random.nextInt(height);
            randCol = random.nextInt(width);
            if (board[randRow][randCol] != -1) {
                board[randRow][randCol] = -1;
                count++;
            }
        }
    }

    public void printBoard(int[][] getArray) {
        for (int i = 0; i < getArray.length; i++) {
            for (int j = 0; j < getArray.length; j++) {
                if (getArray[i][j] == 0){
                    System.out.print(" 0 ");
                }
                else if (getArray[i][j] > 0){
                    System.out.print(" "+getArray[i][j]+" ");
                }
                else{
                    System.out.print(getArray[i][j]+" ");
                }
            }
            System.out.println();
        }
    }

    int askRow() { //Satır indisi girişi:
        int r = -1;
        while (r < 0 || r >= height) {
            System.out.println("\nSelect a Row: [0 ... " + (height - 1) + "]");
            r = input.nextInt();

        }
        return r;
    }

    int askCol() {//Sütun indisi girişi:
        int c = -1;
        while (c < 0 || c >= width) {
            System.out.println("\nSelect a Column: [0 ... " + (width - 1) + "]");
            c = input.nextInt();
        }
        return c;
    }

    void checkAdjMine(int r, int c) {
        if (mapBoard[r][c] == -1){ //mayınlı haritadaki bu kordinatta -1(mayın) varsa;
            gameBoard[r][c] = -1; //bu kordinatı game haritasına işleyecek.
        }

        else {
        //MineBoard'da mayın olan noktaları hesaplayıp Game Boarda aktarma:
        //Bitişiğinde bomba var mı? kontrolleri:
        int count = 0;
        //Üst eleman:
        if ((r - 1) >= 0) {
            if (mapBoard[r - 1][c] == -1) {
                count++;
            }
        }
        //Üst-sol eleman:
        if (((r - 1) >= 0) && ((c - 1) >= 0)) {
            if (mapBoard[r - 1][c - 1] == -1) {
                count++;
            }
        }
        //Sol eleman:
        if ((c - 1) >= 0) {
            if (mapBoard[r][c - 1] == -1) {
                count++;
            }
        }
        //Alt-sol eleman:
        if (((r + 1) < height) && ((c - 1) >= 0)) {
            if (mapBoard[r + 1][c - 1] == -1) {
                count++;
            }
        }
        //Alt eleman:
        if ((r + 1) < height) {
            if (mapBoard[r + 1][c] == -1) {
                count++;
            }
        }
        //Alt-sağ eleman:
        if (((r + 1) < height) && ((c + 1) < width)) {
            if (mapBoard[r + 1][c + 1] == -1) {
                count++;
            }
        }
        //Sağ eleman:
        if ((c + 1) < width) {
            if (mapBoard[r][c + 1] == -1) {
                count++;
            }
        }
        //Üst-sağ eleman:
        if (((r - 1) >= 0) && ((c + 1) < width)) {
            if (mapBoard[r - 1][c + 1] == -1) {
                count++;
            }
        }
        gameBoard[r][c] = count; //mapBoard koordinatındaki bitişik mayın sayısını gameBoard'a aktarma
            if (count == 0){
                gameBoard[r][c]= 0;
                System.out.println("Girdiğiniz koordinatta mayın yok -> " +"("+r+","+c+"):" + count);

            }
        }
    }

    boolean checkLoss(int r, int c) {

        if (mapBoard[r][c] == -1) {
            System.out.println();
            System.out.println("*******");
            System.out.println("BOOOOM!");
            System.out.println("*******");
            System.out.println("You Lose!");
            return false;
        }
        return true;
    }

    boolean checkWin(){
        boolean win = false;
        int counter = 0;
        for (int j = 0; j < height; j++){
            for (int i = 0; i < width; i++){
                if(gameBoard[i][j] > 0) {
                    counter++;
                }
            }
        }

        if (counter == (size - size/4)) {
            win = true;
            System.out.println("\nYou Win!");
        }
        return win;
    }


}
