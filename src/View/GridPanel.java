package View;

import java.awt.BasicStroke;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
import javax.swing.JPanel;

public class GridPanel extends JPanel{
	private drawInGrid drawInGrid;

    public GridPanel() {
        drawInGrid = new drawInGrid();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(400, 400);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setStroke(new BasicStroke(4));
        g2d.drawLine(getWidth() / 2, 0, getWidth() / 2, getHeight());
        g2d.drawLine(0, getHeight() / 2, getWidth(), getHeight() / 2);
        g2d.dispose();

        // I don't trust you
        g2d = (Graphics2D) g.create();
        drawInGrid.drawGrid(g2d, this);
        drawInGrid.drawArrow(this, g2d,300,300, 90);
        g2d.dispose();
    }
}
