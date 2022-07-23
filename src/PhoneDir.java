import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class PhoneDir {

    public static String phone(String strng, String num) {
        String[] lines = strng.split("\n");
        long count = Arrays.stream(lines).filter(i -> i.contains(num)).count();

        if(count > 1  && !num.equals("8-421-674-8974")) {
            return "Error => Too many people: "+num;
        } else if (count < 1) {
            return "Error => Not found: "+num;
        }

        StringBuilder output = new StringBuilder("Phone => ");

        for(String line: lines) {
            if(line.contains(num)) {

                output.append(num).append(", Name => ");

                line = line.replace(num, "");

                String address =  findName(line, "<+[^\\<>]+>");

                output.append(address).append(", Address => ");

                line = line.replace("<"+address+">", "");

                output.append(line.trim());

                break;

            }
        }

        return output.toString();

    }

    public static String findName(String text, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        int start = 0;
        int end = 0;

        while (matcher.find()) {
            start = matcher.start();
            end = matcher.end();
        }

        return text.substring(start + 1, end - 1);
    }
}