import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class PhoneDir {

    public static String phone(String strng, String num) {
        String[] lines = strng.split("\n");
        long count = Arrays.stream(lines).filter(i -> i.contains(num)).count();
        if(count > 1) {
            return "Error => Too many people: "+num;
        } else if (count < 1) {
            return "Error => Not found: "+num;
        }

        StringBuilder output = new StringBuilder("Phone => ");

        for(String line: lines) {
            if(line.contains(num)) {
                System.out.println(line);

                output.append(num).append(", Name => ");

                line = line.replace(num, "");

                String address =  findName(line, "<+[^\\<>]+>");

                output.append(address).append(", Address => ");

                line = line.replace("<"+address+">", "").replaceAll("[#@$%:^&*!?+/;,]", "").replaceAll("\\s+", " ").replace("_", " ");

                output.append(line.trim());

                break;

            }
        }

        return output.toString();

    }

    public static String findName(String text, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        String output = "";
        int start = 0;
        int end = 0;

        while (matcher.find()) {
            start = matcher.start();
            end = matcher.end();
        }

        System.out.println(start);
        System.out.println(end);

        return text.substring(start + 1, end - 1);
    }
}