import java.util.Scanner;

public class insertInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Initial elements of array:");
        printArray(arr);

        // Inserting at beginning
        arr = insertBeginning(arr, 5);
        System.out.println("After inserting at beginning:");
        printArray(arr);

        // Inserting at ending
        arr = insertEnding(arr, 10);
        System.out.println("After inserting at ending:");
        printArray(arr);

        // Inserting at specific position
        arr = insertAtPos(arr, 8, 2);
        System.out.println("After inserting at specific position:");
        printArray(arr);

        sc.close();
    }

    public static int[] insertBeginning(int[] arr, int k) {
        int[] newArr = new int[arr.length + 1];
        newArr[0] = k;
        for (int i = 0; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        return newArr;
    }

    public static int[] insertEnding(int[] arr, int k) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = k; // Correctly insert at the last position
        return newArr;
    }

    public static int[] insertAtPos(int[] arr, int k, int pos) {
        if (pos < 0 || pos > arr.length) {
            System.out.println("Invalid position");
            return arr;
        }

        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        newArr[pos] = k;
        for (int i = pos; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        return newArr;
    }

    public static void printArray(int[] arr) {
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
