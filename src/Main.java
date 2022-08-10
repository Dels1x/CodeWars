public class Main {
    public static void main(String[] args) {

        System.out.println(Troll.disemvowel("This website is for losers LOL!"));

    }

}

class Troll {
    public static String disemvowel(String str) {
        return str.replaceAll("[aoiueAOIUE]", "");
    }
}