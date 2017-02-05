import java.util.Scanner;


public class LargestSquaareMatrix {

	public static void main(String[] args) {
		   Scanner in = new Scanner(System.in);
	        String output;
	        int ip1_rows = 0;
	        int ip1_cols = 0;
	        ip1_rows = Integer.parseInt(in.nextLine().trim());
	        ip1_cols = Integer.parseInt(in.nextLine().trim());
	        
	        int[][] ip1 = new int[ip1_rows][ip1_cols];
	        for(int ip1_i=0; ip1_i<ip1_rows; ip1_i++) {
	            for(int ip1_j=0; ip1_j<ip1_cols; ip1_j++) {
	                ip1[ip1_i][ip1_j] = in.nextInt();
	                
	            }
	        }
	        output = largestsquarehouse(ip1);
	        System.out.println(String.valueOf(output));

	}

	private static String largestsquarehouse(int[][] input1) {
		 int rows=input1.length;
	        int cols=input1[0].length;
	        String matrix="";
	          int k=0;
	        int l=0;
	        for(int i=0;i<rows;i++)
	        {
	            for(int j=0;j<cols;j++)
	            {
	                if(input1[i][j]==0){

	                    while(input1[i+k][j]!=0 || input1[i][j+l]!=0 )
	                    {
	                        k++;
	                        l++;
	                    }
	                }
	            }
	        }
	        matrix=k+"$"+l;
	        return matrix;
		
	}

}
