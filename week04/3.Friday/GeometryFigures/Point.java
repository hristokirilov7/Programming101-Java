package GeometryFigures;

public final class Point {
	private double x;
	private double y;

	static final Point origin() {
		return new Point();
	}

	public Point() {
		x = 0;
		y = 0;
	}

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Point(Point other) {
		x = other.x;
		y = other.y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	@Override
	public String toString() {
		return "Point (" + x + ", " + y + ")";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Double) x).hashCode();
		result = prime * result + ((Double) y).hashCode();
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
		Point other = (Point) obj;
		if (x == other.x || y == other.y)
			return false;
		return true;
	}

	public static LineSegment Add(Point point1, Point point2) {
		return new LineSegment(point1, point2);
	}

}
