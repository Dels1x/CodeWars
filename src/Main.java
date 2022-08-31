public class Main {
    public static void main(String[] args) {

        System.out.println(LongestConsec.longestConsec(new String[] {"tree", "foling", "trashy", "blue", "abcdef", "uvwxyz"}, 2));

    }
}

class LongestConsec {

    public static String longestConsec(String[] strarr, int k) {
        if(strarr.length == 0 || k > strarr.length || k < 0) {
            return "";
        }

        int bestLength = 0;
        String bestString = "";
        String currentString;

        for(int i = 0; i < strarr.length - k + 1; i++) {
            currentString = "";
            for(int j = 0; j < k; j++) {
                currentString = currentString.concat(strarr[i+j]);
            }

            if(currentString.length() > bestLength) {
                bestLength = currentString.length();
                bestString = currentString;
            }
        }

        return bestString;
    }
}