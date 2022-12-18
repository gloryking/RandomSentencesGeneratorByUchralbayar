import java.util.Random;
import java.util.Scanner;

public class RandomSentences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = {"Peter", "Michell", "Jane", "Steve"};
        String[] places = {"Sofia", "Plovdiv", "Varna", "Burgas"};
        String[] verbs = {"eats", "holds", "sees", "plays with", "brings"};
        String[] nouns = {"stones", "cake", "apple", "laptop", "bikes"};
        String[] adverbs = {"slowly", "diligently", "warmly", "sadly", "rapidly"};
        String[] details = {"near the river", "at home", "in the park"};

        System.out.println("Hello," +
                "This is your first random-generated sentence:");

        String readString="";

        while (readString.equals("")) {
            String randomName = randomWord(names);
            String randomPlace = randomWord(places);
            String randomVerbs = randomWord(verbs);
            String randomNouns = randomWord(nouns);
            String randomAdverbs = randomWord(adverbs);
            String randomDetails = randomWord(details);
            System.out.printf("%s from %s %s %s %s %s%n", randomName, randomPlace, randomVerbs, randomNouns, randomAdverbs, randomDetails);
            System.out.println("Click [Enter] to generate a new one.");
            readString=scanner.nextLine();
        }
    }

    public static String randomWord(String[] words) {
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        String word = words[randomIndex];
        return word;
    }
}