package draws.flatfigures.polygons.quadrilaterals;

import draws.flatfigures.polygons.Polygon;

import java.awt.*;

public class Parallelogram extends Polygon {

    {
        setNumberOfClicks(3);
    }

    public Parallelogram(Point p1, Point p2, Point p3) {
        arrayOfPoints.add(p1);
        arrayOfPoints.add(p3);
        arrayOfPoints.add(p2);
        int x = p1.x + p2.x - p3.x;
        int y = p1.y + p2.y - p3.y;
        Point p4 = new Point(x, y);
        arrayOfPoints.add(p4);
        arrayOfPoints.add(p1);
    }

    private Point leftDownCorner;

    @Override
    public void draw(Graphics2D g2d) {
        for (int i=0; i<arrayOfPoints.size() - 1; i++){
            g2d.drawLine(arrayOfPoints.get(i).x, arrayOfPoints.get(i).y, arrayOfPoints.get(i+1).x, arrayOfPoints.get(i+1).y);
        }
    }

    public void move() {
        // TODO implement here
    }

}