package draws.flatfigures.polygons;

import draws.flatfigures.FlatFigure;

import java.awt.*;
import java.util.ArrayList;

public class Polygon extends FlatFigure {

    protected ArrayList<Point> arrayOfPoints = new ArrayList<>();

    public Polygon() {
    }

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