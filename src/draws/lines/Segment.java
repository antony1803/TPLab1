package draws.lines;

import draws.Figure;

import java.awt.*;

public class Segment extends Figure {

    protected Point startPoint;
    protected Point finishPoint;

    public Segment() {
    }

    public Segment(Point p1, Point p2) {
        setTheCenter(new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2));
        startPoint = p1;
        finishPoint = p2;
    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(Color.black);
        g2d.drawLine(startPoint.x, startPoint.y, finishPoint.x, finishPoint.y);
        g2d.drawOval(getTheCenter().x - 3, getTheCenter().y - 3, 6, 6);
        g2d.setColor(Color.red);
        g2d.fillOval(getTheCenter().x - 3, getTheCenter().y - 3, 6, 6);
        g2d.setColor(Color.black);
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