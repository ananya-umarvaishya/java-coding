public class TwoSum_Sorted {
    public static void main(String args[]) {

        int[] a = {0,2,3,4,7,8,10};
        int n = a.length;

        int i = 0;
        int j = n - 1;

        int key = 9;
        boolean isFound = false;

        while(i < j) {

            if(a[i] + a[j] == key) {
                isFound = true;
                break;
            }
            else if(a[i] + a[j] < key) {
                i++;
            }
            else {
                j--;
            }
        }

        if(isFound == true) {
            System.out.print("The indices are " + i + " and " + j);
        }
        else {
            System.out.print("No pair found");
        }
    }
}