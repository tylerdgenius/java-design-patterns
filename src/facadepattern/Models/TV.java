package facadepattern.Models;

import facadepattern.Interfaces.TvInterface;

public class TV implements TvInterface {

    @Override
    public void turnOn() {
        System.out.println("TV turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("TV turned off");
    }

    @Override
    public void increaseVolume() {
        System.out.println("Increasing tv volume");
    }

    @Override
    public void showDisplay() {
        System.out.println("I am showing the tv");
    }

}
