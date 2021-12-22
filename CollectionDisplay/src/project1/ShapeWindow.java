 package project1;

import bag.Bag;
import bag.BagInterface;
import cs2.TextShape;
import java.util.Random;
import cs2.Window;
import cs2.Button;
import cs2.WindowSide;
import java.awt.Color;

/**
 * The ShapeWindow class provides a GUI application with two button, Quit and
 * Choose, where clicking Quit exits the application and clicking Choose selects
 * one of the four phrases
 * 
 * @author Fiifi Sackey
 * 
 * @version 9/11/2021
 *
 */
public class ShapeWindow {

    private Window window;
    private TextShape textShape;
    private Button quitButton;
    private Button chooseButton;
    private BagInterface<String> itemBag;

    /**
     * creates new instance of the ShapeWindow class
     * 
     * @param bag
     */
    public ShapeWindow(BagInterface<String> bag) {

        window = new Window();
        window.setTitle("Project 1");
        itemBag = bag;

        quitButton = new Button("Quit");
        quitButton.onClick(this, "clickedQuit");
        window.addButton(quitButton, WindowSide.NORTH);

        chooseButton = new Button("Choose");
        chooseButton.onClick(this, "clickedChoose");
        window.addButton(chooseButton, WindowSide.SOUTH);

        textShape = new TextShape(0, 0, "");
        window.addShape(textShape);
    }


    /**
     * Quits the GUI application
     * 
     * @param button
     */
    public void clickedQuit(Button button) {
        System.exit(0);
    }


    /**
     * Chooses the next item in the bag
     * 
     * @param button
     */
    public void clickedChoose(Button button) {
        if (itemBag.isEmpty()) {
            textShape.setText("No more items.");
            textShape.setForegroundColor(Color.black);
            throw new NullPointerException("Bag is Empty");
        }
        else {
            String coloredShape = itemBag.remove();
            textShape.setText(coloredShape);
            colorText(coloredShape);
        }
    }


    /**
     * Helper method which sets the color depending on if it says "red" or
     * "blue"
     * 
     * @param color
     */
    public void colorText(String color) {
        if (color.contains("red")) {
            textShape.setForegroundColor(Color.red);
            centerText();

        }
        else {
            textShape.setForegroundColor(Color.blue);
            centerText();
        }
    }


    /**
     * Helper method used to center the text
     */
    public void centerText() {
        textShape.setX(window.getGraphPanelWidth() / 2 - textShape.getWidth()
            / 2);
        textShape.setY(window.getGraphPanelHeight() / 2 - textShape.getHeight()
            / 2);
    }

}
