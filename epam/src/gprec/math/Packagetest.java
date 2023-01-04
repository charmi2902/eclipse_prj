package gprec.math;
import java.util.Scanner;
public class Packagetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		Arith a=new Arith();
		System.out.println(a.sum(100,2));
		System.out.println(a.sub(100,2));
		System.out.println(a.mul(100,2));
		a.div(100,Integer.parseInt(args[0]));
	}

}
