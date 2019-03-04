import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.concurrent.ThreadLocalRandom;

public class SimpleGUI extends JFrame {
    int Enter;
    private JButton buttonMore = new JButton("Генерировать больше");
    private JButton buttonLess = new JButton("Генерировать меньше");

    private JTextField input = new JTextField("", 5);
    private JLabel label254 = new JLabel("254");
    private JLabel label125 = new JLabel("125");
    private JLabel label = new JLabel("");

    public SimpleGUI() {

        super("Lab1_GUI");
        this.setBounds(100, 100, 400, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 10, 10, 10));

        container.add(input);
        container.add(label);

        buttonMore.addActionListener(event -> {
            Enter = Integer.parseInt(input.getText());
            label254.setText(String.valueOf(ThreadLocalRandom.current().nextInt(Enter, 1000)));
        });

        container.add(buttonMore);
        container.add(label254);

        buttonLess.addActionListener(event -> {
            Enter = Integer.parseInt(input.getText());
            label125.setText(String.valueOf(ThreadLocalRandom.current().nextInt(Enter)));
        });
        container.add(buttonLess);
        container.add(label125);
    }
}