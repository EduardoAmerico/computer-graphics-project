package View;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.util.ArrayList;

import javax.swing.JComponent;

public class drawInGrid implements GridShape {
	//arrow head/
	private static final Polygon ARROW_HEAD = new Polygon();
    static {
    	ARROW_HEAD.addPoint(10, -10);
    	ARROW_HEAD.addPoint(-10, -10);
    	ARROW_HEAD.addPoint(0, 20);
    }

    @Override
    public void draw(Graphics2D g2d, JComponent parent) {
        g2d.setColor(Color.RED);
        int xDiff = parent.getWidth() / 4;
        int height = parent.getHeight() - 1;

        int xPos = 0;

        GeneralPath path = new GeneralPath();
        path.moveTo(0, 0);
        path.curveTo(xPos + xDiff, 0, xPos, height, xPos + xDiff, height);
        xPos += xDiff;
        path.curveTo(xPos + xDiff, height, xPos, 0, xPos + xDiff, 0);
        xPos += xDiff;
        path.curveTo(xPos + xDiff, 0, xPos, height, xPos + xDiff, height);
        xPos += xDiff;
        path.curveTo(xPos + xDiff, height, xPos, 0, xPos + xDiff, 0);
        g2d.draw(path);
    }
    //draw grid
    public void drawGrid(Graphics2D g2d, JComponent parent) {
    	g2d.setColor(Color.BLACK);
    	int interval = 40;
    	//Coll
    	for(int i = 0; i < 10; i++ ) {
    		g2d.drawLine(parent.getWidth() - interval * i, 0, parent.getWidth() - interval * i, parent.getHeight());
    	}
    	//Roll
    	for(int i = 0; i < 10; i++) {
    		g2d.drawLine(0, parent.getHeight() - interval * i, parent.getWidth(), parent.getHeight() - interval * i);
    	}
    }
    
	public void drawArrow(GridPanel gridPanel, Graphics2D g2d, ArrayList<Plane> listPlanes) {
        // Obtém o AffineTransform original.
		for(int i = 0; i< listPlanes.size();i++) {
        AffineTransform tx1 = g2d.getTransform();
        g2d.setColor(listPlanes.get(i).getColor());
        
        // Cria uma cópia do AffineTransform.
        AffineTransform tx2 = (AffineTransform) tx1.clone();
        
        // Translada e rotaciona o novo AffineTransform.
        tx2.translate(listPlanes.get(i).getX()+200, listPlanes.get(i).getY()*(-1)+200);
        tx2.rotate(Math.toRadians(listPlanes.get(i).getDirection()*(-1)-90));
        //tx2.rotate
        // Desenha a ponta com o AffineTransform transladado e rotacionado.
        g2d.setTransform(tx2);
        g2d.fill(ARROW_HEAD);
       // System.out.println(i);
        // Restaura o AffineTransform original.
        g2d.setTransform(tx1);
		}
       
	}


   

    


}
