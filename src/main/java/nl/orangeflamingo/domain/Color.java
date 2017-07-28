package nl.orangeflamingo.domain;

/**
 * Represents the color of a chess piece
 */
public enum Color {

    WHITE("\u001B[33m"),
    BLACK("\u001B[31m");

    private final String colorString;

    Color(String colorString) {
        this.colorString = colorString;
    }

    public String getColorString() { return this.colorString; }

    public static Color reverse(Color color) {
        switch (color) {
            case WHITE: return BLACK;
            case BLACK: return WHITE;
        }
        return WHITE;
    }
}
