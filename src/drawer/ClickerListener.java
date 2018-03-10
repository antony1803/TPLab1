package drawer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickerListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Paint.counter = -1;
        Paint.points.clear();
    }
}
