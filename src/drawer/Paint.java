package drawer;

import draws.Figure;
import draws.flatfigures.polygons.npolygons.Star;
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

    int counter = -1;
    int k = -1;
    ArrayList<Point> points = new ArrayList<>();

    public Paint(){
        super();
        setOpaque(true);
        setCursor(Cursor.getPredefinedCursor(1));
        setBackground(Color.white);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                System.out.println(2);
                points.add(e.getPoint());
                counter--;
                if (counter == -1){
                    switch(k){
                        case 0:
                            new Line(points.get(0), points.get(1));
                            break;
                        case 1:
                            new Ray(points.get(0), points.get(1));
                            break;
                        case 2:
                            new Segment(points.get(0), points.get(1));
                            break;
                        case 3:
                            new Star(points.get(0), points.get(1));
                            break;
                        case 4:

                            break;
                        case 5:

                            break;
                        case 6:

                            break;
                        case 7:

                            break;
                        case 8:

                            break;
                        case 9:

                            break;
                        case 10:

                            break;
                        case 11:

                            break;
                        case 12:

                            break;
                        case 13:

                            break;
                        default: break;
                    }
                    points.clear();
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                System.out.println(3);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                System.out.println(4);
                k = -1;
                for (int i=0; i<Tools.buttons.size(); i++){
                    if (Tools.buttons.get(i).isSelected()){
                        k = i;
                        break;
                    }
                }
                if (counter == -1){
                    if (k > 3){
                        counter = 3;
                    }
                    else {
                        counter = 2;
                    }
                }

            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                System.out.println(5);
            }

        });
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;
        LinkedList<Figure> figures = Window.getFigures();
        for (int i=0; i<figures.size(); i++){
            figures.get(i).draw(g2d);
        }
    }

}
