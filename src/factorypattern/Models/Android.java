package factorypattern.Models;

import factorypattern.Interfaces.Os;

public class Android implements Os {

    @Override
    public void declare() {
        System.out.println("Android os loaded");
    }

}
