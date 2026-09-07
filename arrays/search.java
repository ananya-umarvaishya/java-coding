import java.util.Scanner;
public class search {
    public static void main(String args[]){
        System.out.print("ENter the number of elements in your array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter the elements of the array: ");
        int arr[] = new int[n];
        boolean found = false;
        for(int i = 0; i < n; i++){
           arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number you want to search:");
        int a = sc.nextInt();
        for(int i = 0; i < n; i++){
            if(arr[i] == a){
                System.out.println("your number is at the index "+ i);
                found = true;
            }
        }if(!found)
                System.out.print("Your number is not in the given array.");
            }
        }
    

