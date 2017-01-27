
public class ExcelNum {
	
	public static int exnum(String s){
	
		if(s.length()==0||s==null)
			return 0;
		else{
			int n=s.length()-1;
			int result=0;
			int t=0;
			while(n>=0){
				char ch=s.charAt(t);
				result=result+(int)Math.pow(26, n)*(ch-'A'+1);
				//System.out.println(result);
				n--;
				t++;
			}
		return result;
			}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=exnum("AAA");
	System.out.println(a);

	}

}
