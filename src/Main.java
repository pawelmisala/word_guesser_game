import java.util.Scanner;

public class Main {
    final static String word = "CODEDEX"; //THE WORD TO GUESS

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tries = 0;
        char[] correctLetters = new char[word.length()];

        for (int i = 0; i < word.length(); i++) { //SETTING DEFAULT VALUES
            correctLetters[i] = '_';
        }

        System.out.println("=== WORD GUESSER ===");
        while (tries <= 4){
            for (char i : correctLetters) {
                System.out.print(i);
            }
            System.out.println(); //NEW LINE

            System.out.print("> ");
            String answer = input.nextLine();

            if (answer.equalsIgnoreCase(word)){ //IF THE ANSWER IS CORRECT
                System.out.println("CONGRATULATIONS! The word was: " + word);
                tries = 5;
            }
            for (int i = 0; i < answer.length(); i++) {//CHECKING IF ANY LETTER MATCHES
                    if (word.charAt(i) == answer.trim().toUpperCase().charAt(i)) {
                        correctLetters[i] = answer.charAt(i);
                    }
                }
            }
            tries++;
        }
    }