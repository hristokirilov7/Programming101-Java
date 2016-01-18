package problem04;

import java.math.BigInteger;

public class Maths {
	public <N1 extends Number, N2 extends Number> double addition(N1 num1, N2 num2) {
		return num1.doubleValue() + num2.doubleValue();
	}

	public BigInteger addition(BigInteger num1, BigInteger num2) {
		return num1.add(num2);
	}
	
	
	public <N1 extends Number, N2 extends Number> double substraction(N1 num1, N2 num2) {
		return num1.doubleValue() - num2.doubleValue();
	}

	public BigInteger substraction(BigInteger num1, BigInteger num2) {
		return num1.subtract(num2);
	}
	
	public <N1 extends Number, N2 extends Number> double multiplication(N1 num1, N2 num2) {
		return num1.doubleValue() * num2.doubleValue();
	}

	public BigInteger multiplication(BigInteger num1, BigInteger num2) {
		return num1.multiply(num2);
	}
	
	public <N1 extends Number, N2 extends Number> double division(N1 num1, N2 num2) {
		return num1.doubleValue() / num2.doubleValue();
	}

	public BigInteger division(BigInteger num1, BigInteger num2) {
		return num1.divide(num2);
	}
	
	public <N1 extends Number, N2 extends Number> double pow(N1 num1, N2 num2) {
		boolean flag = false;
		double second = num2.doubleValue();
		if (num2.doubleValue() < 0)
		{
			flag = true;
			second *= -1;			
		}
		double sum = num1.doubleValue();
		for (int i = 2; i < second; i++)
			sum *= num1.doubleValue();
		if (flag)
			sum = 1 / second;
		return sum;
	}
	
	public <N extends Number> int fac (N num)
	{
		int mult = (int)num.doubleValue();
		for (int i = 2; i < num.doubleValue(); i++)
			mult *= i;
		return mult;
	}
}
