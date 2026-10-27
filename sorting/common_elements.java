public class common_elements {
    public static void main(String args[]){
        //array is sorted
        int a[] = {1,2,3,4,5,8};
        int b[] = {2,3,4,8,9,10};
        int n = a.length;
        int m = b.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
               if(a[i] == b[j]){
                System.out.print(a[i] + " ");
               }
            }
        }
    }
    
}
