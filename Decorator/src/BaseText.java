/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: TextDecorator
 *  File Name: BaseText.java
 */

// This class provides a concrete implementation of the basetext.
public class BaseText implements IText {
    private final String text;

    public BaseText(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }
}
