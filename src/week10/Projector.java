package week10;

public class Projector {

    Object input;

    public void on(){
        System.out.println("Turning on Projector");
    }

    public void setInput(Object input) {
        this.input = input;
        System.out.println("Input is : " + input);
    }

    public void wideScreen(){
        System.out.println("Mode is WideScreen");
    }
}
