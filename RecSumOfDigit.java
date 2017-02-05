
public class RecSumOfDigit {

	public static void main(String[] args) {
	int a=123456;
	int sod=SumofDig(a);
	System.out.print(sod);
	}

	private static int SumofDig(int a) {
		if(a==0)
			return 0;
		else
		{
			
			return (a%10)+SumofDig(a/10);
		}
	}

}
