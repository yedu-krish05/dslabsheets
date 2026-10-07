public class BinarySearch{ 

    public static int binarySearch(int[] arr, int low, int high, int x) { 

        if (high >= low) { 

            int mid = low + (high - low) / 2; 

            if (arr[mid] == x) return mid; 
            if (arr[mid] > x) return binarySearch(arr, low, mid - 1, x); 
            return binarySearch(arr, mid + 1, high, x); 

        } 
        return -1; 
    } 

    public static void main(String[] args) { 

        int[] sortedArr = {10, 20, 30, 40, 50, 60, 70}; 
        int target = 40; 
        int index = binarySearch(sortedArr, 0, sortedArr.length - 1, target); 

        if (index != -1) { 
            System.out.println("Target " + target + " located at index " + index); 
        } else { 
            System.out.println("Target not found."); 
        } 
    } 
}