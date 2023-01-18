package lt.codeacademy.week3.chess.complete.piece;

import lt.codeacademy.week3.chess.complete.Coordinate;

public interface Piece {

    /**
     * Map of possible moves. Every piece should implement this method as every piece has different move logic
     * @return possible moves in array of arrays
     */
    int[][] getMoveMap();

    /**
     * Draw peace in the board
     * @return Unicode piece character
     */
    char draw();

    /**
     * @return current piece coordinate in the board
     */
    Coordinate getCoordinate();

    /**
     * Moved/Added piece in the board should pass coordinate.
     * @param coordinate
     */
    void setCoordinate(Coordinate coordinate);
}
