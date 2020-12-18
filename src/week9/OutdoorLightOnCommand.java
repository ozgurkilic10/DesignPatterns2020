package week9;

public class OutdoorLightOnCommand implements Command{

    OutdoorLight light;

    public OutdoorLightOnCommand(OutdoorLight light) {

        this.light = light;
    }

    @Override
    public  void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
