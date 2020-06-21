package View;

import java.awt.BasicStroke;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JPanel;

public class GridPanel extends JPanel{
	private drawInGrid drawInGrid;
	private ArrayList<Plane> listPlanes = new ArrayList<Plane>();


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
        if(listPlanes.size()>0) {
        drawInGrid.drawArrow(this, g2d,listPlanes);
        }
        g2d.dispose();
    }
    

    
    public void setList(ArrayList<Plane> listPlanes) {
    	this.listPlanes = listPlanes;
    }
    
    public void change() {
    	listPlanes.get(0).setAngle(270);
    	listPlanes.get(1).setAngle(180);
    	listPlanes.get(0).setX(320);
    }
}