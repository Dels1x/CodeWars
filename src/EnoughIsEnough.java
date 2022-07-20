import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class EnoughIsEnough {

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        if(maxOccurrences < 1) return new int[0];
        List<Integer> list = Arrays.stream(elements).boxed().collect(Collectors.toList());
        int count;
        int index;

        for(int i = 0; i < list.size(); i++) {
            count = 0;
            index = list.size()-1;

            for(int j: list) {
                if(list.get(i) == j) count++;
            }

            while(count > maxOccurrences && index > 0) {
                if(Objects.equals(list.get(i), list.get(index))) {
                    list.remove(index);
                    count--;
                }
                index--;
            }
        }

        return list.stream().mapToInt(element -> element).toArray();
    }

}
