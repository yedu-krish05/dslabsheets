public class LinearSearch { 

    public static void main(String[] args) { 

        int[] arr = {15, 23, 7, 42, 11}; 

        int target = 42; 

        int index = -1; 

 

        for (int i = 0; i < arr.length; i++) { 

            if (arr[i] == target) { 

                index = i; 

                break; 

            } 

        } 

 

        if (index != -1) { 

            System.out.println("Element " + target + " found at index: " + index); 

        } else { 

            System.out.println("Element not found."); 

        } 

    } 

} 