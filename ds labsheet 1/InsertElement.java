public class InsertElement { 

    public static void main(String[] args) { 

        int[] arr = new int[10];  

        int size = 5; 

         

        for (int i = 0; i < size; i++)
         arr[i] = (i + 2) * 10; 

 

        size = insertAtBeginning(arr, size, 10); 

        size = insertAtMiddle(arr, size, 21, 3);  

        size = insertAtEnd(arr, size, 70); 

 

        System.out.print("Array after insertions: "); 

        for (int i = 0; i < size; i++) { 

            System.out.print(arr[i] + " "); 

        } 

    } 

 

    public static int insertAtBeginning(int[] arr, int size, int element) { 

        for (int i = size; i > 0; i--) { 

            arr[i] = arr[i - 1]; 

        } 

        arr[0] = element; 

        return size + 1; 

    } 

 

    public static int insertAtMiddle(int[] arr, int size, int element, int position) { 

        for (int i = size; i > position; i--) { 

            arr[i] = arr[i - 1]; 

        } 

        arr[position] = element; 

        return size + 1; 

    } 

 

    public static int insertAtEnd(int[] arr, int size, int element) { 

        arr[size] = element; 

        return size + 1; 

    }
}