
public class PowerSet {

	public static void main(String[] args) {
		char arr[]={'a','b','c'};
		int n=3;
		for(int i=0;i<(1<<n);i++){
			
			System.out.print("{");
			for(int j=0;j<n;j++)
			{
				if((i&(1<<j))>0){
					//System.out.print((i&(1<<j)));	
					System.out.print(arr[j]+" ");
				}
				}
				
			System.out.println("}");
		

	}
	}
}
