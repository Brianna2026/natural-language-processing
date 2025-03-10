import java.util.ArrayList;
import java.util.Scanner;

public class MyNLP {
    private ArrayList<String> names;   // Stores names from FirstNames.txt
    private ArrayList<String> letters; // Stores letters A-Z
    private ArrayList<ArrayList<String>> categorizedNames; // Stores grouped names

    // Constructor to initialize data
    public MyNLP() {
        names = FileReader.toStringList("FirstNames.txt");
        letters = FileReader.toStringList("FirstLetter.txt");
        categorizedNames = new ArrayList<>();
        
        for (int i = 0; i < letters.size(); i++) {
            categorizedNames.add(new ArrayList<>()); // Create a sublist for each letter
        }
    }

    /**
     * Prompts user to choose first-letter or last-letter categorization
     */
    public void prompt() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Would you like to categorize names by (1) First Letter or (2) Last Letter?");
        int choice = input.nextInt();
        
        if (choice == 1) {
            categorizeByFirstLetter();
        } else if (choice == 2) {
            categorizeByLastLetter();
        } else {
            System.out.println("Invalid choice.");
        }

        printSummary();
        input.close();
    }

    /**
     * Categorizes names by their first letter
     */
    public void categorizeByFirstLetter() {
        for (String name : names) {
            char firstLetter = name.charAt(0);
            int index = letters.indexOf(Character.toString(firstLetter));

            if (index != -1) {
                categorizedNames.get(index).add(name);
            }
        }
    }

    /**
     * Categorizes names by their last letter
     */
    public void categorizeByLastLetter() {
        for (String name : names) {
            char lastLetter = name.charAt(name.length() - 1);
            int index = letters.indexOf(Character.toString(lastLetter));

            if (index != -1) {
                categorizedNames.get(index).add(name);
            }
        }
    }

    /**
     * Prints categorized names
     */
    public void printSummary() {
        for (int i = 0; i < letters.size(); i++) {
            if (!categorizedNames.get(i).isEmpty()) {
                System.out.println("Names starting/ending with " + letters.get(i) + ": " + categorizedNames.get(i));
            }
        }
    }
}