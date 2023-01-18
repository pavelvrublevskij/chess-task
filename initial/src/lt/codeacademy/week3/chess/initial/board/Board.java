package lt.codeacademy.week3.chess.initial.board;

import lt.codeacademy.week3.chess.initial.piece.Piece;

import static lt.codeacademy.week3.chess.initial.board.BoardConstants.BORDER_VERTICAL;
import static lt.codeacademy.week3.chess.initial.board.BoardConstants.BOTTOM_LETTERS_WITH_BORDER;
import static lt.codeacademy.week3.chess.initial.board.BoardConstants.CELL;
import static lt.codeacademy.week3.chess.initial.board.BoardConstants.DIGIT;
import static lt.codeacademy.week3.chess.initial.board.BoardConstants.SPACE;
import static lt.codeacademy.week3.chess.initial.board.BoardConstants.TOP_LETTERS_WITH_BORDER;

public class Board {

    private final Piece[][] piecesOnBoard = new Piece[8][8];

    public void draw() {
        System.out.println(TOP_LETTERS_WITH_BORDER);

        for (int i = 0; i < piecesOnBoard.length; i++) {
            System.out.print(DIGIT.charAt(i));
            drawPiece(piecesOnBoard, i);
            System.out.println(DIGIT.charAt(i));
        }

        System.out.println(BOTTOM_LETTERS_WITH_BORDER);
    }

    private void drawPiece(Piece[][] piecesOnBoard, int rowIndex) {
        System.out.print(BORDER_VERTICAL);
        System.out.print(SPACE);
        for (Piece[] pieceObject : piecesOnBoard) {
            // TODO: code in this loop block should be changed to draw pieces, below 2 lines are example for board rendering as result
            System.out.print(CELL);
            System.out.print(SPACE);
        }
        System.out.print(BORDER_VERTICAL);
    }

    public void addPieceWithMoves(Piece piece, String coordinate) {
        /**
         * TODO: find a way add piece to the board and show possible moves in same board view
         *
         * Below console result example illustrate what we expected
         *
         * Įveskite karžygio koordinatęs (pirmiau raidė poto skaičius) ir spauskite ENTER: D3
         * 　　A　B　C　D　E　F　G　H
         *  ╔══════════════════════╗
         * 8║ 　 　 　 　 　 　 　 　 ║8
         * 7║ 　 　 　 　 　 　 　 　 ║7
         * 6║ 　 　 　 　 　 　 　 　 ║6
         * 5║ 　 　 ♘ 　 ♘ 　 　 　 ║5
         * 4║ 　 ♘ 　 　 　 ♘ 　 　 ║4
         * 3║ 　 　 　 ♞ 　 　 　 　 ║3
         * 2║ 　 ♘ 　 　 　 ♘ 　 　 ║2
         * 1║ 　 　 ♘ 　 ♘ 　 　 　 ║1
         *  ╚══════════════════════╝
         * 　　A　B　C　D　E　F　G　H
         */
    }
}
