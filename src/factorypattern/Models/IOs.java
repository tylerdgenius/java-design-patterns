package factorypattern.Models;

import factorypattern.Interfaces.Os;

public class IOs implements Os {

    @Override
    public void declare() {
        System.out.println("IOs loaded");
    }
}
