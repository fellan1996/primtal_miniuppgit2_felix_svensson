package view;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class GUI {
    private final JTextArea textArea;

    public GUI() {
        JFrame frame = new JFrame("Prime Numbers up to 1000");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());

        textArea = new JTextArea();
        textArea.setEditable(false);
        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);

        frame.setVisible(true);
    }

    public void updateTextArea(List<Integer> primeNumbers) {
        textArea.append("Sum of all primes: " + primeNumbers.remove(primeNumbers.size()-1));
        textArea.append("\n Amount of Primes: " + primeNumbers.remove(primeNumbers.size()-1) + "\n\n");

        int lineBreakCount = 0;
        for (Integer prime : primeNumbers) {
            if (lineBreakCount > 9) {
                textArea.append("\n" + prime + "  ");
                lineBreakCount = 1;
            } else {
                textArea.append(prime + "  ");
                ++lineBreakCount;
            }
        }
    }
}