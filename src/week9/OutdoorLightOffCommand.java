package week9;

public class OutdoorLightOffCommand implements Command{

    OutdoorLight light;

    public OutdoorLightOffCommand(OutdoorLight light) {

        this.light = light;
    }

    @Override
    public  void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
