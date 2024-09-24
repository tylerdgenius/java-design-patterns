package singletonpattern;

public class Base {
    private static Base baseInstance;

    private Base() {
    }

    public static Base getBaseInstance() {
        if (baseInstance == null) {
            baseInstance = new Base();
        }
        return baseInstance;
    }

}
