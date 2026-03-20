import javax.swing.*;
import java.awt.*;

public class LayoutExample 
{
    public static void main(String[] args) 
    {
        // ── 1. FlowLayout ──────────────────────────────────────
        JFrame flowFrame = new JFrame("FlowLayout Demo");
        flowFrame.setLayout(new FlowLayout());

        flowFrame.add(new JButton("Button 1"));
        flowFrame.add(new JButton("Button 2"));
        flowFrame.add(new JButton("Button 3"));

        flowFrame.setSize(300, 150);
        flowFrame.setLocation(0, 0);
        flowFrame.setVisible(true);
        flowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ── 2. BorderLayout ────────────────────────────────────
        JFrame borderFrame = new JFrame("BorderLayout Demo");
        borderFrame.setLayout(new BorderLayout());

        borderFrame.add(new JButton("NORTH"),  BorderLayout.NORTH);
        borderFrame.add(new JButton("SOUTH"),  BorderLayout.SOUTH);
        borderFrame.add(new JButton("EAST"),   BorderLayout.EAST);
        borderFrame.add(new JButton("WEST"),   BorderLayout.WEST);
        borderFrame.add(new JButton("CENTER"), BorderLayout.CENTER);

        borderFrame.setSize(300, 200);
        borderFrame.setLocation(320, 0);
        borderFrame.setVisible(true);
        borderFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ── 3. GridLayout ──────────────────────────────────────
        JFrame gridFrame = new JFrame("GridLayout Demo");
        gridFrame.setLayout(new GridLayout(2, 3)); // 2 rows, 3 cols

        gridFrame.add(new JButton("(1,1)"));
        gridFrame.add(new JButton("(1,2)"));
        gridFrame.add(new JButton("(1,3)"));
        gridFrame.add(new JButton("(2,1)"));
        gridFrame.add(new JButton("(2,2)"));
        gridFrame.add(new JButton("(2,3)"));

        gridFrame.setSize(300, 150);
        gridFrame.setLocation(0, 220);
        gridFrame.setVisible(true);
        gridFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}