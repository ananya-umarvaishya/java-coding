import java.util.Scanner;
public class sum_of_elelments {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int sum = 0;
        int []arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        sum = sum + arr[i];

        }
        System.out.print("Sum of element is "+ sum);

    }
    
}
