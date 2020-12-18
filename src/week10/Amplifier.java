package week10;

public class Amplifier {

    int vol;
    public void on(){
        System.out.println("Turning on Amplifier");
    }

    public void setVolume(int vol){
        this.vol = vol;
        System.out.println("Volume is " + vol);
    }
}
