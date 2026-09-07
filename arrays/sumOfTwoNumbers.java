import java.util.Scanner;
public class sumOfTwoNumbers{
public static void main(String args[]){

    System.out.print("Enter the number of elements:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int []arr = new int[n];

    for(int i = 0; i < n; i++){
      arr[i] = sc.nextInt();
    }

    System.out.print("Enter the number:");
    int target = sc.nextInt();

      for(int i = 0; i < n; i++){
      for(int j = i+1; j < n; j++){
        if(arr[i] + arr[j] == target){
            System.out.println("your number is found at the index " + i + "and " + j);
        }
      }
    }
    }
}