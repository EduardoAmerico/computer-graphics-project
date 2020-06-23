package View;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Plane {
	private int id;
    private double x, y, angle, raio, direction, velocidade;
    private Color cor;
    
    public Plane(int id, double x, double y,double raio, double angle, double direction, double velocidade) {
        super();
        this.id = id;
        this.x = x;
        this.y = y;
        this.angle = angle;
        this.raio = raio;
        this.direction = direction;
        this.velocidade = velocidade;
        this.cor = Color.BLACK;
    }
    
    public Plane() {
		// TODO Auto-generated constructor stub
	}

	public double getDirection() {
		return direction;
	}

	public void setDirection(double direction) {
		this.direction = direction;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	public void setColor(Color cor) {
		this.cor = cor;
	}
	
	public Color getColor() {
		return cor;
	}



}
