package problem01;

import java.util.ArrayList;

public class Vector {
	private ArrayList<Double> coordinates;

	public Vector(ArrayList<Double> coordinates) {
		this.coordinates = new ArrayList<Double>();
		this.coordinates.addAll(coordinates);
	}

	public Vector(Vector other) {
		this(other.coordinates);
	}

	public boolean setCoordinate(int pos, Double elem) {
		if (pos >= coordinates.size() || pos < 0)
			return false;
		coordinates.set(pos, elem);
		return true;
	}

	public Double getCoordinate(int pos) {
		if (pos >= coordinates.size() || pos < 0)
			return null;
		return coordinates.get(pos);
	}

	public int getDimension() {
		return coordinates.size();
	}

	public double getLength() {
		double sum = 0;
		for (int i = 0; i < coordinates.size(); i++) {
			sum += Math.pow(coordinates.get(i), 2);
		}
		return Math.sqrt(sum);
	}

	public void add(Vector vector) {
		if (coordinates.size() != vector.coordinates.size()) {
			System.out.println("The vectors are with different size.");
			return;
		}
		for (int i = 0; i < coordinates.size(); i++) {
			coordinates.set(i, coordinates.get(i) + vector.getCoordinate(i));
		}
	}

	public void add(Double by) {
		for (int i = 0; i < coordinates.size(); i++) {
			coordinates.set(i, coordinates.get(i) + by);
		}
	}

	public void substract(Vector vector) {
		if (coordinates.size() != vector.coordinates.size()) {
			System.out.println("The vectors are with different size.");
			return;
		}
		for (int i = 0; i < coordinates.size(); i++) {
			coordinates.set(i, coordinates.get(i) - vector.getCoordinate(i));
		}
	}

	public void subtract(float by) {
		for (int i = 0; i < coordinates.size(); i++) {
			coordinates.set(i, coordinates.get(i) - by);
		}
	}

	public void multiply(float by) {
		for (int i = 0; i < coordinates.size(); i++) {
			coordinates.set(i, coordinates.get(i) * by);
		}
	}

	public void divide(float by) {
		for (int i = 0; i < coordinates.size(); i++) {
			coordinates.set(i, coordinates.get(i) / by);
		}
	}
	
	public Double dotProduct(Vector vector)
	{
		if (coordinates.size() != vector.coordinates.size()) {
			System.out.println("The vectors are with different size.");
			return null;
		}
		Double product = 0.0;
		for (int i = 0; i < coordinates.size(); i++)
			product += coordinates.get(i) * vector.coordinates.get(i);
		return product;
	}

	@Override
	public String toString() {
		return coordinates.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((coordinates == null) ? 0 : coordinates.hashCode());
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
		Vector other = (Vector) obj;
		return coordinates.equals(other.coordinates);
	}

}
