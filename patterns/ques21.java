import java.util.Scanner;
public class ques21 {
    public static void main(String args[]){
        System.out.print("enter the numebr:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int num = 1;

        for(int i = 1; i <= a; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

    }
    
}
