package org.eightsTask.thirdSubtask;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.net.MalformedURLException;

public class ThirdSubtask extends Canvas {

    public static void main(String[] args) throws MalformedURLException {

        URL url = new URL("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Rotating_earth_%28large%29.gif/274px-Rotating_earth_%28large%29.gif");
        Icon icon = new ImageIcon(url);
        JLabel label = new JLabel(icon);

        JFrame frame = new JFrame("Earth gif");

        frame.getContentPane().add(label);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
