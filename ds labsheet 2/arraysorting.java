import java.util.Scanner;

class arraySorting {
    int[] array;
    int n;

    arraySorting() {
        n = 0;
        array = new int[0];
    }

    arraySorting(int n) {
        this.n = n;
        array = new int[n];
    }

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += array[i] + " ";
        }
        return result;
    }

    int bubbleSort() {
        int passes = 0;
        for (int i = 0; i < n - 1; i++) {
            passes++;
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
        return passes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        arraySorting obj = new arraySorting(n);
        obj.read();
        System.out.println("Before Sorting: " + obj);
        
        int passes = obj.bubbleSort();
        
        System.out.println("After Sorting: " + obj);
        System.out.println("Number of passes: " + passes);
    }
}