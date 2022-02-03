import java.util.Scanner;

public class Fib {
public static void main(String[] args) {
   Fib obj = new Fib(); //obj is created because fib is not static
   try (Scanner sc = new Scanner(System.in)) {
    int x = sc.nextInt();
    System.out.println("Fibonacci Series"); // loop for fibo series 
    for(int i=0;i<x;i++)
    System.out.print(obj.fib(i)+" ");
} 
}

 int fib(int n){
    if(n==0||n==1){
        return n;
    }
        return fib(n-2)+fib(n-1);
}
    
}
