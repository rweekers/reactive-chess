package nl.orangeflamingo;

import nl.orangeflamingo.domain.Color;
import nl.orangeflamingo.domain.Pawn;
import nl.orangeflamingo.domain.Piece;
import nl.orangeflamingo.domain.Position;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Service for printing the chess board
 */
@Service
public class BoardService {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    private List<Piece> whitePieces;

    public String getBoard() {
        return "8|-|-|-|-|-|-|-|-|\n" +
                "7|-|-|-|-|-|-|-|-|\n" +
                "6|-|-|-|-|-|-|-|-|\n" +
                "5|-|-|-|-|-|-|-|-|\n" +
                "4|-|-|-|-|-|-|-|-|\n" +
                "3|-|-|-|-|-|-|-|-|\n" +
                "2|-|-|-|-|-|-|-|-|\n" +
                "1" + createEmptyBlock(Color.BLACK) + createEmptyBlock(Color.WHITE) + "|-|-|-|-|-|-|-|\n" +
                " |A||B||C||D||E||F||G||H|";
    }

    public void initBoard() {
        whitePieces = new ArrayList<Piece>();
        for (int i = 0; i < 8; i++) {
            Pawn p = new Pawn(new Position(i, 1), Color.WHITE);
            whitePieces.add(p);
        }
    }

    private String createEmptyBlock(Color color) {
        return color.getColorString() + "|-|" + ANSI_RESET;
    }
}
