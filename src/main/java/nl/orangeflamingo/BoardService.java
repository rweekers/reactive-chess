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
        return printBoard();
    }

    private String printBoard() {
        Color c = Color.WHITE;
        int rowNumber = 7;
        StringBuilder board = new StringBuilder();
        while(rowNumber >= 0) {
            int columnNumber = 0;
            while(columnNumber <= 8) {
                board.append(createEmptyBlock(c));
                c = Color.reverse(c);
                columnNumber++;
            }
            c = Color.reverse(c);
            board.append("\n");
            rowNumber--;
        }
        return board.toString();
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
