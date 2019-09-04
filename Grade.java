
public class Grade {

	private String name;
	private int mark;
	
	public Grade(String letter, int m)
	{
		name=letter;   mark=m;
	}
	public String toString()
	{
		return name+ "\t"+mark;
	}
}
