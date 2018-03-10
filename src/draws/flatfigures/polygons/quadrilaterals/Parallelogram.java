package draws.flatfigures.polygons.quadrilaterals;

import draws.flatfigures.polygons.Polygon;

import java.awt.*;

public class Parallelogram extends Polygon {

    public Parallelogram(){}

    public Parallelogram(Point p1, Point p2, Point p3) {
        getArrayOfPoints().add(p1);
        getArrayOfPoints().add(p3);
        getArrayOfPoints().add(p2);
        int x = p1.x + p2.x - p3.x;
        int y = p1.y + p2.y - p3.y;
        Point p4 = new Point(x, y);
        getArrayOfPoints().add(p4);
        getArrayOfPoints().add(p1);
    }

    private Point leftDownCorner;

    @Override
    public void draw(Graphics2D g2d) {
        super.draw(g2d);
    }

    public void move() {
        // TODO implement here
    }

}