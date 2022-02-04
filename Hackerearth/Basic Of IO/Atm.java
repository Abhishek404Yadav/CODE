import java.util.*;
 class ATM{
    public static void main(String[] args){
       try{
               float n,f;
            Scanner sc = new Scanner(System.in);
            n =sc.nextFloat();
            f =sc.nextFloat();
            if(n%5==0 && f>=n+0.5f)
            System.out.println(f-n-0.5f);
            
            else{
                System.out.println(f);
                }
            
        }
       catch(Exception e){
           return;
       }
    }  
}

