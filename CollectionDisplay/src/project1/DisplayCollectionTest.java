package project1;

import student.TestCase;
import bag.BagInterface;

/**
 * Tests the methods of the displayCollection class
 * 
 * @author Fiifi Sackey
 * 
 * @version 9/13/21
 */
public class DisplayCollectionTest extends TestCase {

    /**
     * Left empty because DisplayCollectionTest does not contain any fields
     */
    public void setUp() {
        //Left empty because DisplayCollectionTest
        //does not contain any fields to be instantiated
    }


    /**
     * Tests if bag size is between 5 and 15
     */
    public void testBagSize() {
        for (int i = 0; i < 20; i++) {
            DisplayCollection collection = new DisplayCollection();
            BagInterface<String> bag = collection.getItemBag();
            int size = bag.getCurrentSize();
            assertTrue(size >= 5 && size <= 15);
            assertFalse(size < 5 || size > 15);
        }

    }


    /**
     * Tests if strings are one of the four legal strings
     */
    public void testBagContents() {
        DisplayCollection collection = new DisplayCollection();
        BagInterface<String> bag = collection.getItemBag();
        int size = bag.getCurrentSize();
        for (int i = 0; i < size; i++) {
            String temp = bag.remove();
            assertTrue(temp.equals(DisplayCollection.STRINGS[0]) || temp.equals(
                DisplayCollection.STRINGS[1]) || temp.equals(
                    DisplayCollection.STRINGS[2]) || temp.equals(
                        DisplayCollection.STRINGS[3]));
            assertFalse(temp.equals("Butt"));
        }
    }

}
