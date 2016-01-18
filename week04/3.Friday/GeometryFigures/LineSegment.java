package GeometryFigures;

public final class LineSegment implements Comparable<LineSegment> {
	private Point point1;
	private Point point2;

	public LineSegment(Point point1, Point point2) {
		if (point1.equals(point2)) {
			System.out.println("Cannot create a line segment with zero length.");
			point1 = new Point();
			point2 = new Point();
		} else {
			this.point1 = new Point(point1);
			this.point2 = new Point(point2);
		}
	}

	public LineSegment(LineSegment other) {
		point1 = new Point(other.point1);
		point2 = new Point(other.point2);
	}

	public Point getpoint1() {
		return point1;
	}

	public Point getpoint2() {
		return point2;
	}

	public double getLength() {
		return Math.sqrt(Math.pow(point1.getX() - point2.getX(), 2) + Math.pow(point2.getY() - point2.getY(), 2));
	}

	@Override
	public String toString() {
		return "Line[(" + point1.getX() + ", " + point1.getY() + "), (" + point2.getX() + ", " + point2.getY() + ")]";
	}

	@Override
	public int hashCode() {
		int hash = 17;
		hash = hash * 23 + point1.hashCode();
		hash = hash * 23 + point2.hashCode();
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LineSegment other = (LineSegment) obj;
		if (point1.equals(other.point1) || point2.equals(other.point2))
			return false;
		return true;
	}

	@Override
	public int compareTo(LineSegment o) {
		double length1 = getLength();
		double length2 = o.getLength();
		if (length1 > length2)
			return 1;
		if (length1 < length2)
			return -1;
		return 0;
	}

}
