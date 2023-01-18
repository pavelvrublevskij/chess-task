package lt.codeacademy.week3.chess.complete.piece.knight;

import lt.codeacademy.week3.chess.complete.piece.PieceColorType;
import lt.codeacademy.week3.chess.complete.piece.PieceCommon;

public class Knight extends PieceCommon {

    private static final char SYMBOL_BLACK = '♞';
    private static final char SYMBOL_WHITE = '♘';

    private final int[][] moves = {
            {-2, -1}, {-2, +1}, // up
            {-1, +2}, {+1, +2}, // right
            {+2, +1}, {+2, -1}, // down
            {+1, -2}, {-1, -2}  // left
    };

    public Knight(PieceColorType colorType){
        super(colorType);
        super.whiteSymbol = SYMBOL_WHITE;
        super.blackSymbol = SYMBOL_BLACK;
    }

    @Override
    public int[][] getMoveMap() {
        return moves;
    }

}
