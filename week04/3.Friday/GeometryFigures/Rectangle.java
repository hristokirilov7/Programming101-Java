package GeometryFigures;

public final class Rectangle implements Shape{
	private Point upLeft;
	private Point downRight;

	public Rectangle(Point upLeft, Point downRight) {
		if (upLeft.equals(downRight)) {
			System.out.println("Points are on the same axis.");
		} else {
			this.upLeft = new Point(upLeft);
			this.downRight = new Point(downRight);
		}
	}

	public Rectangle(Rectangle other) {
		upLeft = new Point(other.upLeft);
		downRight = new Point(other.downRight);
	}

	public Point getUpperLeft() {
		return upLeft;
	}

	public Point getUpperRight() {
		return new Point(downRight.getX(), upLeft.getY());
	}

	public Point getLowerLeft() {
		return new Point(upLeft.getX(), downRight.getY());
	}

	public Point getLowerRight() {
		return downRight;
	}

	public LineSegment getUpper() {
		return new LineSegment(upLeft, getUpperRight());
	}

	public LineSegment getLower() {
		return new LineSegment(getLowerRight(), downRight);
	}

	public LineSegment getLeft() {
		return new LineSegment(upLeft, getLowerLeft());
	}

	public LineSegment getRight() {
		return new LineSegment(getUpperRight(), downRight);
	}

	public double getWidth() {
		LineSegment tmp = new LineSegment(upLeft, getUpperRight());
		return tmp.getLength();
	}

	public double getHeight() {
		LineSegment tmp = new LineSegment(upLeft, getLowerLeft());
		return tmp.getLength();
	}

	public Point getCenter() {
		return new Point((upLeft.getX() + downRight.getX()) / 2, (upLeft.getY() + downRight.getY()) / 2);
	}

	public double getPerimeter() {

		return 2 * (getHeight() + getWidth());
	}

	public double getArea() {
		return getHeight() * getWidth();
	}

	@Override
	public String toString() {
		return "Rectangle [(" + upLeft.getX() + ", " + upLeft.getY() + ") (" + getHeight() + ", " + getWidth() + ")]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + downRight.hashCode();
		result = prime * result + upLeft.hashCode();
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
		Rectangle other = (Rectangle) obj;
		if (upLeft.equals(other.upLeft) || downRight.equals(other.downRight))
			return false;
		return true;
	}

}
