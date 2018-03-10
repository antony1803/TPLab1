package draws.flatfigures.polygons.npolygons;

import draws.flatfigures.polygons.Polygon;

import java.awt.*;

public class RegularNPolygon extends Polygon{

    protected int N;

    public RegularNPolygon(Point... p){
        super(p);
    }

    @Override
    public void draw(Graphics2D g2d) {
        super.draw(g2d);
    }

    @Override
    public void move() {
        // TODO implement here
    }

}