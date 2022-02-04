import java.util.*;
public class Add2No {
	public static void main(String[] args) {
	    try 
	    {
    	    int n,a,b;
    	    Scanner sc=new Scanner(System.in);
    	    n=sc.nextInt();
        	while(n>0)
        	  {
            	  a=sc.nextInt();
            	  b=sc.nextInt();
                  System.out.println(add(a,b));
            	  n--;
        	   }
               sc.close();
	    }
	    catch(Exception e) 
	    {
	        return;
	    }
	    
    }
          static int add(int a,int b){
            return (a+b);
    }
}