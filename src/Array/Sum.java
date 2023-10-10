package Array;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:-");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the  elements in the array");
        for(int i=0; i<n; i++){
            System.out.print("Enter element @ index [" + i + "]" + " = ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Sum of elements in the array = " + sum(arr));

    }
    static int sum(int[] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }
}
