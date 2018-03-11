package drawer;

import draws.*;
import draws.flatfigures.*;
import draws.flatfigures.polygons.*;
import draws.flatfigures.polygons.quadrilaterals.*;
import draws.flatfigures.polygons.quadrilaterals.Rectangle;

import javax.swing.*;
import java.awt.*;

public class Options extends JPanel {
    static JRadioButton dr;
    static JRadioButton mov;
    public Options(){
        super();
        dr = new JRadioButton("Draw");
        mov = new JRadioButton("Move");
        ButtonGroup whatToDo = new ButtonGroup();
        whatToDo.add(dr);
        whatToDo.add(mov);
        dr.setSelected(true);
        add(dr);
        add(mov);
        //Window.getFigures().add(new Diamond(new Point(0, 0), new Point(8,0), new Point(7,1)));
        //System.out.println(new Rectangle(new Point(50, 50), new Point(100, 100)).getNumberOfClicks());
        //System.out.println(new Diamond(new Point(50, 50), new Point(200, 200), new Point(150, 200)).getNumberOfClicks());
        //Window.getFigures().add(new Parallelogram(new Point(100, 100), new Point(200, 200), new Point(150, 200)));
        setBorder(BorderFactory.createLineBorder(Color.RED));
    }



}
