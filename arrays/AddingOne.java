
    import java.util.Arrays;

public class AddingOne {
    public static int[] addOne(int[] arr) {

        // Start adding 1 from the last digit
        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            }

            // 9 + 1 becomes 0, and carry goes to the next digit
            arr[i] = 0;
        }

        // This happens when all digits are 9
        int[] result = new int[arr.length + 1];
        result[0] = 1;

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 9};

        int[] answer = addOne(arr);

        System.out.println(Arrays.toString(answer));
    }
}
    

