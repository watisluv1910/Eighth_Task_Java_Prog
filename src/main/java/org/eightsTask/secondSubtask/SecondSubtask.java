package org.eightsTask.secondSubtask;

import javax.swing.*;
import java.awt.*;

public class SecondSubtask extends Canvas {

    Image image;

    public SecondSubtask(Image i) {
        image = i;
    }

    public static void main(String[] args) {
        String imageFile = args[0];
        ImageIcon imageIcon = new ImageIcon(imageFile);

        Image image = imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);

        JFrame jFrame = new JFrame("Show picture");
        jFrame.setSize(1000, 1000);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(new SecondSubtask(image));
    }

    public void paint(Graphics g) {
        g.drawImage(image, 300, 300, this);
    }
}
