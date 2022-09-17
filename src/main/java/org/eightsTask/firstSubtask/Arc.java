package org.eightsTask.firstSubtask;

public class Arc extends Shape {

    private Integer startAngle, arcAngle;

    public Arc() {
        startAngle = random.nextInt(350) + 5;
        arcAngle = random.nextInt(350) + 5;
    }

    public Integer getStartAngle() {
        return startAngle;
    }

    public Integer getArcAngle() {
        return arcAngle;
    }
}
