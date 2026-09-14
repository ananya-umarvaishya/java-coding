import java.util.Scanner;
public class RotatingArray2 {
    public static void main(String args[]){
        int [] a = {2,4,5,67,89,23,54};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of d: ");
        int d = sc.nextInt();
        int n = a.length;
        int []b = new int[d];
        int []c = new int[n - d];
        int []arr = new int[n]; 

        for(int i = 0; i < d; i++){
            b[i] = a[i];

        }
        for(int i = 0; i < n-d; i++){
            c[i] = a[d+i];
        }
        for(int i = 0; i < b.length; i++){
        System.out.print(b[i] + " ");
        }
        for(int i = 0; i < c.length; i++){
            System.out.print(c[i]+ " ");
        }


        //making our requires array
        for(int i = 0; i < )
    }
    
}
