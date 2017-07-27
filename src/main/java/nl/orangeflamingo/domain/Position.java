package nl.orangeflamingo.domain;

/**
 * Represents the location of a chess piece on a 8x8 board.
 */
public class Position {

    // represents columns from A to H, starts with 0
    private int x;

    // represents rows from 1 to 8, starts with 0
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
