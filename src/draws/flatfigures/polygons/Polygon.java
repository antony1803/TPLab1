package draws.flatfigures.polygons;

import draws.flatfigures.FlatFigure;

import java.awt.*;
import java.util.ArrayList;

public class Polygon extends FlatFigure {

    public  ArrayList<Point> getArrayOfPoints() {
        return arrayOfPoints;
    }

    private ArrayList<Point> arrayOfPoints = new ArrayList<>();

    public Polygon() {
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