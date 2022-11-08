import java.util.*;

public class Shift {

    public static void main(String[] args) {
         // Creating Scanner variable
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter Size of the Array :");
         int n = sc.nextInt();
        //Initialising Array with User Input
         int array[] = new int[n];
         for (int i = 0; i < n; i++) {
             array[i] = sc.nextInt();
            }

         System.out.println("Enter position u want to shift :");
         int p = sc.nextInt();
         System.out.println("Enter 0 for left shift 1 for right shift");
         int d = sc.nextInt();
         sc.close();
         
         int[] shiftedArray = new int[n];
         switch (d) {
             case 0:
             shiftedArray =  Shift.shiftLeft(array, n, p);
             break;
             case 1:
             shiftedArray = Shift.shiftRight(array, n, p);
                 break;
         }
         //Printing the Result
        for (int i = 0; i < n; i++) {
            System.out.print( shiftedArray[i]+" ");
        }
    }

    public static int[] shiftLeft(int array[], int n, int p) {
        
        // creating and initialising temp array
        int temp[] = new int[p];
        for (int i = 0; i < p; i++) 
            temp[i] = array[i];

        // updating Array 
        for (int i = 0; i < n - p; i++) 
            array[i] = array[i + p];

        // Merging temp with Array
        int k=0;
        for (int i = n-p; i < n; i++) {
            array[i] = temp[k++];
        }
        return array;

    }

    public static int[] shiftRight(int array[], int n, int p) {
        
        int newArray[] = new int[n];
        // creating and initialising temp array
        int temp[] = new int[p];
        for (int i = 0; i < p; i++)
            temp[i] = array[n - p + i];

        // updating newArray
        for (int i = 0; i < n - p; i++)
            newArray[p + i] = array[i];

        // Merging temp with Array
        for (int i = 0; i < p; i++)
            newArray[i] = temp[i];
        return newArray;

    }
}
