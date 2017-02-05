
public class RecRevWord {

	public static void main(String[] args) {
		String str="my name is khan";
		String RevStr=RevRec(str);
		System.out.println(RevStr);
	}

	private static String RevRec(String str) {
		if(str.indexOf(" ")!=-1){
		str=str.substring(str.lastIndexOf(" ")+1)+" "+ RevRec(str.substring(0,str.lastIndexOf(" ")));
		}
		return str;
	}

}
