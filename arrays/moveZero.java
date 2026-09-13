import java.util.Scanner;
import java.util.Arrays;

public class moveZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int position = 0;

        // Move non-zero elements to the beginning
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[position] = arr[i];
                position++;
            }
        }

        // Fill the remaining positions with zeros
        while (position < n) {
            arr[position] = 0;
            position++;
        }

        System.out.println("Updated array: " + Arrays.toString(arr));

        sc.close();
    }
}