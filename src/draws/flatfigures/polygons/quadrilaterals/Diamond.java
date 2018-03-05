package draws.flatfigures.polygons.quadrilaterals;

import java.awt.*;

public class Diamond extends Parallelogram {

    public Diamond(Point p1, Point p2, Point p3) {
        if((p1.x-p3.x)*(p1.x-p3.x)+(p1.y-p3.y)*(p1.y-p3.y)<(p2.x-p3.x)*(p2.x-p3.x)+(p2.y-p3.y)*(p2.y-p3.y)){
            Point temp=p1;
            p1=p2;
            p2=temp;
        }
        if((p3.y-p2.y)*(p2.y-p1.y)+(p2.x-p1.x)*(p3.x-p2.x)!=0){
        }
        else{
            Point temp=p2;
            p2=p3;
            p3=p2;
        }
        int a32 = p3.x - p2.x;
        int a21square = p2.x*p2.x - p1.x*p1.x;
        int b21square = p2.y*p2.y-p1.y*p1.y;
        int b21 = p2.y-p1.y;
        int b32 = p3.y-p2.y;
        int a21 = p2.x-p1.x;
        int x3 = Math.round((a32*a21square + a32*b21square + 2*p2.x*b32*b21-2*p2.y*b21*a32)/(2*(b32*b21+a21*a32)));
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
        arrayOfPoints.add(p4);
        arrayOfPoints.add(p1);
        }

        private Point leftDownCorner;

        @Override
        public void draw(Graphics2D g2d) {
            super.draw(g2d);
        }

        public void move() {
            // TODO implement here
        }

    }