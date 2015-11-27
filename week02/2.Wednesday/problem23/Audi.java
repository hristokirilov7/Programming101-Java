package problem23;

public class Audi extends Car {
	private int mileage;
	public Audi (int mileage)
	{
		this.mileage = mileage;		
	}
	public int getMileage ()
	{
		return mileage;
	}
	public boolean isEcoFriendly(boolean testing)
	{
		return true;
	}
}
