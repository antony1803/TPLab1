package drawer;

import draws.Figure;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

public class Window extends JFrame{
    private JButton clear = new JButton("Clear");

    public static LinkedList<Figure> getFigures() {
        return figures;
    }

    public static void setFigures(LinkedList<Figure> figures) {
        Window.figures = figures;
    }

    static private LinkedList<Figure> figures = new LinkedList<>();
    private Tools tools = new Tools();
    private Options options = new Options();
    private Paint paintLabel = new Paint();
    public Window(){
        setWindow();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        clear.addActionListener(e->{
            figures.clear();
            this.repaint();
        });
        addComponents();
        setActionListeners();
    }

    public void setWindow(){
        setSize(1000, 800);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    public void addComponents(){
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gbl);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(20, 20, 5, 5);
        gbc.gridx = 0;
        gbc.weightx = 0.05;
        gbc.weighty = 0.60;
        gbc.gridy = 0;
        gbl.setConstraints(tools, gbc);
        add(tools);
        gbc.insets = new Insets(20, 5, 5, 20);
        gbc.weightx = 0.95;
        gbc.gridx = 1;
        gbl.setConstraints(paintLabel, gbc);
        add(paintLabel);
        gbc.insets = new Insets(5, 20, 20, 20);
        gbc.gridwidth = 2;
        gbc.weighty = 0.40;
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(options, gbc);
    }

    public void setActionListeners(){

    }

}
