//print the pattern 
// a b c d
// a b c d
// a b c d
import java.util.Scanner;
public class ques5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int m = sc.nextInt();
        
        for(int i =  97; i <= 96 + n; i++){
            for(int j = 97; j <= 96+m; j++){
                System.out.print((char)j + " ");
            }
            System.out.println();
        }

        
    }
    
}
