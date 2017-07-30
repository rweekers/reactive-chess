package nl.orangeflamingo.domain;

import static nl.orangeflamingo.BoardService.ANSI_RESET;

public class Bishop extends Piece {

    public Bishop(Position position, Color color) {
        super(position, color);
    }

    public String print() {
        return getColor().getColorString() + "B" + ANSI_RESET;
    }
}
