import java.util.Scanner;

public class missingNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int expectedSum = (n + 1) * (n + 2) / 2;
        int actualSum = 0;

        System.out.println("Enter the array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            actualSum += arr[i];
        }

        int missingNumber = expectedSum - actualSum;
        System.out.println("Missing number: " + missingNumber);

        sc.close();
    }
}