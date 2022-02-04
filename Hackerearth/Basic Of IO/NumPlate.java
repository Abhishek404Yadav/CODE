import java.util.Scanner;
 
public class NumPlate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String plate = sc.next();
        // Format=01X345-78
        char x = plate.charAt(2);
        char[] arr = plate.toCharArray();
        if (x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U' || x == 'Y')
            System.out.println("invalid");
        else {
            if ((arr[0] + arr[1]) % 2 == 0 && (arr[3] + arr[4]) % 2 == 0 && (arr[4] + arr[5]) % 2 == 0
                    && (arr[7] + arr[8]) % 2 == 0)
                System.out.println("valid");
            else
                System.out.println("invalid");
        }
 
        sc.close();
    }
 
}