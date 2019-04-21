import java.awt.*;
import javax.swing.*;
import java.util.concurrent.ThreadLocalRandom;

public class GraphicalUserInterface extends JFrame {
    int Enter;
    private JButton buttonMore = new JButton("Генерировать больше");
    private JButton buttonLess = new JButton("Генерировать меньше");

    private JTextField textField = new JTextField("", 5);
    private JLabel labelOne = new JLabel("254");
    private JLabel labelTwo = new JLabel("125");
    private JLabel labelZero = new JLabel("");

    public GraphicalUserInterface() {

        super("Lab1_GUI");
        this.setBounds(100, 100, 400, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 10, 10, 10));

        container.add(textField);
        container.add(labelZero);

        buttonMore.addActionListener(event -> {
            Enter = Integer.parseInt(textField.getText());
            labelOne.setText(String.valueOf(ThreadLocalRandom.current().nextInt(Enter, 1000)));
        });

        container.add(buttonMore);
        container.add(labelOne);

        buttonLess.addActionListener(event -> {
            Enter = Integer.parseInt(textField.getText());
            labelTwo.setText(String.valueOf(ThreadLocalRandom.current().nextInt(Enter)));
        });
        container.add(buttonLess);
        container.add(labelTwo);
    }
}