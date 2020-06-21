package View;

public class Plane {
    private int x;
    private int y;
    private double angle;

    public Plane(int x, int y, double angle) {
        super();
        this.x = x;
        this.y = y;
        this.angle = angle;
    }
    
    public void setAngle(double angle) {
    	this.angle = angle;
    }
    public void setx(int x) {
    	this.x = x;
    }
    public void sety(int y) {
    	this.y = y;
    }
    
    public double getAngle() {
		return angle;
	}
    
    public int getX() {
		return x;
	}
    
    public int getY() {
		return y;
	}
    

}
