public class zeroAtLast {
    public static void main(String args[]){
        int []a = {1,0,2,0,3,0,4};
        int j = 0;
        int n = a.length;
        
        for(int i = 0; i < n; i++){
           if(a[i] != 0){
            
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            j++;
           }
           
        }
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
    
}
