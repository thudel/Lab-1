package pkgCasino;

public class Roll {

	private Die die1;
	private Die die2;
	
	public Roll()					//Sets two instances of dice
	{
		die1 = new Die();
		die2 = new Die();
	}
	
	public byte ScoreRoll()			//Gets the value of the 2 dice
	{
		return (byte) (die1.getDieValue() + die2.getDieValue());
	}

	public boolean isNatural()		//Checks to see if roll is 7 OR 11
	{
		return isSeven() || isEleven();
	}
	
	public boolean isSeven()		//Checks to see if roll is 7
	{
		return (ScoreRoll()==7) ? true: false;
/*	^Same thing as below	
 * if (ScoreRoll() == 7)
		{
			return true;
		}
		else
		{
			return false;
		}
*/	}
	public boolean isEleven()		//Checks to see if roll is 11
	{
		return (ScoreRoll()==11) ? true: false;
	}
	
	public boolean isCraps()		//Checks for Craps
	{
		return isTwo() || isThree() || isTwelve();
	}
	
	public boolean isTwo()
	{
		return (ScoreRoll()==2) ? true : false;
	}
	
	public boolean isThree()
	{
		return (ScoreRoll()==3) ? true : false;
	}
	
	public boolean isTwelve()
	{
		return (ScoreRoll()==3) ? true : false;
	}
	
	public boolean isRoundOver() 
	{
		return (isNatural() || isCraps());
	}
	
	public boolean isPoint()
	{
		return (ScoreRoll()==4 || ScoreRoll()==5 || ScoreRoll()==6 || ScoreRoll()==8 || ScoreRoll()==9 || ScoreRoll()==10);
	}
}
