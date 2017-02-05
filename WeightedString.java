import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class WeightedString {
	  public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String s = "eeaacdd";
	       Set<String> hm=new TreeSet<String>();
	 
	     
	       int len=s.length();
	       int arr[]=new int[len];
	       int k=1;
	      String sb=new String();
	      int num=0;
	       for(int i=0,j=0;i<len-1;i++,j++)
	       {	
	    	   if(s.charAt(i)==s.charAt(i+1))
	    	   {
	    		 
	    			   num+=(s.charAt(i))-96;
	    			   arr[j]=num;	 
	    			   sb=sb.concat(String.valueOf(s.charAt(i)));
	    			   hm.add(sb);
	    			   
	    		   if(i==len-2){
	    			   sb=sb.concat(String.valueOf(s.charAt(i+1)));
	    			   num+=(s.charAt(i+1))-96;
	    		
	    			   arr[++j]=num;	
	    			   }
	    	   }
	    	   else{
	    		   
	    		   if(hm.contains(String.valueOf(s.charAt(i)))){
	    			   num+=(s.charAt(i))-96;
	    			   arr[j]=num;	 
	    			   sb=sb.concat(String.valueOf(s.charAt(i)));
	    			   hm.add(sb);
	    			   sb="";
	    			   num=0;
	    		   }
	    		   else
	    		   {	 num=(s.charAt(i))-96;
	    			   hm.add(String.valueOf(s.charAt(i)));
	    				arr[j]=num;	  
	    			   num=0;
	    		   }
	    		   if(i==len-2){
	    			   sb=sb.concat(String.valueOf(s.charAt(i+1)));
	    			   num+=(s.charAt(i+1))-96;
	    		
	    			   arr[++j]=num;	
	    			   }
	    	   }
	    	  
	    	
	    	 
	   
	       }
	 
	   
	for(int i=0;i<len;i++)
	{
		System.out.println(arr[i]);
	}
	        	
	        }
	        }

	
