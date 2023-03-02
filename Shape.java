package Extends;

public class Shape {
	private String color;
	private boolean filled;
	
	public Shape() {
		this.color="red";
		this.filled=true;
	}
	public String getColor() {
		return color;
	}

	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	@Override
	public String toString() {
		return java.lang.String.format("Shape [Color: %s, filled: %s]",color, filled?"true":"false");
	}
	
	
}
