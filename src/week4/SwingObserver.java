package week4;

import javax.swing.*;

public class SwingObserver {

    public static void main(String... args){
        JFrame frame = new JFrame("Hello");
        frame.setSize(200,200);
        frame.setVisible(true);

        JButton button = new JButton("Click Me");
        frame.getContentPane().add(button);

        button.addActionListener(new ButtonObserver());

    }
}
