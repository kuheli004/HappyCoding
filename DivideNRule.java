
public class DivideNRule {

	public static void main(String[] args) {
	int input1[]={1, 2, 3, 4, 5};
	int sum=0;
	int n=input1.length;
	//System.out.print(n);
	
	DivideArray(input1,n);
	
	}
	private static void DivideArray(int[] input1, int n) {
			int sum=0;
			for(int i=0;i<n;i++)
			sum=sum+input1[i];
			//System.out.print("Sum--"+sum);
			
			int sum_so_far=0;
			for(int i=0;i<n;i++){
				//System.out.println((2*sum_so_far)+input1[i]);
			if(((2*sum_so_far)+input1[i])==sum)
			{
				/*System.out.print("The array can be divided into"+
                    "two subarrays with equal sum\nThe"+
                    " two subarrays are :");*/
				 printSubArray(input1, 0, i - 1);
					System.out.println();
		            printSubArray(input1, i + 1, n - 1);
		 
				
			}
			sum_so_far+=input1[i];
		
	}

}
	private static void printSubArray(int[] input1, int i, int j) {
	for(int k=i;k<=j;k++)
		System.out.print(input1[k]+" ");
	}
}
