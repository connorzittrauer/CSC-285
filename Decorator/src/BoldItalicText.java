/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: TextDecorator
 *  File Name: BoldItalicText.java
 */

// This class provides a concrete implementation of BoldItalicText for the decorator pattern.
public class BoldItalicText extends TextDecorator {
    final String ANSI_BOLD_ITALIC = "\u001B[1m\u001B[3m";
    final String ANSI_RESET = "\u001B[0m";

    public BoldItalicText(IText text) {
        super(text);

    }

    @Override
    public String getText() {
        return ANSI_BOLD_ITALIC + text.getText() + ANSI_RESET;
    }
}
