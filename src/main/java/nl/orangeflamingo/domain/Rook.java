package nl.orangeflamingo.domain;

import static nl.orangeflamingo.BoardService.ANSI_RESET;

public class Rook extends Piece {

    public Rook(Position position, Color color) {
        super(position, color);
    }

    public String print() {
        return getColor().getColorString() + "R" + ANSI_RESET;
    }
}
