import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;
import java.awt.event.ActionListener;

public class UserInterface implements Runnable {
    private JFrame frame;

    public UserInterface(){

    }
    @Override
    public void run() {
        frame = new JFrame("Title");
        frame.setPreferredSize(new Dimension(400, 400));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));

        addtext("ddd ",container);
        addAButton("Button 1", container);

        addtext("a ",container);
        addAButton("Button 2", container);

        addtext(" ",container);
        addAButton("Button 3", container);

        addtext(" ",container);
        addAButton("Long-Named Button 4", container);

        addAButton("SUBMIT", container);
    }
    private static void addAButton(String text, Container container) {
        JButton button = new JButton(text);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(button);
    }
    private static void addtext(String text, Container container){
        JTextField textArea = new JTextField("INPUT");
        
        textArea.setSize(10,10);
        //textArea.setPreferredSize(new Dimension(1,1));
        container.add(textArea);
    }

    public JFrame getjFrame(){

        return frame;
    }
}
