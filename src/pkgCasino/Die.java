package pkgCasino;

public class Die {

			
	private byte DieValue;
	
	public Die()
	{
		this.DieValue = (byte)(Math.random() * 6 + 1);
	}
	
	public byte getDieValue() 
	{
		return DieValue;
	}
}
