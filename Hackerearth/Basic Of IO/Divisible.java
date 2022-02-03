import java.io.*;
import java.util.*;
public class Divisible {
    public static void main(String[] args) throws IOException {
            Scanner sc= new Scanner(System.in);
            int n,evensum=0,no=0,oddsum=0;
            n=sc.nextInt();
            int[] arr = new int[n];
                for(int i=0; i<n; i++)
                { //this block run first half and provide us starting no and then last no 
                    arr[i] = sc.nextInt();
                        if(i<n/2)
                        {
                            no=arr[i]/10;// can extract first no
                        }
                        else
                        {
                            no=arr[i]%10; // can extract last no
                        }
                        //above two block helps in making the no variable so that it will be used to make sum
                    if(i%2==0)
                    {      //sum of even no 
                        evensum=evensum+no;
                    }
                    else
                    {     //sum of odd no
                        oddsum=oddsum+no;
                    }
 
                }
                if(((evensum-oddsum)%11==0))
                System.out.println("OUI");
                else
                System.out.println("NON");
                sc.close();
        
    }
}
