package Model;

import java.util.Date;


public class Airplane {
	
	private Double xPosition;
	private Double yPosition;
	private boolean isSelected;
	private Double radius;
	private Double angle;
	private Double direction;
	private Double speed;
	
	public Double getxPosition() {
		return xPosition;
	}
	public void setxPosition(Double xPosition) {
		this.xPosition = xPosition;
	}
	public Double getyPosition() {
		return yPosition;
	}
	public void setyPosition(Double yPosition) {
		this.yPosition = yPosition;
	}
	public boolean isSelected() {
		return isSelected;
	}
	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}
	public Double getRadius() {
		return radius;
	}
	public void setRadius(Double radius) {
		this.radius = radius;
	}
	public Double getAngle() {
		return angle;
	}
	public void setAngle(Double angle) {
		this.angle = angle;
	}
	public Double getDirection() {
		return direction;
	}
	public void setDirection(Double direction) {
		this.direction = direction;
	}
	public Double getSpeed() {
		return speed;
	}
	public void setSpeed(Double speed) {
		this.speed = speed;
	}

}
