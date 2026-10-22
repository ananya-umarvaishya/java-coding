public class CheckingSortedArray{
public static void  main(String []args){
    int a[] = {1,1,2,3,9,5};
    boolean sorted = true;
    for(int i = 0; i < a.length-1; i++){
        if(a[i] <= a[i+1]){
           sorted = true;
        }
    }
  if (sorted){
    System.out.print("the array is sorted");
  }else{
    System.out.print("the array is not sorted");
  }

}
}