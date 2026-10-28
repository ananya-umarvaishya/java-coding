import java.util.Scanner;
public class kth_smallest {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a[] = {2,3,4,6,-9,0};
        int n = a.length;
        int k = sc.nextInt(); 
        for(int i = 0; i< k; i++){
           int min = Integer.MAX_VALUE;
           int mindx = -1;
           
           for(int j = i; j < n; j++){
            if(a[j] < min){
                min = a[j];
                mindx = j;
            }
        }
            int temp = a[i];
            a[i] = a[mindx];
            a[mindx] = temp;
           }
         System.out.print(a[k-1]);
        }
        
    }
    

