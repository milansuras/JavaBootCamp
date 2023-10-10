package Array;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Taking input in an array");
        System.out.println("Enter the size of the array:-");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter element at the index" + " [ " + i + " ] " + " = "  );
            arr[i]=sc.nextInt();
        }
        printArray(arr,n);
    }

    static void printArray(int[] arr, int n){
        System.out.println("Array elements:");
        for(int i=0; i<n; i++){
            System.out.println("Element at index " + i + " = " + arr[i]);
        }
    }
}
