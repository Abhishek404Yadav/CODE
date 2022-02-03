import java.util.Scanner;
 
public class SplitHouse {
    public static void main(String args[] ) {
     Scanner sc = new Scanner(System.in);
     int flag=0;
     int n=sc.nextInt();
     String grid=sc.next();
     char[]arr=grid.toCharArray();
    
    for(int j=1;j<n;j++)
    {
        if(arr[j-1]=='H'&&arr[j]=='H')
        {
            flag++;
            break;
        }
    }
    if(flag==1)
    {
        System.out.println("NO");
    }
    else
    {
        System.out.println("YES");
        for(int i=0;i<n;i++)
        {
            if(arr[i]=='.')
            {
                arr[i]='B';
            }
            System.out.print(arr[i]);
        }
    }
        sc.close();
    }
 
}