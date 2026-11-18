package model.entities;

import model.enums.Color;

public class Rectangle extends AbstractShape{

	private Double heigt;
	private Double width;
	
	public Rectangle(Color color, Double heigt, Double width) {
		super(color);
		this.heigt = heigt;
		this.width = width;
	}

	public Double getHeigt() {
		return heigt;
	}

	public void setHeigt(Double heigt) {
		this.heigt = heigt;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}
	
	@Override
	public  double area() {
		return width * heigt;
	}
	
	
}
