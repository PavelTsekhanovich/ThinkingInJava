package com.thinkinginjava.gui;

import com.thinkinginjava.net.mindview.util.Generator;
import com.thinkinginjava.net.mindview.util.RandomGenerator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.thinkinginjava.net.mindview.util.SwingConsole.run;

public class TextPane extends JFrame {
    private JButton b = new JButton("Add Text");
    private JTextPane tp = new JTextPane();
    private static Generator sg =
            new RandomGenerator.String(7);

    public TextPane() {
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for (int i = 1; i < 10; i++)
                    tp.setText(tp.getText() + sg.next() + "\n");
            }
        });
        add(new JScrollPane(tp));
        add(BorderLayout.SOUTH, b);
    }

    public static void main(String[] args) {
        run(new TextPane(), 475, 425);
    }
}
