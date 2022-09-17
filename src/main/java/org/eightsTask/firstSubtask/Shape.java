package org.eightsTask.firstSubtask;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public abstract class Shape {

    static Random random = new Random();

    private Color color;
    private ArrayList<Color> colors = new ArrayList<>();
    private Integer x, y, width, height;

    public Shape() {
        x = random.nextInt(580) + 10;
        y = random.nextInt(380) + 10;

        width = random.nextInt(200) + 100;
        height = random.nextInt(200) + 100;

        fillColours();
        color = colors.get(random.nextInt(colors.size()));
    }

    private void fillColours() {
        colors.add(Color.RED);
        colors.add(Color.GREEN);
        colors.add(Color.BLUE);
        colors.add(Color.YELLOW);
        colors.add(Color.BLACK);
    }

    public Color getColor() {
        return color;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }
}
