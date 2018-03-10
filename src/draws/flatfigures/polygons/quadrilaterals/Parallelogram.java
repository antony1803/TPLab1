package draws.flatfigures.polygons.quadrilaterals;

import draws.flatfigures.polygons.Polygon;

import java.awt.*;

public class Parallelogram extends Polygon {

    public Parallelogram(Point p1, Point p2, Point p3) {
        super(p1, p3, p2, new Point(p1.x + p2.x - p3.x, p1.y + p2.y - p3.y));
    }

    private Point leftDownCorner;

    @Override
    public void draw(Graphics2D g2d) {
        super.draw(g2d);
    }

    @Override
    public void move() {
        // TODO implement here
    }

}