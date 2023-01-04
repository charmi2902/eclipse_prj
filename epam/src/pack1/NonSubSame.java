package pack1;

public class NonSubSame 
{
	NonSubSame()
	{
		Sameclass s=new Sameclass();
	System.out.println("nss Default: "+s.d);
	//System.out.println("nss Private: "+s.p);
	System.out.println("nss Protected: "+s.pro);
	System.out.println("nss Public: "+s.pub);
	}
}

