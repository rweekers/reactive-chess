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

    private List<Piece> whitePieces;

    public String getBoard() {
        return "8|-|-|-|-|-|-|-|-|\n" +
                "7|-|-|-|-|-|-|-|-|\n" +
                "6|-|-|-|-|-|-|-|-|\n" +
                "5|-|-|-|-|-|-|-|-|\n" +
                "4|-|-|-|-|-|-|-|-|\n" +
                "3|-|-|-|-|-|-|-|-|\n" +
                "2|-|-|-|-|-|-|-|-|\n" +
                "1|-|-|-|-|-|-|-|-|\n" +
                " |A|B|C|D|E|F|G|H|";
    }

    public void initBoard() {
        whitePieces = new ArrayList<Piece>();
        for (int i = 0; i < 8; i++) {
            Pawn p = new Pawn(new Position(i, 1), Color.WHITE);
            whitePieces.add(p);
        }
    }
}
