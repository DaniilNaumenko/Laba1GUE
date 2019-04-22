import java.awt.*;
import javax.swing.*;
import java.util.concurrent.ThreadLocalRandom;

public class Interface extends JFrame {
    int myEnter;
    private JButton generateMore = new JButton("Генерировать больше");
    private JButton generateLess = new JButton("Генерировать меньше");

    private JTextField inputText = new JTextField("", 5);
    private JLabel showIcon1 = new JLabel("254");
    private JLabel showIcon2 = new JLabel("125");
    private JLabel showIcon0 = new JLabel("");

    public Interface() {

        super("Lab1_GUI");
        this.setBounds(100, 100, 400, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 10, 10, 10));

        container.add(inputText);
        container.add(showIcon0);

        generateMore.addActionListener(event -> {
            myEnter = Integer.parseInt(inputText.getText());
            showIcon1.setText(String.valueOf(ThreadLocalRandom.current().nextInt(myEnter, 1000)));
        });

        container.add(generateMore);
        container.add(showIcon1);

        generateLess.addActionListener(event -> {
            myEnter = Integer.parseInt(inputText.getText());
            showIcon2.setText(String.valueOf(ThreadLocalRandom.current().nextInt(myEnter)));
        });
        container.add(generateLess);
        container.add(showIcon2);
    }
}