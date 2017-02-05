
public class RecPalindromeString {

	public static void main(String[] args) {
		String str="aba";
		String RevStr=Reverse(str);
		System.out.println(RevStr);
	}

	private static String Reverse(String str) {
		if(str==""||str==null)
			return str;
		return str.charAt(str.length()-1)+Reverse(str.substring(0,str.length()-1));
	}

}
