public class bubbleSort {
    public static void main(String []args){
        int  []a = {3,1,4,2,0,5};
        int n = a.length;
        for(int j = 0; j < n-1; j++){
        for(int i = 0; i < n - 1-j; i++){
          if(a[i] > a[i + 1]){
            int temp = a[i];
            a[i] = a[i + 1];
            a[i + 1] = temp;
          }
        }
    }
    for(int j = 0; j < n; j++){
        System.out.print(a[j] + " ");
    }
        
    }
}
    

