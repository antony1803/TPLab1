package drawer;

import javax.swing.*;

public class JRadioButtons {
    private JRadioButton button;
    private int countOfClicks;
    public JRadioButtons(String name, int countOfClicks){
        button = new JRadioButton(name);
        this.countOfClicks = countOfClicks;
    }

    public int getCountOfClicks() {
        return countOfClicks;
    }

    public JRadioButton getButton() {
        return button;
    }
}
