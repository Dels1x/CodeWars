import java.util.ArrayList;
import java.util.List;

public class WhichAreIn {

    public static String[] inArray(String[] array1, String[] array2) {
       List<String> output = new ArrayList<>(array1.length);

       for(String i: array1) {
           for(String j: array2) {
               if(j.contains(i)) {
                   output.add(i);
                   break;
               }
           }
       }

       return output.stream().distinct().sorted().toArray(String[]::new);

    }
}
