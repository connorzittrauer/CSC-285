/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: TextDecorator
 *  File Name: ItalicText.java
 */

// This class provides a concrete implementation of ItalicText for the decorator pattern.
public class ItalicText extends TextDecorator {
    final String ANSI_ITALIC = "\u001B[3m";
    final String ANSI_RESET = "\u001B[0m";

    public ItalicText(IText text) {
        super(text);

    }

    @Override
    public String getText() {
        return ANSI_ITALIC + text.getText() + ANSI_RESET;
    }
}
