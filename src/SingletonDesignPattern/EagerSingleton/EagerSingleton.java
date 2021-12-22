package SingletonDesignPattern.EagerSingleton;

/*This class uses eager initialisation of singleton instance*/
public class EagerSingleton {
    private String Desc = "EagerSingleton Object is Instantiated";
    private static final EagerSingletonMain INSTANCE = new EagerSingletonMain();

    public static EagerSingletonMain getInstance() {
        return INSTANCE;
    }

    /*prevents object instantiation outsidr of the class a
     * prevent inheritance*/
    private EagerSingleton() {
    }
}
