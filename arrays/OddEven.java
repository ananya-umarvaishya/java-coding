import java.util.Scanner;
public class OddEven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++){
             arr[i] = sc.nextInt();
           if( i % 2 == 0){// even index then we have to multiply by 10
           arr[i] = arr[i] * 10;
        }else{
            arr[i] =  arr[i] * 2;

        }
       
        

    }
     for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    
}
}