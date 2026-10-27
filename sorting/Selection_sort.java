public class Selection_sort {
    public static void main(String args[]){
        
        int []a = {1,2,35,5,-53,65,35,-332,0};
        int n = a.length;



        for(int i = 0; i < n-1; i++){
            int min = Integer.MAX_VALUE;
        int mindex = -1;
            for(int j = i; j < n; j++){
                if(a[j] < min){
                    min = a[j];
                    mindex = j;
                }
            }
        
             int temp = a[i];
             a[i] = a[mindex];
             a[mindex] = temp;
            }
        
            for(int i = 0; i < n; i++){
                System.out.print(a[i] + " ");
            }
        
        }
    }
    
    

