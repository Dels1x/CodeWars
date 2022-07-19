import java.util.Arrays;
import java.util.stream.IntStream;

public class Kata
{
    public static char findMissingLetter(char[] array)
    {
        int[] numbers = new String(array).chars().sorted().toArray();
        System.out.println(Arrays.toString(numbers));
        int pos = IntStream.range(1, numbers.length)
                .filter(index -> (numbers[index] - numbers[index-1] != 1))
                .findFirst().getAsInt();
        return (char) (numbers[pos]-1);
    }
}
//