package patika_dev_java101;

import java.util.Scanner;

public class MineSweeper {

    public static void main(String[] args) {
        System.out.println("*******<-Mayın Tarlası Oyunu->******");
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen oynamak istediğiniz alanın satır boyutunu giriniz: ");
        int rowNumber = input.nextInt();

        System.out.println("Lütfen oynamak istediğiniz alanın sütun boyutunu giriniz: ");
        int columnNumber = input.nextInt();

        Grid gameGrid = new Grid(rowNumber, columnNumber);


        gameGrid.prepareGame(gameGrid.mapBoard);
        System.out.println("Mine Board");
        gameGrid.printBoard(gameGrid.mapBoard);

        System.out.println();
        System.out.println("Game Board");
        gameGrid.printBoard(gameGrid.gameBoard);


        boolean keepPlaying = true;
        while(keepPlaying) {
            int checkRow = gameGrid.askRow();
            int checkCol = gameGrid.askCol();

            gameGrid.checkAdjMine(checkRow, checkCol);
            gameGrid.printBoard(gameGrid.gameBoard);
            keepPlaying = gameGrid.checkLoss(checkRow, checkCol);
            gameGrid.checkWin();

        }

    }
}
