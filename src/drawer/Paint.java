package drawer;

import draws.Figure;
import draws.flatfigures.circles.Circle;
import draws.flatfigures.circles.Ellipse;
import draws.flatfigures.polygons.npolygons.RegularNPolygon;
import draws.flatfigures.polygons.npolygons.Star;
import draws.flatfigures.polygons.quadrilaterals.Diamond;
import draws.flatfigures.polygons.quadrilaterals.Parallelogram;
import draws.flatfigures.polygons.quadrilaterals.Rectangle;
import draws.flatfigures.polygons.triangles.IsoscelesRectangularTriangle;
import draws.flatfigures.polygons.triangles.IsoscelesTriangle;
import draws.flatfigures.polygons.triangles.RectangularTriangle;
import draws.lines.Line;
import draws.lines.Ray;
import draws.lines.Segment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.LinkedList;

public class Paint extends JLabel {

    static int counter = -1;
    int k = -1;
    static ArrayList<Point> points = new ArrayList<>();

    public Paint() {
        super();
        Options.getClear().addActionListener(e-> {
            Window.getFigures().clear();
            Paint.points.clear();
            repaint();
        });
        setOpaque(true);
        setBackground(Color.white);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                if (Options.dr.isSelected()) {
                    points.add(new Point(e.getX(), e.getY()));
                    if (points.size() == counter) {
                        Point p1 = points.get(0);
                        Point p2 = points.get(1);
                        Point p3 = new Point();
                        double a12, a21, a23, a32, b12, b21, b23, b32, x1, y1;
                        if (k > 3) {
                            p3 = points.get(2);
                        }
                        switch (k) {
                            case 0:
                                Window.getFigures().add(new Line(p1, p2));
                                break;
                            case 1:
                                Window.getFigures().add(new Ray(p1, p2));
                                break;
                            case 2:
                                Window.getFigures().add(new Segment(p1, p2));
                                break;
                            case 3:
                                new Star(p1, p2);
                                break;
                            case 4:
                                Window.getFigures().add(new Parallelogram(p1, p2, p3));
                                break;
                            case 5:
                                b21 = p2.y-p1.y;
                                a21 = p2.x-p1.x;
                                if(p1.x!=p2.x){
                                    x1=-p3.y*b21/a21+p2.y*b21/a21+p2.x;
                                    y1=p3.y;
                                }
                                else{
                                    y1=-p3.x*a21/b21+p2.y*a21/b21+p2.y;
                                    x1=p3.y;
                                }

                                Window.getFigures().add(new Rectangle(p1, p2, new Point((int)Math.round(x1), (int)Math.round(y1))));
                                break;
                            case 6:
                                a12 = p1.x - p2.x;
                                a32 = p3.x - p2.x;
                                b12 = p1.y - p2.y;
                                b32 = p3.y - p2.y;
                                double x = a32 * Math.sqrt((a12 * a12 + b12 * b12) / (a32 * a32 + b32 * b32)) + (double) p2.x;
                                double y = b32 * Math.sqrt((a12 * a12 + b12 * b12) / (a32 * a32 + b32 * b32)) + (double) p2.y;
                                Window.getFigures().add(new Diamond(p1, p2, new Point((int) Math.round(x), (int) Math.round(y))));
                                break;
                            case 7:
                                Window.getFigures().add(new Ellipse(p1, p2, p3));
                                break;
                            case 8:
                                Window.getFigures().add(new Circle(p1, p2));
                                break;
                            case 9:
                                new Polygon();
                                break;
                            case 10:
                                new RegularNPolygon();
                                break;
                            case 11:
                                a12 = p1.x - p2.x;
                                a32 = p3.x - p2.x;
                                b12 = p1.y - p2.y;
                                b32 = p3.y - p2.y;
                                x1 = a32 * Math.sqrt((a12 * a12 + b12 * b12) / (a32 * a32 + b32 * b32)) + (double) p2.x;
                                y1 = b32 * Math.sqrt((a12 * a12 + b12 * b12) / (a32 * a32 + b32 * b32)) + (double) p2.y;
                                Window.getFigures().add(new IsoscelesTriangle(p1, p2, new Point((int) Math.round(x1), (int) Math.round(y1))));
                                break;
                            case 12:
                                b21 = p2.y - p1.y;
                                a21 = p2.x - p1.x;
                                if (p1.x != p2.x) {
                                    x1 = -p3.y * b21 / a21 + p2.y * b21 / a21 + p2.x;
                                    y1 = p3.y;
                                } else {
                                    y1 = -p3.x * a21 / b21 + p2.y * a21 / b21 + p2.y;
                                    x1 = p3.y;
                                }
                                Window.getFigures().add(new RectangularTriangle(p1, p2, new Point((int) Math.round(x1), (int) Math.round(y1))));
                                break;
                            case 13:
                                double x4 = (double) (p1.x + p2.x) / 2.0;
                                double y4 = (double) (p1.y + p2.y) / 2.0;
                                a21 = p2.x - p1.x;
                                double c21 = p2.y - p1.y;
                                double a43 = x4 - p3.x;
                                double y2 = (p3.y * c21 * c21 + y4 * a21 * a21 - a43 * a21 * c21) / (a21 * c21);
                                double x2 = -y2 * c21 / a21 + p3.y * c21 / a21 + p3.x;
                                a12 = p1.x - p2.x;
                                a32 = x2 - p2.x;
                                b12 = p1.y - p2.y;
                                b32 = y2 - p2.y;
                                x1 = a32 * Math.sqrt((a12 * a12 + b12 * b12) / (a32 * a32 + b32 * b32)) + (double) p2.x;
                                y1 = b32 * Math.sqrt((a12 * a12 + b12 * b12) / (a32 * a32 + b32 * b32)) + (double) p2.y;
                                Window.getFigures().add(new IsoscelesRectangularTriangle(p1, p2, new Point(p1.x + (int) Math.round(x1) - p2.x, p1.y + (int) Math.round(y1) - p2.y)));
                                //new IsoscelesRectangularTriangle(p1, p2, p3);
                                break;
                            default:
                                break;
                        }
                        points.clear();
                        repaint();
                        if (k > 3) {
                            counter = 3;
                        } else {
                            counter = 2;
                        }
                    }
                } else if (Options.mov.isSelected()) {

                }
            }


            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                if (Options.dr.isSelected()) {

                } else if (Options.mov.isSelected()) {

                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if (Options.dr.isSelected()) {
                    setCursor(Cursor.getPredefinedCursor(1));
                    k = -1;
                    for (int i = 0; i < Tools.buttons.size(); i++) {
                        if (Tools.buttons.get(i).isSelected()) {
                            k = i;
                            break;
                        }
                    }
                    if (k > 3) {
                        counter = 3;
                    } else {
                        counter = 2;
                    }
                } else if (Options.mov.isSelected()) {
                    setCursor(Cursor.getDefaultCursor());
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                k = -1;
                for (int i = 0; i < Tools.buttons.size(); i++) {
                    if (Tools.buttons.get(i).isSelected()) {
                        k = i;
                        break;
                    }
                }
                if (k > 3) {
                    counter = 3;
                } else {
                    counter = 2;
                }
            }

        });

    }

    static public void setDraw() {

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        LinkedList<Figure> figures = Window.getFigures();
        for (int i = 0; i < figures.size(); i++) {
            figures.get(i).draw(g2d);
        }

    }

}
