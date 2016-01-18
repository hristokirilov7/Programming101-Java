package GeometryFigures;

public final class Triangle implements Shape{
	private Point a;
	private Point b;
	private Point c;

	public Triangle(Point a, Point b, Point c) {
		if (a.getX() * (b.getY() - c.getY()) + b.getX() * (c.getY() - a.getY())
				+ c.getX() * (a.getY() - b.getY()) == 0) {
			System.out.println("Points are on the same axis.");
		} else {
			this.a = new Point(a);
			this.b = new Point(b);
			this.c = new Point(c);
		}
	}

	public Triangle(Triangle other) {
		a = new Point(other.a);
		b = new Point(other.b);
		c = new Point(other.c);
	}

	public Point getUpperPoint() {
		return c;
	}

	public Point getLeftPoint() {
		return a;
	}

	public Point getRightPoint() {
		return b;
	}

	public LineSegment getLeftLine() {
		return new LineSegment(a, c);
	}

	public LineSegment getRightLine() {
		return new LineSegment(b, c);
	}

	public LineSegment getLowerLine() {
		return new LineSegment(a, b);
	}

	public double getBase() {
		return getLowerLine().getLength();
	}

	public double getHeight() {
		return 2 * getArea() / getBase();
	}

	public Point getCenter() {
		double x = (a.getX() + b.getX() + c.getX()) / 3;
		double y = (a.getY() + b.getY() + c.getY()) / 3;
		return new Point(x, y);
	}

	public double getPerimeter() {
		return getLeftLine().getLength() + getRightLine().getLength() + getLowerLine().getLength();
	}

	public double getArea() {
		double a = getRightLine().getLength();
		double b = getLeftLine().getLength();
		double c = getLowerLine().getLength();
		double p = (a + b + c) / 3;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

	@Override
	public String toString() {
		return "Triangle [(" + a.getX() + ", " + a.getY() + "), (" + getHeight() + ", " + getBase() + ")]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a.hashCode();
		result = prime * result + b.hashCode();
		result = prime * result + c.hashCode();
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
		Triangle other = (Triangle) obj;
		if (a.equals(other.a) || b.equals(other.b) || c.equals(other.c))
			return false;
		return true;
	}

}
