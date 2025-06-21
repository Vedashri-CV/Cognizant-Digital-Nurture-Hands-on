package Week1.Design_Principles_and_Patterns.Singleton_Pattern;

public class LoggerTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        System.out.println("Does both loggers reference to the same object? " + (logger1==logger2));
        logger1.log("First logger logged in");
        logger2.log("Second logger logged in");
    }
}