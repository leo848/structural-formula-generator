package io.github.leo848;

import javax.swing.*;
import java.awt.*;

public class SFGCanvas extends JPanel {
    final DrawLoop loop;

    public SFGCanvas(DrawLoop drawLoop) {
        loop = drawLoop;
        setPreferredSize(new Dimension(500,500));
    }

    public void paint(Graphics graphics) {
        Graphics2D g2D = (Graphics2D) graphics;
    }

}
