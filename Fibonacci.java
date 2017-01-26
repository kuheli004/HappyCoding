
public class Fibonacci {

	public static void main(String[] args) {
		
		int n=15;
		for(int i=2;i<15;i++)
		System.out.print(fib(i)+" ");

	}

	private static int fib(int i) {
		if(i==0)
		return 0;
		else if(i==1)
			return 1;
		else
			return	fib(i-1)+fib(i-2);
	}
	

}
