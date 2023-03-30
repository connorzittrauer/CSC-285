/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: TextDecorator
 *  File Name: TextDecorator.java
 */

/* This class provides a layer of abstraction for
 * the concrete markdown TextDecorator Implementations.
 */
public abstract class TextDecorator implements IText {
    protected IText text;

    public TextDecorator(IText text) {
        this.text = text;
    }

    // Provides the base return text that is modified in the concrete decorators.
    public String getText() {
        return text.getText();
    }
}

