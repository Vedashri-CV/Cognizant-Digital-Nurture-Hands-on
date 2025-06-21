package Week1.Design_Principles_and_Patterns.Singleton_Pattern;

public class Logger {
    private static Logger instance;

    private Logger(){
        System.out.println("Private Logger instance created");
    }

    public static Logger getInstance() {
        if(instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}