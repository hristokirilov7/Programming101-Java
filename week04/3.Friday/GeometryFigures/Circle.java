package GeometryFigures;

public final class Circle implements Shape{
	private Point center;
	private double r;

	public Circle(Point center, double r) {
		this.center = new Point(center);
		this.r = r;
	}

	public Circle(Circle other) {
		center = new Point(other.center);
		r = other.r;
	}

	public Point getUpperLeft() {
		return new Point(center.getX() - r, center.getY() + r);
	}

	public Point getUpperRight() {
		return new Point(center.getX() + r, center.getY() + r);
	}

	public Point getLowerLeft() {
		return new Point(center.getX() - r, center.getY() - r);
	}

	public Point getLowerRight() {
		return new Point(center.getX() + r, center.getY() - r);
	}

	public Point getCenter() {
		return center;
	}

	public double getPerimeter() {
		return 2 * Math.PI * r;
	}

	public double getArea() {
		return Math.PI * r * r;
	}

	@Override
	public String toString() {
		return "Circle [(" + center.getX() + ", " + center.getY() + "), " + r + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + center.hashCode();
		result = prime * result + Double.hashCode(r);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (r != other.r || center.equals(other.center))
			return false;
		return true;
	}

}
