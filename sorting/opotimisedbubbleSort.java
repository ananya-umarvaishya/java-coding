public class opotimisedbubbleSort {
    public static void main(String args[]){
    int []a = {23,53,6645,7,535,3,6,42,-2};
    int n = a.length;
        for(int i = 0; i < n-1; i++){
            boolean isSorted = true;
            for(int j = 0; j < n-1; j++){
                if(a[j] > a[j+1]){
                    isSorted = false;
                    break;
                }
            }
            if(isSorted == true) break;
            for(int j = 0; j < n-1; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] =  a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
    
}
