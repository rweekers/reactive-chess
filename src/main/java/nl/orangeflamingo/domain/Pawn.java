package nl.orangeflamingo.domain;

/**
 * Represents a pawn in chess
 */
public class Pawn extends Piece {

    public Pawn(Position position, Color color) {
        setPosition(position);
        setColor(color);
    }
}
