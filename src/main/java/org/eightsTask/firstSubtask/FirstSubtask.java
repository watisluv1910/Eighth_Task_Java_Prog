package org.eightsTask.firstSubtask;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class FirstSubtask extends Canvas {

    static Random random = new Random();

    public void paint(Graphics graphics) {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException exception) {
                System.err.println("Thread bedtime fail.");
                System.exit(1);
            }

            switch (random.nextInt(3) + 1) {
                case 1:
                    paintRect(graphics);
                    break;
                case 2:
                    paintOval(graphics);
                    break;
                case 3:
                    paintArc(graphics);
                    break;
            }
        }
    }

    public void paintRect(Graphics graphics) {
        Rectangle rectangle = new Rectangle();
        graphics.setColor(rectangle.getColor());
        graphics.fillRect(rectangle.getX(), rectangle.getY(), rectangle.getWidth(), rectangle.getHeight());
    }

    public void paintOval(Graphics graphics) {
        Oval oval = new Oval();
        graphics.setColor(oval.getColor());
        graphics.fillOval(oval.getX(), oval.getY(), oval.getWidth(), oval.getHeight());
    }

    public void paintArc(Graphics graphics) {
        Arc arc = new Arc();
        graphics.setColor(arc.getColor());
        graphics.fillArc(arc.getX(), arc.getY(), arc.getWidth(), arc.getHeight(), arc.getStartAngle(), arc.getArcAngle());
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Draw figure");
        FirstSubtask subtask = new FirstSubtask();
        jFrame.setSize(1000, 1000);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(subtask);
    }
}
