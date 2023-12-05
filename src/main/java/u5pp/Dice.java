package u5pp;

class Dice
{
	// store the variables needed for the class as private
	private int numSides;
	private int startingSide;
	private String color;
	// First constructor to create the "standard" dice
	public Dice()
	{
		this.numSides = 6;
		this.startingSide = 1;
		this.color = "green";
	}
	// Second constructor to create a standard die with a diiferent num of sides
	public Dice(int numSides)
	{
		this.numSides = numSides;
		this.startingSide = 1;
		this.color = "green";
	}
	// Third constructor to create a customizable die for the num of side and starting side
	// Create logic so that the dice can't have impossible values, starting side is a num higher than
	// num sides
	public Dice(int numSides, int startingSide)
	{
		this.numSides = numSides;
		if (startingSide <= numSides)
		{
			this.startingSide = startingSide;
		}
		else
		{
			this.startingSide = 1;
		}
		this.color = "green";
	}
	// Constructor for fully customized dice
	public Dice(int numSides, int startingSide, String color)
	{
		this.numSides = numSides;
		if (startingSide <= numSides)
		{
			this.startingSide = startingSide;
		}
		else
		{
			this.startingSide = 1;
		}
		this.color = color;
	}
	// create simple getter methods to return the variables
	public int getSides()
	{
		return this.numSides;
	}
	public int getCurrentSide()
	{
		return this.startingSide;
	}
	public String getColor()
	{
		return this.color;
	}
	// Tostring to make it so the dice can be "written out"/ described
	public String toString()
	{
		return "The " + color + " " + numSides + "-sided dice is showing " + startingSide;
	}
	// equals method to compare different dice objects on their current side
	public boolean equals(Dice d)
	{
		if (d.getCurrentSide() == this.getCurrentSide())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	// method to randomize the current side that the dice is on
	public int roll()
	{
		this.startingSide = (int) (Math.random() * this.numSides) + 1;
		return startingSide;
	}
	// mutator methods to change the induvidual variables for the dice
	public void changeSide(int num)
	{
		if (num >= 1 & num <= this.numSides)
		{
			this.startingSide = num;
		}
	}
	public void changeColor(String color)
	{
		this.color = color;
	}
	public void changeNumSides(int num)
	{
		this.numSides = num;
	}
}