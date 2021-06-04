import java.util.Random;
public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] adjectives = new String[10];
        String[] nouns = new String[10];
//===========================================
        adjectives[0] = "wet";
        adjectives[1] = "rough";
        adjectives[2] = "sweaty";
        adjectives[3] = "scary";
        adjectives[4] = "restless";
        adjectives[5] = "shiny";
        adjectives[6] = "loose";
        adjectives[7] = "punctual";
        adjectives[8] = "messy";
        adjectives[9] = "excited";
//===========================================
        nouns[0] = "child";
        nouns[1] = "park";
        nouns[2] = "lake";
        nouns[3] = "tablet";
        nouns[4] = "shoe";
        nouns[5] = "rock";
        nouns[6] = "ship";
        nouns[7] = "hat";
        nouns[8] = "subway";
        nouns[9] = "frog";

        System.out.println("Here is your server name: ");
        System.out.printf("%s %s", returnRandomElement(adjectives), returnRandomElement(nouns));
    }
    public static String returnRandomElement(String[] array) {
        Random generator = new Random();
        int randomElement = generator.nextInt(array.length);
        return array[randomElement];
    }
}