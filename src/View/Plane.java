package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Plane {
    private double x, y, angle, raio, direction, velocidade;
    
    public Plane(double x, double y,double raio, double angle, double direction, double velocidade) {
        super();
        this.x = x;
        this.y = y;
        this.angle = angle;
        this.raio = raio;
        this.direction = direction;
        this.velocidade = velocidade;
    }
    
    public double getDirection() {
		return direction;
	}

	public void setDirection(double direction) {
		this.direction = direction;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public void setAngle(double angle) {
    	this.angle = angle;
    }
    public void setX(double x) {
    	this.x = x;
    }
    public void setY(double y) {
    	this.y = y;
    }
    
    public double getAngle() {
		return angle;
	}
    
    public double getX() {
		return x;
	}
    
    public double getY() {
		return y;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}



}
