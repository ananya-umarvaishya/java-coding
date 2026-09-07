public class ReversingAnArray {
    public static void main (String args[]){
      int a[] = {1,2,3,4,5,8};
      int n = a.length;
      int i =0, j = n-1;
      while( i < j){
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        i ++;
        j--;
      }
      for(int k = 0; k < n; k++){
      System.out.print(a[k] + " ");
    }
}
}
