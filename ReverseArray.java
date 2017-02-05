import java.util.Arrays;


public class ReverseArray {

	public static void main(String[] args) {
		String str="kuheli";
		char ch[]=str.toCharArray();
		int index=0;
		/*for(int i=0;i<arr.length/2;i++)
		{
			int temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}*/
		
		//System.out.print(Arrays.toString(ch));
		
		ReverseArr(ch,index);
	}

	private static void ReverseArr(char[] arr, int index) {
		if(index!=arr.length-1)
			ReverseArr(arr,index+1);
		System.out.print(arr[index]);
		
	}

		
	}


