package draws.flatfigures.polygons.triangles;

import draws.flatfigures.polygons.Polygon;

import java.awt.*;

public class RectangularTriangle extends Polygon {

    public RectangularTriangle() {
        if((p3.y-p2.y)*(p2.y-p1.y)+(p2.x-p1.x)*(p3.x-p2.x)!=0){
        }
        else{
            Point temp=p2;
            p2=p3;
            p3=p2;
        }
        int a32 = p3.x - p2.x;
        int b21 = p2.y-p1.y;
        int b32 = p3.y-p2.y;
        int a21 = p2.x-p1.x;
        int x3 = Math.round((p1.x*a32*a21+p2.x*b32*b21-p2.y*b21*a32+p1.y*b21*a32)/((p3.y-p2.y)*(p2.y-p1.y)+(p2.x-p1.x)*(p3.x-p2.x)));
//        int x3=Math.round(((p3.x-p2.x)*(p2.x*p2.x-p1.x*p1.x)+(p3.x-p2.x)*(p2.y*p2.y-p1.y*p1.y)+2*p2.x*(p3.y-p2.y)*
//                (p2.y-p1.y)-2*p2.y*(p2.y-p1.y)*(p3.x-p2.x))/(2*(p3.y-p2.y)*(p2.y-p1.y)+(p2.x-p1.x)*(p3.x-p2.x)));
        int y3=Math.round((x3*b32/a32-p2.x*b32)/a32+p2.y);
        Point p32 = new Point(x3, y3);
        int x = p1.x + p2.x - p32.x;
        int y = p1.y + p2.y - p32.y;
        Point p4 = new Point(x, y);
        arrayOfPoints.add(p1);
        arrayOfPoints.add(p32);
        arrayOfPoints.add(p2);
        arrayOfPoints.add(p1);
    }

    @Override
    public void draw(Graphics2D g2d) {
        super.draw(g2d);
    }

    public void move() {
        // TODO implement here
    }

}
