public class BinarySearch{ 

    public static int binarySearch(int[] arr, int left, int right, int x) { 

        if (right >= left) { 

            int mid = left + (right - left) / 2; 

 

            if (arr[mid] == x) return mid; 

            if (arr[mid] > x) return binarySearch(arr, left, mid - 1, x); 

            return binarySearch(arr, mid + 1, right, x); 

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