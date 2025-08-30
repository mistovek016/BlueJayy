import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class helloWorld {
    private int count = 0;

    public helloWorld() {
        // Create a new frame
        JFrame frame = new JFrame("Counter App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());

        // Create components
        JLabel label = new JLabel("Count: 0");
        JButton button = new JButton("Click Me!");

        // Add button action
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                label.setText("Count: " + count);
            }
        });

        // Add components to frame
        frame.add(label);
        frame.add(button);

        // Show the frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Run GUI on Event Dispatch Thread
        for (int i = 0; i < 10; i++) System.out.print(i);
        SwingUtilities.invokeLater(() -> new helloWorld());
    }
}
