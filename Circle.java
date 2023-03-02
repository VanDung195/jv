package Extends;

public class Circle extends Shape{
	    private double radius;
	    public Circle() {
	    	super();
			this.radius=1;
		}
	    
	    public Circle(double radius, java.lang.String color, boolean filled) {
	    	super(color, filled);
	    	this.radius = radius;
		}

	    public double getRadius() {
	        return radius;
	    }

	    public void setRadius(double radius) {
	        this.radius = radius;
	    }

	    public double getArea() {
	        return Math.PI * radius * radius;
	    }

	    public double getCircumference() {
	        return 2 * Math.PI * radius;
	    }
	    @Override
	    public java.lang.String toString() {
	    	return String.format("Circle[Radius: %s, color: %s, filled: %s", radius,getColor(),isFilled()?"true":"false");
	    }
}
