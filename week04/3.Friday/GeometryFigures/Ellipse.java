package GeometryFigures;

public final class Ellipse implements Shape{
	private double minor;
	private double major;

	public Ellipse(double minor, double major) {
		if (minor == 0 || major == 0) {
			System.out.println("Points are on the origin.");
		} else {
			this.minor = minor;
			this.major = major;
		}
	}

	public Ellipse(Ellipse other) {
		minor = other.minor;
		major = other.major;
	}

	public Point getUpperLeft() {
		double x = Math.abs(major) * -1;
		double y = Math.abs(minor);
		return new Point(x, y);
	}

	public Point getUpperRight() {
		double x = Math.abs(major);
		double y = Math.abs(minor);
		return new Point(x, y);
	}

	public Point getLowerLeft() {
		double x = Math.abs(major) * -1;
		double y = Math.abs(minor) * -1;
		return new Point(x, y);
	}

	public Point getLowerRight() {
		double x = Math.abs(major);
		double y = Math.abs(minor) * -1;
		return new Point(x, y);
	}

	public Point getCenter() {
		return Point.origin();
	}

	public double getPerimeter() {
		return 2 * Math.PI * Math.sqrt((minor * minor + major * major) / 2);
	}

	public double getArea() {
		return Math.PI * minor * major;
	}

	@Override
	public String toString() {
		return "Ellipse [(0,0), (" + minor + ", " + major + ")]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Double) minor).hashCode();
		result = prime * result + ((Double) major).hashCode();
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
		Ellipse other = (Ellipse) obj;
		if (minor == other.minor || major == other.major)
			return false;
		return true;
	}

}
