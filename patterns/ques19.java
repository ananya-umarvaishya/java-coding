//print star plus n is odd
import java.util.Scanner;
public class ques19 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows and columns:");
        int n = sc.nextInt();
        
        int a = (n/2) + 1;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <=n; j++){
                if( i == a || j == a){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }



    }
    
}
