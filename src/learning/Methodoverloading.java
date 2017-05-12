package learning;

public class Methodoverloading {
	public static void main(String[] args) {
		methodclass mc=new methodclass();
		System.out.println(mc.maxnum(9.0, 11.3));
		
	}
}

class methodclass
{
	
	public int maxnum(int x,int y)
	{int maxnumval;
		if (x>y)
			maxnumval=x;
		else maxnumval=y;
		return maxnumval;
	}
	public double maxnum( double a,double b)
	{double maxnumval;
		if (a>b)
			maxnumval=a;
		else maxnumval=b;
		
		return maxnumval;
	}
	
	
	
}
