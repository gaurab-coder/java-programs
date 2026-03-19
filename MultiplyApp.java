import javax.swing.*;
import java.awt.event.*;

public class MultiplyApp extends JFrame implements ActionListener
{
    JTextField t1, t2, result;
    JButton ok, exit;
    JLabel label1, label2;  // Added JLabels

    MultiplyApp()
    {
        setLayout(null);

        t1 = new JTextField();
        t2 = new JTextField();
        result = new JTextField();

        ok = new JButton("OK");
        exit = new JButton("Exit");

        // Initialize JLabels
        label1 = new JLabel("First No:");
        label2 = new JLabel("Second No:");

        // Set bounds for labels
        label1.setBounds(50, 20, 100, 30);
        label2.setBounds(200, 20, 100, 30);

        t1.setBounds(50, 50, 100, 30);
        t2.setBounds(200, 50, 100, 30);
        result.setBounds(120, 100, 100, 30);

        ok.setBounds(50, 150, 80, 30);
        exit.setBounds(200, 150, 80, 30);

        // Add labels to frame
        add(label1); add(label2);

        add(t1); add(t2); add(result);
        add(ok); add(exit);

        ok.addActionListener(this);
        exit.addActionListener(this);

        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == ok)
        {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            result.setText(String.valueOf(a * b));
        }
        if (e.getSource() == exit)
        {
            System.exit(0);
        }
    }

    public static void main(String[] args)
    {
        new MultiplyApp();
    }
}