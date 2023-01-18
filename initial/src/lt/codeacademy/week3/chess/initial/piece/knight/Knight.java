package lt.codeacademy.week3.chess.initial.piece.knight;

import lt.codeacademy.week3.chess.initial.piece.PieceColorType;
import lt.codeacademy.week3.chess.initial.piece.PieceCommon;

//TODO: fix and complete this class
public class Knight extends PieceCommon {

    private static final char SYMBOL_BLACK = '♞';
    private static final char SYMBOL_WHITE = '♘';

    public Knight(PieceColorType colorType) {
        super(colorType);
    }

    @Override
    public int[][] getMoveMap() {
        return new int[0][];
    }
}
