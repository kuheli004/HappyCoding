import java.util.Scanner;

public class Test12 {
	final static char ch[]={'N','E','S','W'};

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int p=0;
		while(1==1){
		String dir=sc.next();
		int dis=sc.nextInt();
		p=direction(dir,p+dis);
		System.out.println("p---"+p);
		System.out.println(ch[p]);
		}

	}

	private static int direction(String dir, int dis) {
	
	int pos=0;
	if(dir.equalsIgnoreCase("C"))
	{
	
		if(dis>4){
			dis=(dis%4);
			pos=pos+dis;
		}
		else if(dis<4)
		{
			pos=pos+dis;
		}
		else 
			pos=0;
		return pos;
			
	}
	else if(dir.equalsIgnoreCase("AC"))
		{
		System.out.println("dis---"+dis);
			if(dis>4){
				dis=dis%4-1;
				pos=pos+ch.length-dis;
			}
			else if(dis<4)
			{
				pos=ch.length-dis;
			}
			else 
				pos=0;
			return pos;
		}
	return 0;
		
	}

}
