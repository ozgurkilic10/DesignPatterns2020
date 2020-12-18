package week9;

public class ArmSecurityCommand implements Command{

    SecurityControl securityControl;

    public ArmSecurityCommand(SecurityControl securityControl) {
        this.securityControl = securityControl;
    }

    @Override
    public void execute() {
        securityControl.arm();
    }

    @Override
    public void undo() {
        securityControl.disarm();
    }
}
