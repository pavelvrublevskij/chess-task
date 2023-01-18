package lt.codeacademy.week3.chess.complete;

import lt.codeacademy.week3.chess.complete.board.Board;
import lt.codeacademy.week3.chess.complete.piece.PieceColorType;
import lt.codeacademy.week3.chess.complete.piece.knight.Knight;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Board board = new Board();
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Sveiki atvykę į šachmatų lentą!");
        board.draw();
        System.out.print("Įveskite karžygio koordinatęs (pirmiau raidė poto skaičius) ir spauskite ENTER: ");
        String coordinate = scanner.nextLine();
        scanner.close();

        Knight knight = new Knight(PieceColorType.BLACK);
        board.addPieceWithMoves(knight, coordinate);
        board.draw();
    }
}
