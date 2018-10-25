public class Dice 
{
	private int numRolls;
	//instance variables are things that you  must permanently keep track of
	//don't need a field for roll b/c computer just has to spit it out back to you
	
	public Dice()
	{
		numRolls = 0;
	}
	
	
	public void reset()
	{
		numRolls = 0;
	}
	public double getNumRolls()
	{
		return numRolls;
	}
	public int roll() //random() returns double value with positive sign
	{
		numRolls++;
		int roll = (int)(Math.random()*6)+1;
		return roll;
		//local variable -> should not be a field b/c computer is not permanently storing it 
	
	
	}
	
	
}
