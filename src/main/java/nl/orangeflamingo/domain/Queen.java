package nl.orangeflamingo.domain;

import static nl.orangeflamingo.BoardService.ANSI_RESET;

public class Queen extends Piece {

    public Queen(Position position, Color color) {
        super(position, color);
    }

    public String print() {
        return getColor().getColorString() + "Q" + ANSI_RESET;
    }
}
