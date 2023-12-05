package u5pp;

public class MyMath 
{
	// the logic to find abs, return the param back if not negative since its abs value
	static public int abs(int x)
	{
		if (x < 1) 
		{
			return x * -1;
		}
		else
		{
			return x;
		}
	}
	// same as the int version, return if positive etc.
	static public double abs(double x)
	{
		if (x < 1 && x != 0)
		{
			return x *-1;
		}
		else
		{
			return x;
		}
	}
	// uses a for loop to multiply the base by itself exp times since that is all a power and exponent does
	// store the base in a variable within the method to simplify any complications
	static public double pow(double base, int exp)
	{
		double bas = base;
		double ret = base;
		for (int x = 1; x < exp; x++)
		{
			bas = bas * ret;
		}
		if (exp == 0)
		{
			return 1.0;
		}
		else
		{
			return bas;
		}
	}
	// for the perfect square root method, utilize a for loop to go through all the possible whole numbers that could multiply
	// into the num to find sqrt
	static public int perfectSqrt(int x)
	{
		int nub = x;
		for (int num = 0; num <= nub; num++)
		{
			if (num * num == nub)
			{
				return num;
			}
		}
		return -1;
	}
}
