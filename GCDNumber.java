
public class GCDNumber {

	public static void main(String[] args) {
		int a=20;
		int b=50;
		int c=gcd(a,b);
		System.out.print(c);

	}

	private static int  gcd(int a, int b) {
		if(a>b && b!=0)
			return gcd(b,a%b);
		else if(a<b)
			return gcd(b,a);
		else if(a>b && b==0)
			return a;
		return 0;
	}

}
