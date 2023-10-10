package Array;
import java.util.Arrays;
import java.util.Scanner;
public class MaxiMin {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n=sc.nextInt();
        System.out.println("Enter the elements in the array:-");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter element @ index [" + i + "]" + " = ");
            arr[i]=sc.nextInt();
        }

        printArray(arr);
        System.out.println("Maximum element in the array = " + Maximum(arr));
        System.out.println("Minimum element in the array = " + minimum(arr));
    }

    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }

    static int Maximum(int[] arr){
        int maxi=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>maxi){
                maxi=arr[i];
            }
        }
        return maxi;
    }
    static int minimum(int[] arr){
        int min=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
