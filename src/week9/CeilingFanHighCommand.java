package week9;

public class CeilingFanHighCommand implements Command{

    CeilingFan fan;
    int previousSpeed;

    public CeilingFanHighCommand(CeilingFan fan) {

        this.fan = fan;
    }

    @Override
    public  void execute() {
        previousSpeed = fan.getSpeed();
        fan.high();
    }

    @Override
    public void undo() {
        if (previousSpeed == CeilingFan.HIGH){
            fan.high();
        }else if (previousSpeed == CeilingFan.MEDIUM) {
            fan.medium();
        }else if (previousSpeed == CeilingFan.LOW){
                fan.low();
        }else if (previousSpeed == CeilingFan.OFF){
            fan.off();
        }

    }
}
