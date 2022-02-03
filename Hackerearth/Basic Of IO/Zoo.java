import java.util.*;
public class Zoo{
    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
        char []Arr=name.toCharArray();
        for(int i=0;i<Arr.length;i++){
            
            if('z'==Arr[i])
            count++;
           
            else
            //count2++;
            break;
        }
        //z=2o
        if(2*count==name.substring(count).length())
        System.out.println("Yes");
        else
        System.out.println("No");
        sc.close();
    }
}
