import factorypattern.OsInitiate;

public class App {
    public static void main(String[] args) {

        OsInitiate osInterface = new OsInitiate("SYMBIAN");

        osInterface.load();

    }
}
