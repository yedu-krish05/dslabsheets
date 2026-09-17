public class DeleteElement { 

    public static void main(String[] args) { 

        int[] arr = {15, 25, 35, 45, 55, 65, 75, 85, 95, 105}; 

        int size = arr.length; 

 

         

        size = deleteByPosition(arr, size, 2); 

        display(arr, size); 

 

        

        size = deleteByValue(arr, size, 55); 

        display(arr, size); 

    } 

 

    public static int deleteByPosition(int[] arr, int size, int pos) { 

        if (pos < 0 || pos >= size) return size; 

        for (int i = pos; i < size - 1; i++) { 

            arr[i] = arr[i + 1]; 

        } 

        return size - 1; 

    } 

 

    public static int deleteByValue(int[] arr, int size, int value) { 

        int pos = -1; 

        for (int i = 0; i < size; i++) { 

            if (arr[i] == value) { 

                pos = i; 

                break; 

            } 

        } 

        if (pos == -1) return size; 

        return deleteByPosition(arr, size, pos); 

    } 

 

    public static void display(int[] arr, int size) { 

        for (int i = 0; i < size; i++) { 

            System.out.print(arr[i] + " "); 

        } 

        System.out.println(); 

    } 

}