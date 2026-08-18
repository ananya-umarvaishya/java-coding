import java.util.Scanner;
public class ques7 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number of rows: ");

        int n = sc.nextInt();
         System.out.print("Enter the number of columns: ");
        int m = sc.nextInt();


    for(int i = 65; i <= 64 + n; i++){
        for(int j = 65; j <= 64 + m; j++){
            System.out.print((char)i + " ");

        }
        System.out.println();
      
    }

    }
    
}
