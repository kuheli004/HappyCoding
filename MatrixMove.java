import java.util.Scanner;

public class MatrixMove {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		String f="yes";
		String input1[]=new String[input];
		String input2[]=new String[input];
		
		int len=input*input;
		int arr1[]=new int[len];
		int arr2[]=new int[len];

	    for(int i=0;i<input;i++)
	    {
	        input1[i]=sc.next();
	    }
	      for(int i=0;i<input;i++)
	    {
	        input2[i]=sc.next();
	    }
		
		int k=0;
		for(int i=0;i<input;i++)
		{
			String str=input1[i];
			//System.out.println("Str--"+str);
			String[] str1=str.split("#");
			for(String s:str1)
			{
				
				int num=Integer.parseInt(s);
				//System.out.println("num--"+num);
				if(k<len){
				arr1[k]=num;
				k++;
				}
				
				
			}
		}
		 
		k=0;	
		for(int i=0;i<input;i++)
		{
			String str=input2[i];
			String[] str1=str.split("#");
				for(String s:str1)
			{
				
				int num=Integer.parseInt(s);
				if(k<len){
				arr2[k]=num;
				k++;
				}
				
				
			}
		}
		if(arr1.length!=arr2.length)
		{
			f="invalid";
		}
		for(int i=0;i<len;i++)
		{
			int val=arr1[i];
			boolean flag=false;
			for(int j=0;j<len;j++){
				if(val==arr2[j])
				{
					flag=true;
				}
			}
			if(flag==false)
			{
				f="no";
				break;
			}
				
		}
		//return f;
		
	System.out.println(f);
	
	
	/*System.out.println("1st array");
	for(int i=0;i<len;i++)
	System.out.print(arr1[i]+" ");
	System.out.println("2nd array");
	for(int i=0;i<len;i++)
		System.out.print(arr2[i]+" ");*/
	
	}

}
