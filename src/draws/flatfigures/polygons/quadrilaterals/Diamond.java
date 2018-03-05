package draws.flatfigures.polygons.quadrilaterals;

import java.awt.*;

public class Diamond extends Parallelogram {

    public Diamond(Point p1, Point p2, Point p3) {
       {
        setNumberOfClicks(3);
    }

    public Diamond(Point p1, Point p2, Point p3) {
        if((p1.x-p3.x)*(p1.x-p3.x)+(p1.y-p3.y)*(p1.y-p3.y)<(p2.x-p3.x)*(p2.x-p3.x)+(p2.y-p3.y)*(p2.y-p3.y)){
            Point temp=p1;
            p1=p2;
            p2=temp;
        }
        if((p3.y-p2.y)*(p2.y-p1.y)+(p2.x-p1.x)*(p3.x-p2.x)!=0){
            arrayOfPoints.add(p1);
            arrayOfPoints.add(p2);
        }
        else{
            Point temp=p2;
            p2=p3;
            p3=p2;
            arrayOfPoints.add(p1);
            arrayOfPoints.add(p2);
        }
        int x3=Math.round(((p3.x-p2.x)*(p2.x*p2.x-p1.x*p1.x)+(p3.x-p2.x)*(p2.y*p2.y-p1.y*p1.y)+2*p2.x*(p3.y-p2.y)*(p2.y-p1.y)-2*p2.y(p2.y-p1.y)*(p3.x-p2.x))/(2*(p3.y-p2.y)*(p2.y-p1.y)+(p2.x-p1.x)*(p3.x-p2.x)));
        int y3=Math.round((x3*(p3.y-p2.y))/(p3.x-p2.x)+(p2.x*(p3.y-p2.y))/(p3.x-p2.x)+p2.y);
        Point p32 = new Point(x3, y3);
        int x = p1.x + p2.x - p3.x;
        int y = p1.y + p2.y - p3.y;
        Point p4 = new Point(x, y);
        arrayOfPoints.add(p3);
        arrayOfPoints.add(p4);
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
