package pkgCasino;

import java.util.LinkedList;

public class Round {

	private LinkedList<Roll> rolls = new LinkedList<Roll>();


	public void rollDice()
	{
		Roll r = new Roll();
		rolls.add(r);
		
	}
		
	public boolean isComeOut()
	{
		return (rolls.size()==1 ? true : false);
	}
	
	public Roll ComeOutRoll()
	{
		return rolls.getFirst();
	}
	
	public byte ComeOutRollScore()
	{
		return ComeOutRoll().ScoreRoll();
		
		
	}
	
	public boolean isNatural()
	{
		return ComeOutRoll().isNatural();
	}
	
	public boolean isCraps()
	{
		return ComeOutRoll().isCraps();
	}
}
