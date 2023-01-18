package lt.codeacademy.week3.chess.complete.board;

import lt.codeacademy.week3.chess.complete.Coordinate;
import lt.codeacademy.week3.chess.complete.piece.knight.Knight;
import lt.codeacademy.week3.chess.complete.piece.Piece;
import lt.codeacademy.week3.chess.complete.piece.PieceColorType;

import static lt.codeacademy.week3.chess.complete.board.BoardConstants.BORDER_VERTICAL;
import static lt.codeacademy.week3.chess.complete.board.BoardConstants.BOTTOM_LETTERS_WITH_BORDER;
import static lt.codeacademy.week3.chess.complete.board.BoardConstants.CELL;
import static lt.codeacademy.week3.chess.complete.board.BoardConstants.DIGIT;
import static lt.codeacademy.week3.chess.complete.board.BoardConstants.LETTER;
import static lt.codeacademy.week3.chess.complete.board.BoardConstants.SPACE;
import static lt.codeacademy.week3.chess.complete.board.BoardConstants.TOP_LETTERS_WITH_BORDER;

public class Board {

    private final Piece[][] pieceOnBoard = new Piece[8][8];

    public void draw() {
        System.out.println(TOP_LETTERS_WITH_BORDER);

        for (int i = 0; i < pieceOnBoard.length; i++) {
            System.out.print(DIGIT.charAt(i));
            drawFigure(pieceOnBoard, i);
            System.out.println(DIGIT.charAt(i));
        }

        System.out.println(BOTTOM_LETTERS_WITH_BORDER);
    }

    private void drawFigure(Piece[][] pieces, int rowIndex) {
        System.out.print(BORDER_VERTICAL);
        System.out.print(SPACE);
        for (Piece[] pieceObject : pieces) {
            Piece piece = pieceObject[rowIndex];
            if (piece != null) {
                System.out.print(piece.draw());
            } else {
                System.out.print(CELL);
            }
            System.out.print(SPACE);
        }
        System.out.print(BORDER_VERTICAL);
    }

    public void addPiece(Piece piece, String coordinate) {
        final String upperCoordinate = coordinate.toUpperCase();
        final int letterIndex = LETTER.indexOf(upperCoordinate.charAt(0));
        final int digitIndex = DIGIT.indexOf(upperCoordinate.charAt(1));
        piece.setCoordinate(new Coordinate(letterIndex, digitIndex));

        pieceOnBoard[letterIndex][digitIndex] = piece;
    }

    public void addPieceWithMoves(Piece piece, String coordinate) {
        this.addPiece(piece, coordinate);
        int xCordIndex;
        int yCordIndex;

        for (int i = 0; i < piece.getMoveMap().length; i++) {
            xCordIndex = piece.getCoordinate().getX() + piece.getMoveMap()[i][0];
            yCordIndex = piece.getCoordinate().getY() + piece.getMoveMap()[i][1];

            // border check
            if (xCordIndex >= 0 && xCordIndex < LETTER.length()
                    && yCordIndex >= 0 && yCordIndex < DIGIT.length()) {
                pieceOnBoard[xCordIndex][yCordIndex] = new Knight(PieceColorType.WHITE);
            }
        }
    }
}
