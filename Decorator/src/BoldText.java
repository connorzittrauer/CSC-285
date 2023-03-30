/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: TextDecorator
 *  File Name: BoldText.java
 */

// This class provides a concrete implementation of BoldText for the decorator pattern.
public class BoldText extends TextDecorator {
    final String ANSI_BOLD = "\u001B[1m";
    final String ANSI_RESET = "\u001B[0m";

    public BoldText(IText text) {
        super(text);

    }

    @Override
    public String getText() {
        return ANSI_BOLD + text.getText() + ANSI_RESET;
    }
}
