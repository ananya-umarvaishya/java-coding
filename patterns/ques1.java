//print the pattern by taking rows and columns from user
//******
//******
import java.util.Scanner;
public class ques1{
    public static void main(String args[]){
      Scanner sc = new Scanner (System.in);
      System.out.print("enter the number of rows:");
      int n = sc.nextInt();
      System.out.print("enter the number of rows:");
      int m = sc.nextInt();

      for(int i = 1; i <= n; i++){
        for(int j = 1; j <=m; j++){
            System.out.print("*");
        }
        System.out.println();
      }

    }

    }
