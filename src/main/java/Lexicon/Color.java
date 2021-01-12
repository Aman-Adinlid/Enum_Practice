package Lexicon;

public enum Color {

    BLUE("12"),BLACK("13"),BROWN("14");

    private String ColorNumber;

    Color(String colorNumber) {
        ColorNumber = colorNumber;
    }

    public String getColorNumber() {
        return ColorNumber;
    }

    public void setColorNumber(String colorNumber) {
        ColorNumber = colorNumber;
    }
}
