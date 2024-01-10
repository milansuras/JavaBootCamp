package LinearSearch;
import java.util.Scanner;

public class LinearExample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];  // Initialize the array

        System.out.println("Enter the elements in the array:");
        for(int i = 0; i < n; i++){
            System.out.print("Enter element at the index [" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target to search for:");
        int t = sc.nextInt();

        printArray(arr, n);
        int result = linearSearch(arr, n, t);

        if (result != -1) {
            System.out.println("Element " + t + " found at index " + result);
        } else {
            System.out.println("Element " + t + " not found in the array");
        }
    }

    public static void printArray(int[] arr, int n){
        System.out.print("Array elements: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int linearSearch(int[] arr, int n, int t){
        for (int i = 0; i < n; i++){
            if (arr[i] == t) {
                return i;  // Return the index if the element is found
            }
        }
        return -1;  // Return -1 if the element is not found
    }
}
