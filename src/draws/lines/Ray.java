package draws.lines;

import java.awt.*;

public class Ray extends Segment {

    public Ray(Point p1, Point p2) {
        super(p1, p2);
    }

    @Override
    public void draw(Graphics2D g2d) {
        //TODO: дописать эту функцию, рассмотрев все 8 случаев
        int x1 = getTheCenter().x;
        int y1 = getTheCenter().y;
        int x2 = finishPoint.x;
        int y2 = finishPoint.y;
        int endX = 687;
        int endY = 635;
        if (x1 == x2){
            g2d.drawLine(x1, 0, x1, endY);
        }
        else if (y1 == y2){
            g2d.drawLine(0, y1, endX, y1);
        }
        else{
            if (x2 > x1){
                double x = (x1 - x2)*(endY - y2)/(y1 - y2) + x2;
                if (y2 > y1){
                    if (x < endX){
                        g2d.drawLine(x1, y1, (int)x, endY);
                    }
                    else{
                        double y = (endX-x2)*(y1-y2)/(x1-x2)+y2;
                        g2d.drawLine(x1, y1, endX, (int)y);
                    }
                }
                else{
                    if (x >= 0){
                        g2d.drawLine(x1, y1, (int)x, 0);
                    }
                    else {
                        double y = x2*(y2-y1)/(x1-x2)+y2;
                        g2d.drawLine(x1, y1, 0, (int)y);
                    }
                }

            }
            else{
                double y = (y1 - y2)*x2/(x2 - x1) + y2;
                if (y2 > y1){
                    g2d.drawLine(x1, y1, endX, (int)y);
                }
                else{
                    g2d.drawLine(x1, y1, 0, (int)y);
                }
            }
        }

    }

    @Override
    public void move() {
        // TODO implement here
    }

}