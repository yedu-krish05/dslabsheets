import java.util.Scanner; 
public class ArrayTraversal { 

    public static void main(String[] args) { 

        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter number of elements (N): "); 

        int n = sc.nextInt(); 

        int[] arr = new int[n]; 

 

        System.out.println("Enter " + n + " elements:"); 

        for (int i = 0; i < n; i++) { 

            arr[i] = sc.nextInt(); 

        } 

 

        System.out.print("Array elements: "); 

        for (int i = 0; i < n; i++) { 

            System.out.print(arr[i] + " "); 

        } 

        System.out.println(); 

    } 

}