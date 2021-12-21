package SingletonDesignPattern.LazySingleton.WithIH;

/*Lazy singleton with initialisation holder*/
public class LazySingleton {
    /*private constructor to prevent instantiation outside of this class
     * This also prevents inheritance*/
    private LazySingleton() {
    }

    /*this class provides with the initialisation on demand holder pattern*/
    private class LazySingletonWithIH {
        static final LazySingleton INSTANCE = new LazySingleton() {
            private String desc = "Singleton pattern imp. using 'LAZY SINGLETON WITH INITIALISATION HOLDER'";

            @Override
            public String toString() {
                return "$classname{" +
                        "desc='" + desc + '\'' +
                        '}';
            }
        };
    }

    /*this method provides the singleton instance*/
    public static LazySingleton getLazySingletonInstance() {
        return LazySingletonWithIH.INSTANCE;
    }
}
