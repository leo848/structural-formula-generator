package io.github.leo848;

import javax.swing.*;

public class SFGFrame extends JFrame {
    final DrawLoop loop;
    final SFGCanvas canvas;

    SFGFrame(DrawLoop drawLoop) {
        loop = drawLoop;
        canvas = new SFGCanvas(loop);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(canvas);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void repaintCanvas() {
        canvas.repaint();
    }
}
