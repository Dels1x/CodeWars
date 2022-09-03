import java.util.Arrays;

public class Max {
    public static int sequence(int[] arr) {
        int sum = 0;
        int[] sums = new int[arr.length];
        int current = 0;

        for(int i = 0; i < arr.length; i++) {
            if(sum + arr[i] > 0) {
                sum += arr[i];
                sums[i] = sum;
            }
            else {
                sum = 0;
            }
        }

        return Arrays.stream(sums).max().orElse(0);
    }
}