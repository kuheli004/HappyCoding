
public class ExcelTitle {
	
	public static String extitle(int n)
	{
		if(n<=0)
			return null;
		else
		{
			StringBuilder sbr=new StringBuilder(); 
			
			while(n>0)
			{
				int t=n%26;
				//System.out.println(t);
				char ch=(char) ('A'+(char)(t-1));
			//	System.out.println(ch);
				sbr.append(ch);
				n/=26;
			}
			sbr.reverse();
			
			return sbr.toString();
		}
		
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=extitle(28);
	System.out.println(str);

}
}
