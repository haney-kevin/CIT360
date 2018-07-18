import java.util.HashMap;

public class OtherHandler implements Handler {
    // ATTRIBUTES

    // DEFAULT CONSTRUCTOR
    public OtherHandler() {

    }

    // CUSTOM CONSTRUCTOR

    // GETTERS

    // SETTERS

    // METHODS
    @Override
    public void handle(HashMap<String,Object> data) {
        try {
            System.out.println("\nControl passed to OtherHandler");
            System.out.println("Advanced programming to follow:");
            Thread.sleep(3000);
            System.out.println("Hello world!");
        }
        catch (InterruptedException e) {
            System.out.println("InterruptedException thrown from OtherHandler handle method");
        }
        /*catch (IllegalMonitorStateException e) {
            System.out.println("IllegalMonitorStateException thrown from OtherHandler handle method");
        }*/
    }
}