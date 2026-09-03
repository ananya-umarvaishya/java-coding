import java.util.Scanner;
public class max_of_3{
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(Math.max(a,b) == a && Math.max(a,c) == a){
            System.out.print(a);
        }else if (Math.max(b,c) == b && Math.max(b,a)== b){
            System.out.print(b);
        }else{
            System.out.print(c);
        }


    }
}