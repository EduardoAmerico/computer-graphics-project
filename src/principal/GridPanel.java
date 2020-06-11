package principal;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
import javax.swing.JPanel;

public class GridPanel extends JPanel{
	private WaveShape waveShape;

    public GridPanel() {
        waveShape = new WaveShape();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(200, 200);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.drawLine(getWidth() / 2, 0, getWidth() / 2, getHeight());
        g2d.drawLine(0, getHeight() / 2, getWidth(), getHeight() / 2);
        g2d.dispose();

        // I don't trust you
        g2d = (Graphics2D) g.create();
        waveShape.draw(g2d, this);
        g2d.dispose();
    }
}
