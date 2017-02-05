import java.util.Scanner;


public class MatrixSqrPrac {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        String output;
	        int ip1_rows = 0;
	        int ip1_cols = 0;
	       // ip1_rows = Integer.parseInt(in.nextLine().trim());
	        //ip1_cols = Integer.parseInt(in.nextLine().trim());
	        
	        int[][] ip1 = {{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}};
	        output = largestsquarehouse(ip1);
	        System.out.println(String.valueOf(output));

	}

	private static String largestsquarehouse(int[][] ip1) {
		int[][] arr=new int[ip1.length][ip1[0].length];
		int max=Integer.MAX_VALUE;
		for(int i=0;i<ip1.length;i++)
		{
			arr[i][0]=ip1[i][0];
			if(arr[i][0]==0)
				max=1;
			
		}
		for(int j=0;j<ip1[0].length;j++){
			arr[0][j]=ip1[0][j];
			if(arr[0][j]==0)
				max=1;
		}
		
		
		for(int i=1;i<ip1.length;i++)
		{
			for(int j=1;j<ip1[i].length;j++)
			{
				if(ip1[i][j]==1)
					continue;
				int t=1+min(arr[i-1][j],arr[i-1][j-1],arr[i][j-1]);
				arr[i][j]=t;
				if(arr[i][j]>max)
					max=arr[i][j];
			}
		}
		max=max+1;
		String f_str=max+"$"+max;
		PrintMatrix(arr);
		
		return f_str;
	}


	private static void PrintMatrix(int[][] arr) {
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	}

	private static int min(int a, int b, int c) {
	int m=Math.min(a,b);
		return Math.min(m, c);
	}

}
