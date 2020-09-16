import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MessageListner implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Message Recieved");
    }
}
