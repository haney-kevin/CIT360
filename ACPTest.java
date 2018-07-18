import java.util.HashMap;

public class AppControllerTesting {
    // ATTRIBUTES
    HashMap<String, Handler> handlerMap = new HashMap<>();

    // DEFAULT CONSTRUCTOR
    public AppControllerTesting() {
        TestHandler th = new TestHandler();
        mapCommand("test", th);

        OtherHandler oh = new OtherHandler();
        mapCommand("other", oh);
    }


    // GETTERS

    // SETTERS

    // METHODS
    public void handleRequest(String command, HashMap<String,Object> data){
        Handler aCommandHandler = handlerMap.get(command);
        if (aCommandHandler != null){
            aCommandHandler.handle(data);
        }
        else {
            System.out.println("Invalid command");
        }
    }

    public void mapCommand(String aCommand, Handler acHandler){
        handlerMap.put(aCommand,acHandler);
    }

    public static void runTests() {
        AppControllerTesting act = new AppControllerTesting();
        HashMap<String,Object> testMap = new HashMap<>();
        testMap.put("one", "Pop");
        testMap.put("two", "EDM");
        testMap.put("three", "Hip-hop");
        testMap.put("four", "Rock");
        act.handleRequest("test", testMap);

        act.handleRequest("other", testMap);
    }

    public static void main(String[] args) {
        runTests();
    }
}