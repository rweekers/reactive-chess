package nl.orangeflamingo.domain;

import static nl.orangeflamingo.BoardService.ANSI_RESET;

public class King extends Piece {

    public King(Position position, Color color) {
        super(position, color);
    }

    public String print() {
        return getColor().getColorString() + "K" + ANSI_RESET;
    }
}
