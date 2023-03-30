/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: TextDecorator
 *  File Name: BoldItalicStrikethroughText.java
 */

// This class provides a concrete implementation of BoldItalicStrikethroughText for the decorator pattern.
public class BoldItalicStrikethroughText extends TextDecorator {
    final String ANSI_BOLD_ITALIC_STRIKETHROUGH = "\u001B[1m\u001B[3m\u001B[9m";
    final String ANSI_RESET = "\u001B[0m";

    public BoldItalicStrikethroughText(IText text) {
        super(text);

    }

    @Override
    public String getText() {
        return ANSI_BOLD_ITALIC_STRIKETHROUGH + text.getText() + ANSI_RESET;
    }
}
