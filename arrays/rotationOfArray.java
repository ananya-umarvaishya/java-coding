public class rotationOfArray {

    public static void reverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while(i < j) {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;

            i++;
            j--;
        }
    }

    public static void main(String args[]) {

        int[] arr = {2, 5, 76, 32, 5, 8, 12};
        int d = 4;

        int[] a = {2, 5, 76, 32, 5};
        int[] b = {8, 12};

        reverse(a);
        reverse(b);

        int[] c = new int[a.length + b.length];

        for(int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }

        for(int i = 0; i < b.length; i++) {
            c[i + a.length] = b[i];
        }

        for(int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}