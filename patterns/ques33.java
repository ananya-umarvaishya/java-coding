public class ques33 {
    public static void main(String args[]){
        int a = 0;
        int n = 4;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= (n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i+a; j++){
                System.out.print(j + " ");
                
            }
            a++;
            System.out.println();
        }
    }
    
}
