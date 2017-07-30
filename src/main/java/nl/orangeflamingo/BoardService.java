package nl.orangeflamingo;

import nl.orangeflamingo.domain.*;
import org.springframework.stereotype.Service;

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

    private Piece[][] board = new Piece[8][8];

    public String getBoard() {
        return printBoard();
    }

    private String printBoard() {
        Color c = Color.WHITE;
        int rowNumber = 7;
        StringBuilder printBoard = new StringBuilder();
        while (rowNumber >= 0) {
            int columnNumber = 0;
            while (columnNumber < 8) {
                if (board[rowNumber][columnNumber] == null) {
                    printBoard.append(createEmptyBlock(c));
                } else {
                    printBoard.append(createPieceBlock(c, board[rowNumber][columnNumber]));
                }
                c = Color.reverse(c);
                columnNumber++;
            }
            c = Color.reverse(c);
            printBoard.append("\n");
            rowNumber--;
        }
        return printBoard.toString();
    }

    public void initBoard() {
        for (int i = 0; i < 8; i++) {
            Pawn whitePawn = new Pawn(new Position(i, 1), Color.WHITE);
            Pawn blackPawn = new Pawn(new Position(i, 6), Color.BLACK);
            board[1][i] = whitePawn;
            board[6][i] = blackPawn;
        }
        King whiteKing = new King(new Position(0, 4), Color.WHITE);
        board[0][4] = whiteKing;
        King blackKing = new King(new Position(7, 4), Color.BLACK);
        board[7][4] = blackKing;

        Queen whiteQueen = new Queen(new Position(0, 3), Color.WHITE);
        board[0][3] = whiteQueen;
        Queen blackQueen = new Queen(new Position(7, 3), Color.BLACK);
        board[7][3] = blackQueen;
        createAndAddRooks();
        createAndAddKnights();
        createAndAddBishops();
    }

    private void createAndAddRooks() {
        Rook whiteLeft = new Rook(new Position(0,0), Color.WHITE);
        board[0][0] = whiteLeft;
        Rook whiteRight = new Rook(new Position(0,7), Color.WHITE);
        board[0][7] = whiteRight;
        Rook blackLeft = new Rook(new Position(7,0), Color.BLACK);
        board[7][0] = blackLeft;
        Rook blackRight = new Rook(new Position(7,7), Color.BLACK);
        board[7][7] = blackRight;
    }

    private void createAndAddBishops() {
        Bishop whiteLeft = new Bishop(new Position(0,2), Color.WHITE);
        board[0][2] = whiteLeft;
        Bishop whiteRight = new Bishop(new Position(0,5), Color.WHITE);
        board[0][5] = whiteRight;
        Bishop blackLeft = new Bishop(new Position(7,2), Color.BLACK);
        board[7][2] = blackLeft;
        Bishop blackRight = new Bishop(new Position(7,5), Color.BLACK);
        board[7][5] = blackRight;
    }

    private void createAndAddKnights() {
        Knight whiteLeft = new Knight(new Position(0,1), Color.WHITE);
        board[0][1] = whiteLeft;
        Knight whiteRight = new Knight(new Position(0,6), Color.WHITE);
        board[0][6] = whiteRight;
        Knight blackLeft = new Knight(new Position(7,1), Color.BLACK);
        board[7][1] = blackLeft;
        Knight blackRight = new Knight(new Position(7,6), Color.BLACK);
        board[7][6] = blackRight;
    }

    private String createEmptyBlock(Color color) {
        return color.getColorString() + "|-|" + ANSI_RESET;
    }

    private String createPieceBlock(Color color, Piece piece) {
        return color.getColorString() + "|" + ANSI_RESET + piece.print() + color.getColorString() + "|" + ANSI_RESET;
    }
}
