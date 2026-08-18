//print the pattern
//1 1 1 1 1 
//2 2 2 2 2
//3 3 3 3 3
//4 4 4 4 4

public class ques6 {
    public static void main(String args[]){
        int n = 4;
        int m = 5;
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                System.out.print(i);
            }
            System.out.println();
        }

    }
    
}
