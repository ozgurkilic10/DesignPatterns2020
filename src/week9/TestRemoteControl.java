package week9;

public class TestRemoteControl {

    public static void main(String... args){
        OutdoorLight outdoorLight = new OutdoorLight();
        Stereo stereo = new Stereo();
        CeilingFan fan = new CeilingFan();

        Command command1 =   new ArmSecurityCommand(new SecurityControl()); //new OutdoorLightOnCommand(outdoorLight);


        RemoteControl remoteControl = new RemoteControl();

        OutdoorLightOnCommand onCommand = new OutdoorLightOnCommand(outdoorLight);
        remoteControl.setCommand(0, onCommand,

                new OutdoorLightOffCommand(outdoorLight));

        StereoOnWithCDCommand onCommand1 = new StereoOnWithCDCommand(stereo);

        remoteControl.setCommand(1, onCommand1,
                new StereoOffCommand(stereo));
        remoteControl.setCommand(2,new CeilingFanHighCommand(fan),
                null);

        Command[] partyOn = new Command[2];
        partyOn[0] = onCommand;
        partyOn[1] = onCommand1;

        MacroCommand mCommand = new MacroCommand(partyOn);
        remoteControl.setCommand(3,mCommand,
                null);


        remoteControl.buttonClicked(3,true);
       /* remoteControl.buttonClicked(0, true);
        remoteControl.buttonClicked(1, true);
        remoteControl.buttonClicked(1, false);

        remoteControl.buttonClicked(2, true);
        remoteControl.undoButtonClicked();*/
    }
}
