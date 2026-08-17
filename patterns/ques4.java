//print the pattern 
// A B C D
// A B C D
// A B C D   take user input
import java.util.Scanner;
public class ques4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of columns: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of rows: ");
        int m = sc.nextInt();

        for(int i = 65; i <= m + 64; i++ ){
            for(int j = 65; j <= n + 64; j++){
                System.out.print((char)j + " " );
            }
            System.out.println();
        }

    }
    
}
