package problem03;

public class Triple<T1, T2, T3> {
	private T1 first;
	private T2 second;
	private T3 third;
	
	public void setFirst(T1 first) {
		this.first = first;
	}

	public void setSecond(T2 second) {
		this.second = second;
	}
	
	public void setThird(T3 third) {
		this.third = third;
	}
	
	public T1 getFirst ()
	{
		return first;
	}
	
	public T2 getSecond ()
	{
		return second;
	}
	
	public T3 getThird ()
	{
		return third;
	}
}
