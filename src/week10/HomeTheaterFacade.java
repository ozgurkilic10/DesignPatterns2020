package week10;

public class HomeTheaterFacade {

    private PopCornPopper popper = new PopCornPopper();
    private Lights lights = new Lights();
    private Screen screen = new Screen();
    private Projector projector = new Projector();
    private Amplifier amplifier = new Amplifier();
    private DvdPlayer dvdPlayer = new DvdPlayer();

    public void watchMovie(String movie){

        popper.on();
        lights.dim();
        screen.down();

        projector.on();
        projector.setInput("DVD");
        projector.wideScreen();

        amplifier.on();
        amplifier.setVolume(9);

        dvdPlayer.on();
        dvdPlayer.play("Black Swan");
    }

    public void endMovie(){

    }

    public void LoungeMusicMood(){

    }

    public PopCornPopper getPopper() {
        return popper;
    }

    public Lights getLights() {
        return lights;
    }

    public Screen getScreen() {
        return screen;
    }

    public Projector getProjector() {
        return projector;
    }

    public Amplifier getAmplifier() {
        return amplifier;
    }

    public DvdPlayer getDvdPlayer() {
        return dvdPlayer;
    }
}
