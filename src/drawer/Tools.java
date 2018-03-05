package drawer;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Tools extends JPanel {


    static JButton clear = new JButton("Clear");
    static ArrayList<JRadioButton> buttons = new ArrayList<>();

    public Tools(){
        super();
        buttons.add(new JRadioButton("Line"));
        buttons.add(new JRadioButton("Ray"));
        buttons.add(new JRadioButton("Segment"));
        buttons.add(new JRadioButton("Star"));
        buttons.add(new JRadioButton("Parallelogramm"));
        buttons.add(new JRadioButton("Rectangle"));
        buttons.add(new JRadioButton("Diamond"));
        buttons.add(new JRadioButton("Ellipse"));
        buttons.add(new JRadioButton("Circle"));
        buttons.add(new JRadioButton("Polygon"));
        buttons.add(new JRadioButton("Regular Polygon"));
        buttons.add(new JRadioButton("Isosceless Triangle"));
        buttons.add(new JRadioButton("Rectangular Triangle"));
        buttons.add(new JRadioButton("Isosceless Rectangular Triangle"));
        addComponents();
        setBorder(BorderFactory.createLineBorder(Color.BLUE));
    }
    public void addComponents(){
        setLayout(new GridLayout(0, 1));
        ButtonGroup bg = new ButtonGroup();
        buttons.get(0).setSelected(true);
        for (int i =0; i < buttons.size(); i++){
            bg.add(buttons.get(i));
            add(buttons.get(i));
        }
        JPanel temp = new JPanel();
        temp.add(clear, BorderLayout.PAGE_END);
        add(temp);
    }
}
