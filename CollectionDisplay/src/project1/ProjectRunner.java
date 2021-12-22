/**
 * 
 */
package project1;

/**
 * Builds a collection and creates window for GUI application to be run
 * 
 * @author Fiifi Sackey
 * 
 * @version 9/11/21
 *
 */
public class ProjectRunner {

    
    
    /**
     * Constructor not needed
     */
    public ProjectRunner() {

    }


    /**
     * Creates new DisplayCollection object and ShapeWindow object and instantiates them
     * 
     * @param args 
     */
    public static void main(String[] args) {
        DisplayCollection collection = new DisplayCollection();
        ShapeWindow window = new ShapeWindow(collection.getItemBag());

    }

}
