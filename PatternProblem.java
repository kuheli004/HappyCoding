
public class PatternProblem {

	public static void main(String[] args) {
		
		int k=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=(2*i)-2;j++){
				System.out.print(" ");
			}
		
		for(int j=5;j>=i;j--){
				System.out.print(k+" ");
			}
			k--;
			System.out.println();
		}
		
	}

}
