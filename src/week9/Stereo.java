package week9;

public class Stereo {

    int volume;

    public void on(){
        System.out.println("Turning on the stereo");
    }

    public void off(){
        System.out.println("Turning off the stereo");
    }

    public void setCD(){
        System.out.println("CD is set");
    }

    public void setDVD(){
        System.out.println("DVD is set");
    }

    public void setVolume(int volume) {
        System.out.println("Setting volume to " + volume);
        this.volume = volume;
    }
}
