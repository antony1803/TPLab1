package draws.flatfigures.polygons;

import draws.flatfigures.FlatFigure;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Polygon extends FlatFigure {

    public Polygon(Point[] p) {
        arrayOfPoints = new ArrayList(Arrays.asList(p));
    }

    public  ArrayList<Point> getArrayOfPoints() {
        return arrayOfPoints;
    }

    private ArrayList<Point> arrayOfPoints;

    public Polygon(Point p1, Point p2, Point... p) {

        arrayOfPoints = new ArrayList(Arrays.asList(p));
        arrayOfPoints.add(0, p2);
        arrayOfPoints.add(0, p1);
        arrayOfPoints.add(p1);
    }

    @Override
    public void draw(Graphics2D g2d) {
        for (int i=0; i<arrayOfPoints.size() - 1; i++){
            g2d.setColor(Color.black);
            g2d.drawLine(arrayOfPoints.get(i).x, arrayOfPoints.get(i).y, arrayOfPoints.get(i+1).x, arrayOfPoints.get(i+1).y);
            g2d.setColor(Color.red);
            g2d.drawRect(arrayOfPoints.get(i).x-1, arrayOfPoints.get(i).y-1,2, 2);
            System.out.println(arrayOfPoints.get(i) + " - " + arrayOfPoints.get(i+1));
        }
    }

    public void move() {
        // TODO implement here
    }

}