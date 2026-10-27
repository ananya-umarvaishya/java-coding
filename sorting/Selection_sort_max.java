public class Selection_sort_max {
    public static void main(String args[]){
        
        int []a = {1,2,35,5,-53,65,35,-332,0};
        int n = a.length;



        for(int i = 0; i < n-1; i++){
            int max = Integer.MIN_VALUE;
        int maxdex = -1;
            for(int j = i; j < n; j++){
                if(a[j] > max){
                    max = a[j];
                    maxdex = j;
                }
            }
        
             int temp = a[i];
             a[i] = a[maxdex];
             a[maxdex] = temp;
            }
        
            for(int i = 0; i < n; i++){
                System.out.print(a[i] + " ");
            }
        
        }
    }
    
    


