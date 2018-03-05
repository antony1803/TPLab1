package draws;

import java.awt.*;

public abstract class Figure extends drawer.Paint{

    public Figure() {
    }

    private Point theCenter;

    private Color penColor;

    private int penWidth;

    public abstract void draw(Graphics2D g2d);

    public void move() {
        // TODO implement here
    }

    public Point getLocation() {
        return theCenter;
    }

    public Point getTheCenter() {
        return theCenter;
    }

    public void setTheCenter(Point theCenter) {
        this.theCenter = theCenter;
    }

    public Color getPenColor() {
        return penColor;
    }

    public void setPenColor(Color penColor) {
        this.penColor = penColor;
    }

    public int getPenWidth() {
        return penWidth;
    }

    public void setPenWidth(int penWidth) {
        this.penWidth = penWidth;
    }
}