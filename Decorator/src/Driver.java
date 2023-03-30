/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: TextDecorator
 *  File Name: Driver.java
 */

/* This is the driver class that provides a demonstration
 * for the TextDecorator pattern.
 */

/**
 * @author lruesch
 */
public class Driver {

    public static void main(String[] args) {
        IText text = new BaseText("This is a sample text");
        System.out.println("Base text: " + text.getText());

        IText boldText = new BoldText(text);
        System.out.println("Bold text: " + boldText.getText());

        IText italicIText = new ItalicText(text);
        System.out.println("Italic text: " + italicIText.getText());

        IText boldItalicIText = new BoldItalicText(text);
        System.out.println("Bold italic text: " + boldItalicIText.getText());

        IText boldItalicStrikedThroughText = new BoldItalicStrikethroughText(text);
        System.out.println("Bold italic text that has a line through it: " + boldItalicStrikedThroughText.getText());
    }

}
