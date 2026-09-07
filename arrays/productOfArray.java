import java.util.Scanner;
public class productOfArray {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no of elements of array:");
    int n = sc.nextInt();
    int mul = 1;
    int []arr = new int[n];
    System.out.print("Enter the elements:");
    
    for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
         mul = mul*arr[i];
    }
    System.out.print(mul);
    }
    
}
