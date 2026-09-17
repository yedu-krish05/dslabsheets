import java.util.Scanner;

class ArraySearching {
    int[] array;
    int n;

    ArraySearching() {
        n = 0;
        array = new int[0];
    }

    ArraySearching(int n) {
        this.n = n;
        array = new int[n];
    }

    void readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
    }

    @Override
    public String toString() {
        String result = "Array elements: ";
        for (int i = 0; i < n; i++) {
            result += array[i] + " ";
        }
        return result;
    }
// linear search method--------------------------------------------------------------------------------------
    int linearSearch(int key) {
        int iterations = 0;
        for (int i = 0; i < n; i++) {
            iterations++;
            if (array[i] == key) {
                System.out.println("Linear Search Iterations: " + iterations);
                return i;
            }
        }
        System.out.println("Linear Search Iterations: " + iterations);
        return -1;
    }
// binary search method--------------------------------------------------------------------------------------
    int binarySearch(int key) {
        int low = 0;
        int high = n - 1;
        int iterations = 0;
        while (low <= high) {
            iterations++;
            int mid = (low + high) / 2;
            if (array[mid] == key) {
                System.out.println("Binary Search Iterations: " + iterations);
                return mid;
            } 
            else if (key < array[mid]) {
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }
        System.out.println("Binary Search Iterations: " + iterations);
        return -1;
    }
}

public class arraysearchings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        ArraySearching obj = new ArraySearching(n);
        obj.readArray();
        System.out.println(obj);

        System.out.print("\nEnter element to search using Linear Search: ");
        int key = sc.nextInt();
        int index = obj.linearSearch(key);
        if (index != -1)
            System.out.println("Element found at index: " + index);
        else
            System.out.println("Element not found.");

        System.out.println("\nFor Binary Search, array must be sorted.");
        System.out.print("Enter element to search using Binary Search: ");
        key = sc.nextInt();
        index = obj.binarySearch(key);
        if (index != -1)
            System.out.println("Element found at index: " + index);
        else
            System.out.println("Element not found.");
    }
}