package week9;

public class RemoteControl {

    Command[]  onCommands;
    Command[]  offCommands;

    Command undoCommand;

    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];
    }

    public void setCommand (int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }


    public void buttonClicked(int slot, boolean on){
        if (on){
            if (onCommands[slot] != null) {
                onCommands[slot].execute();
                undoCommand = onCommands[slot];
            }
        }else{
            if (offCommands[slot] != null) {
                offCommands[slot].execute();
                undoCommand = offCommands[slot];
            }
        }
    }

    public void undoButtonClicked(){
        if (undoCommand !=null){
            undoCommand.undo();
        }
    }
}
