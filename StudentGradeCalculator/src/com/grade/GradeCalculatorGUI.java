import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;



public class GradeCalculatorGUI extends JFrame implements ActionListener {

    JTextField marks1, marks2, marks3;
    JLabel resultLabel;
    JButton calculateBtn;

    public GradeCalculatorGUI() {
        // Setup the window
        setTitle("Student Grade Calculator");
        setSize(350, 320);
        setLayout(null);
        setLocationRelativeTo(null); // Centers window on screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Subject 1
        JLabel l1 = new JLabel("Subject 1 Marks:");
        l1.setBounds(30, 30, 120, 25);
        add(l1);
        marks1 = new JTextField();
        marks1.setBounds(160, 30, 120, 25);
        add(marks1);

        // Subject 2
        JLabel l2 = new JLabel("Subject 2 Marks:");
        l2.setBounds(30, 70, 120, 25);
        add(l2);
        marks2 = new JTextField();
        marks2.setBounds(160, 70, 120, 25);
        add(marks2);

        // Subject 3
        JLabel l3 = new JLabel("Subject 3 Marks:");
        l3.setBounds(30, 110, 120, 25);
        add(l3);
        marks3 = new JTextField();
        marks3.setBounds(160, 110, 120, 25);
        add(marks3);

        // Button
        calculateBtn = new JButton("Calculate Grade");
        calculateBtn.setBounds(90, 160, 150, 30);
        add(calculateBtn);

        // Result Display
        resultLabel = new JLabel("Grade: ", SwingConstants.CENTER);
        resultLabel.setBounds(30, 210, 280, 25);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 13));
        add(resultLabel);

        calculateBtn.addActionListener(this);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            // Convert text to numbers
            int m1 = Integer.parseInt(marks1.getText());
            int m2 = Integer.parseInt(marks2.getText());
            int m3 = Integer.parseInt(marks3.getText());

            // Validate Range
            if(m1 > 100 || m2 > 100 || m3 > 100 || m1 < 0 || m2 < 0 || m3 < 0) {
                JOptionPane.showMessageDialog(this, "Marks should be between 0 and 100");
                return;
            }

            int avg = (m1 + m2 + m3) / 3;
            String grade;

            if (avg >= 80) grade = "A (Excellent)";
            else if (avg >= 60) grade = "B (Good)";
            else if (avg >= 40) grade = "C (Pass)";
            else grade = "Fail";

            resultLabel.setText("Average: " + avg + "% | Grade: " + grade);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error: Please enter numbers only.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        // Run GUI on the proper thread
        SwingUtilities.invokeLater(() -> new GradeCalculatorGUI());
    }
}