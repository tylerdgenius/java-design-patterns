package facadepattern;

import facadepattern.Interfaces.DvdInterface;
import facadepattern.Interfaces.IMovie;
import facadepattern.Interfaces.TvInterface;
import facadepattern.Models.Dvd;
import facadepattern.Models.TV;

public class Movie implements IMovie {

    private final TvInterface tvInterface;
    private final DvdInterface dvdInterface;

    public Movie() {
        this.tvInterface = new TV();
        this.dvdInterface = new Dvd();
    }

    @Override
    public void watchMovie() {
        this.tvInterface.turnOn();
        this.dvdInterface.turnOn();
        this.tvInterface.increaseVolume();
        this.dvdInterface.increaseVolume();
        this.tvInterface.showDisplay();
        this.dvdInterface.play();
        this.tvInterface.turnOff();
        this.dvdInterface.turnOff();
    }
}
