package draws.lines;

import draws.Figure;

import java.awt.*;

public class Segment extends Figure {

    protected Point finishPoint;

    public Segment(Point p1, Point p2) {
        setTheCenter(p1);
        finishPoint = p2;
    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(Color.black);
        g2d.drawLine(getTheCenter().x, getTheCenter().y, finishPoint.x, finishPoint.y);
        g2d.drawOval(getTheCenter().x-3, getTheCenter().y-3, 6, 6);
        g2d.drawOval(finishPoint.x-3, finishPoint.y-3, 6, 6);
        g2d.setColor(Color.red);
        g2d.fillOval(getTheCenter().x-3, getTheCenter().y-3, 6, 6);
        g2d.fillOval(finishPoint.x-3, finishPoint.y-3, 6, 6);
    }

    @Override
    public void move() {
        // TODO implement here
    }



    public Point getFinishPoint() {
        return finishPoint;
    }

    public void setFinishPoint(Point finishPoint) {
        this.finishPoint = finishPoint;
    }

}