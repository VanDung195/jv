package Extends;

public class Sqare extends Rectangle{
	public Sqare() {
		super();
	}
	public Sqare(double side) {
		super(side,side);
	}
	public Sqare(double side,String color, boolean filled) {
		super(side, side, color, filled);
	}
	public double getSide() {
		return getLength();
	}
	public void setSide(double side) {
		setWidth(side);
		setLength(side);
	}
	@Override
	public String toString() {
		return String.format("Sqare[Rectangle[Shape[color=%s,filled=%s],w=%f,l=%f]", getColor(),isFilled(),isFilled()?"true":"false");
	}
}
