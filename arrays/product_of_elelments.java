import java.util.Scanner;
public class product_of_elelments {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int multi = 1;
        int []arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        multi = multi * arr[i];

        }
        System.out.print("Sum of element is "+ multi);

    }
    
}
