package View;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JPanel;

public class GridPanel extends JPanel {
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
		if (listPlanes.size() > 0) {
			drawInGrid.drawArrow(this, g2d, listPlanes);
		}
		g2d.dispose();
	}

	public void setList(ArrayList<Plane> listPlanes) {
		this.listPlanes = listPlanes;
	}

	public void transform(Plane p, int id) {
		listPlanes.get(id).setAngle(p.getAngle());
		listPlanes.get(id).setRaio(p.getRaio());
		listPlanes.get(id).setY(p.getY());
		listPlanes.get(id).setX(p.getX());
		repaint();
	}
	

	
	public void mudacor(int[] ids) {
		for (int i = 0; i < listPlanes.size(); i++) {
			listPlanes.get(i).setColor(Color.BLACK);
		}
		for (int i = 0; i < ids.length; i++) {
			for (int j = 0; j < listPlanes.size(); j++) {
				if(listPlanes.get(j).getId() == ids[i]) {
					listPlanes.get(j).setColor(Color.orange);
					ids[i]=-1;
				}
			}
		}
		repaint();
	}
}
