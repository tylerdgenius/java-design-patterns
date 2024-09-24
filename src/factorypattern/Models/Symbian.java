package factorypattern.Models;

import factorypattern.Interfaces.Os;

public class Symbian implements Os {
    @Override
    public void declare() {
        System.out.println("Symbian OS Loaded");
    }
}
