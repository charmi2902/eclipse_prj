package gprec.math;

public class Arith 
{
	public int sub(int f,int s)
	{
		return f-s;
	}
	public int mul(int f,int s)
	{
		return f*s;
	}
	public void div(int f,int s)
	{
		int t;
		try {
		 t= f/s;
		 System.out.println(t);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public int sum(int f, int s) {
		// TODO Auto-generated method stub
		
		return f+s;
	}

}
