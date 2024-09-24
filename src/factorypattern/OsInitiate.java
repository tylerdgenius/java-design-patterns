package factorypattern;

import factorypattern.Interfaces.*;
import factorypattern.Models.*;

public class OsInitiate implements LoadOsInterface {
    private String loadedOS;

    private Os osInstance;

    public OsInitiate(String loadedOS) {
        this.loadedOS = loadedOS;
    }

    @Override
    public void load() throws UnsupportedOperationException {
        if (this.loadedOS.equalsIgnoreCase("ANDROID")) {
            this.osInstance = new Android();
            this.osInstance.declare();
            return;
        }

        if (this.loadedOS.equalsIgnoreCase("SYMBIAN")) {
            this.osInstance = new Symbian();
            this.osInstance.declare();
            return;
        }

        if (this.loadedOS.equalsIgnoreCase("IOS")) {
            this.osInstance = new IOs();
            this.osInstance.declare();
            return;
        }

        throw new UnsupportedOperationException("Unsupported type error");
    }
}
