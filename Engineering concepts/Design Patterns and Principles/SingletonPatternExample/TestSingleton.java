package SingletonPatternExample;

public class TestSingleton {
    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Application created..");
        logger2.log("database connected...");

        if(logger1 == logger2){
            System.out.println("Only one logger instance exist");
        }else{
            System.out.println("Multiple instance of Logger exist..");
        }

        System.out.println("Hashcode of Logger1 " + logger1.hashCode());
        System.out.println("Hashcode of Logger2 " + logger2.hashCode());
    }
}
