public class ques31 {
    public static void main(String args[]){
        int n = 5;

for (int i = 1; i <= n; i++) {

    // print -
    for (int j = 1; j < i; j++) {
        System.out.print("- ");
    }

    // print X
    for (int j = i; j <= n; j++) {
        System.out.print("X ");
    }

    System.out.println();
}
    }
    
}
