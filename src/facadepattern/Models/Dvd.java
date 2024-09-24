package facadepattern.Models;

import facadepattern.Interfaces.DvdInterface;

public class Dvd implements DvdInterface {

    @Override
    public void turnOn() {
        System.out.println("Turned on dvd");
    }

    @Override
    public void turnOff() {
        System.out.println("Turned off dvd");
    }

    @Override
    public void increaseVolume() {
        System.out.println("Increasing dvd volume");
    }

    @Override
    public void play() {
        System.out.println("Playing dvd now");
    }
}
