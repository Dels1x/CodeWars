public class Main {
    public static void main(String[] args) {

        System.out.println(Kata2.generateShape(5));

    }

}

class Kata2 {
    public static String generateShape(int n) {
        String output = "";

        for(int i = 0; i < n; i++) {
            output += "+".repeat(n).concat("\n");
        }

        return output.substring(0, output.length()-1);
    }
}