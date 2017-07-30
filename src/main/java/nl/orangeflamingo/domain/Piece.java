package nl.orangeflamingo.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a chess piece. Although a pawn technically is not a piece it is modeled as one in this application
 */
public abstract class Piece {

    private Position position;
    private Color color;

    private List<Position> possibleMoves = new ArrayList();

    protected Color getColor() {
        return this.color;
    }

    protected void setColor(Color color) {
        this.color = color;
    }

    protected Position getPosition() {
        return this.position;
    }

    protected void setPosition(Position position) {
        this.position = position;
    }

    public void setPossibleMoves(List<Position> possibleMoves) {
        this.possibleMoves = possibleMoves;
    }

    public abstract String print();

}
