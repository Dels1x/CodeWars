import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class PhoneDir {

    public static String phone(String strng, String num) {
        String[] lines = strng.split("\n");
        long count = Arrays.stream(lines).filter(i -> i.contains(num)).count();
        if(count > 1) {
            return "Error => Too many people: num";
        } else if (count < 1) {
            return "Error => Not found: num";
        }

        StringBuilder output = new StringBuilder("Phone => ");

        for(String line: lines) {
            if(line.contains(num)) {
                output.append(num);
                output.append(",  Name => ");
                for(int character = 0; character < line.length()-1; character++) {

                }
            }
        }

        return output.toString();

    }

    public static void printMatches(String text, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        // Check all occurrences
        while (matcher.find()) {
            System.out.print("Start index: " + matcher.start());
            System.out.print(" End index: " + matcher.end());
            System.out.println(" Found: " + matcher.group());
        }
    }
}