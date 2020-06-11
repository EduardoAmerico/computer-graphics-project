package principal;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;

import javax.swing.JComponent;

public class drawInGrid implements GridShape {

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
    


}
