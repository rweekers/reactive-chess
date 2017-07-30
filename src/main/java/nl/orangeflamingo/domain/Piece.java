package nl.orangeflamingo.domain;

/**
 * Represents a chess piece. Although a pawn technically is not a piece it is modeled as one in this application
 */
public abstract class Piece {

    private Position position;
    private Color color;

    protected Piece(Position position, Color color) {
        this.position = position;
        this.color = color;
    }

    protected Color getColor() {
        return this.color;
    }

    protected Position getPosition() {
        return this.position;
    }

    public abstract String print();

}
