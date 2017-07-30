package nl.orangeflamingo.domain;

import static nl.orangeflamingo.BoardService.ANSI_RESET;

/**
 * Represents a pawn in chess
 */
public class Pawn extends Piece {

    public Pawn(Position position, Color color) {
        setPosition(position);
        setColor(color);
    }

    public String print() {
        return getColor().getColorString() + "P" + ANSI_RESET;
    }
}
