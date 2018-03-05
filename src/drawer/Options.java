package drawer;

import draws.*;
import draws.flatfigures.*;
import draws.flatfigures.polygons.*;
import draws.flatfigures.polygons.quadrilaterals.*;
import draws.flatfigures.polygons.quadrilaterals.Rectangle;

import javax.swing.*;
import java.awt.*;

public class Options extends JPanel {
    public Options(){
        super();
        Window.getFigures().add(new Diamond(new Point(10, 100), new Point(150, 170), new Point(75, 110)));
        //System.out.println(new Rectangle(new Point(50, 50), new Point(100, 100)).getNumberOfClicks());
        //System.out.println(new Diamond(new Point(50, 50), new Point(200, 200), new Point(150, 200)).getNumberOfClicks());
        //Window.getFigures().add(new Parallelogram(new Point(100, 100), new Point(200, 200), new Point(150, 200)));
        setBorder(BorderFactory.createLineBorder(Color.RED));
    }



}
