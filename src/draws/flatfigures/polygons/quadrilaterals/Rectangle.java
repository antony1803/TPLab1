package draws.flatfigures.polygons.quadrilaterals;

import java.awt.*;

public class Rectangle extends Parallelogram {

    public Rectangle(Point p1, Point p2) {
        super(p1, p2, new Point(p1.x, p2.y));
    }

    @Override
    public void draw(Graphics2D g2d) {
        super.draw(g2d);
    }

    public void move() {
        // TODO implement here
    }

}