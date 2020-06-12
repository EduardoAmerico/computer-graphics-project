package principal;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;

import javax.swing.JComponent;

public class drawInGrid implements GridShape {
	//arrow head/
    private static final Polygon ARROW_HEAD = new Polygon();

    static {
        ARROW_HEAD.addPoint(0, 0);
        ARROW_HEAD.addPoint(-15, -40);
        ARROW_HEAD.addPoint(15, -40);
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
    
	public void drawArrow(GridPanel gridPanel, Graphics2D g2d, double x, double y, double angle) {
        // Obtém o AffineTransform original.
        AffineTransform tx1 = g2d.getTransform();

        // Cria uma cópia do AffineTransform.
        AffineTransform tx2 = (AffineTransform) tx1.clone();
        
        // Translada e rotaciona o novo AffineTransform.
        tx2.translate(x, y);
        tx2.rotate(angle - Math.PI / 2);
        // Desenha a ponta com o AffineTransform transladado e rotacionado.
        g2d.setTransform(tx2);
        g2d.fill(ARROW_HEAD);

        // Restaura o AffineTransform original.
        g2d.setTransform(tx1);
		
	}
   

    


}
