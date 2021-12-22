package project1;

import bag.Bag;
import bag.BagInterface;
import java.util.Random;

/**
 * Creates a Collection of four Strings and adds them to a bag
 * 
 * @author Fiifi Sackey
 * 
 * @version 9/11/2021
 *
 */
public class DisplayCollection {

    /**
     * creates array of the four strings that will be placed into the bags and
     * cannot be changed and can be accessed by other classes
     */
    public static final String[] STRINGS = { "red circle", "blue circle",
        "red square", "blue square" };
    private BagInterface<String> itemBag;

    /**
     * Creates new instance of DisplayWindow class
     */
    public DisplayCollection() {
        this.itemBag = new Bag<>();
        Random random = new Random();
        int count = random.nextInt(11) + 5;
        for (int i = 0; i < count; i++) {
            switch (random.nextInt(4)) {
                case 0:
                    itemBag.add(STRINGS[0]);
                    continue;
                case 1:
                    itemBag.add(STRINGS[1]);
                    continue;
                case 2:
                    itemBag.add(STRINGS[2]);
                    continue;
                case 3:
                    itemBag.add(STRINGS[3]);
                    continue;
                default:
                    // default constructor will never be reached
            }
        }
    }


    /**
     * Bag which contains items
     * 
     * @return Bag of items
     */
    public BagInterface<String> getItemBag() {
        return itemBag;
    }

}
