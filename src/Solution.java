public class Solution{
    public static String whatCentury(int year) {
        int century = (year + 99) / 100;

        return String.valueOf(century).charAt(0) == '1' ?
                String.format("%dth", century) :
                switch (String.valueOf(century).charAt(1)) {
                    case '1' -> String.format("%dst", century);
                    case '2' -> String.format("%dnd", century);
                    case '3' -> String.format("%drd", century);
                    default -> String.format("%dth", century);
        };
    }
}