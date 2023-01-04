package pack1;

public class Sameclass 
{
	int d;
	private int p;
	protected int pro;
	public int pub;
	public Sameclass()
	{
		System.out.println("same Default: "+d);
		System.out.println("same Private: "+p);
		System.out.println("same Protected: "+pro);
		System.out.println("same Public: "+pub);
	}
}
class Subclass extends Sameclass
{
	Subclass()
	{
		System.out.println("sub Default: "+d);
		//System.out.println("Private: "+p);
		System.out.println("sub Protected: "+pro);
		System.out.println("sub Public: "+pub);
	}
}
