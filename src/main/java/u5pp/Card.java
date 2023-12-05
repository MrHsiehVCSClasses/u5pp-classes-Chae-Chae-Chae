package u5pp;
// set up the instance variables for an object
public class Card 
{
	private String value;
	private String suit;
	// constructor to set standard values
	public Card()
	{
		this.value = "2";
		this.suit = "clubs";
	}
	// constructor for a custom suit value but standard value
	public Card(String suit)
	{
		this.value = "2";
		this.suit = suit;
	}
	// fully custom cunstructor for custom values
	public Card(String suit, String value)
	{
		this.value = value;
		this.suit = suit;
	}
	// get value to return the variables stored in the objects
	public String getValue()
	{
		return this.value;
	}
	public String getSuit()
	{
		return this.suit;
	}
	// toString so that the object itself can be 
	//described in a string
	public String toString()
	{
		return "The " + value + " of " + suit;
	}
	//equals method usable to compare two different card objects
	// compares the variables of the objects
	public boolean equals(Card c)
	{
		if (this.suit == c.suit & this.value == c.value)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	// mutator methods that allow you to change the values of the object
	// changeValue has parameters to which the value that the variables are being changed to have too fit to avoid errors
	public void changeValue(String value)
	{
		if (value.equalsIgnoreCase("2") || value.equalsIgnoreCase("3") || value.equalsIgnoreCase("4") || value.equalsIgnoreCase("5") || value.equalsIgnoreCase("6") || value.equalsIgnoreCase("7") || value.equalsIgnoreCase("8") || value.equalsIgnoreCase("9") || value.equalsIgnoreCase("10") || value.equalsIgnoreCase("jack") || value.equalsIgnoreCase("queen") || value.equalsIgnoreCase("king") || value.equalsIgnoreCase("ace"))
		{
			this.value = value.toLowerCase();
		}
	}
	// changeSuit mutator has parameters to ensure the suit that a card is to be changed to is possible and won't create an error
	public void changeSuit(String suit)
	{
		if (suit.equalsIgnoreCase("clubs") || suit.equalsIgnoreCase("hearts") || suit.equalsIgnoreCase("diamonds") || suit.equalsIgnoreCase("spades"))
		{
			this.suit = suit.toLowerCase();
		}
	}
}
