package chapters.chapter07.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class C07E35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean isStartGame = true;
        while (isStartGame) {
            isStartGame = false;
            String word = generateRandomWord();
            char[] wordArray = new char[word.length()];
            char[] asterisk = new char[word.length()];
            char[] inputArray = new char[26];

            processArrays(wordArray, asterisk, word);
            boolean isInWordArray;
            boolean isInInputArray;
            int missCount = 0;
            boolean isContinueGame = true;

            while (isContinueGame) {
                System.out.print("Enter a letter in word " + arrayToString(asterisk) + " > ");
                char input = Character.toLowerCase(in.next().charAt(0));

                isInWordArray = insideControl(wordArray, input);
                isInInputArray = insideControl(inputArray, input);

                if (isInWordArray && !isInInputArray) {
                    addToInputArray(inputArray, input);
                    asteriskOpenLetter(asterisk, wordArray, input);
                } else if (isInWordArray && isInInputArray) {
                    System.out.println("\t\t" + input + " is already in the word");
                } else if (!isInWordArray && !isInInputArray) {
                    addToInputArray(inputArray, input);
                    missCount++;
                    System.out.println("\t\t" + input + " is not in the word");
                } else if (!isInWordArray && isInInputArray) {
                    System.out.println("\t\t" + input + " is already entered, but it is not in the word");
                }
                if (Arrays.equals(asterisk, wordArray)) {
                    isContinueGame = false;
                    if (missCount == 0) {
                        System.out.println("The word is " + arrayToString(wordArray) + " Congrats, you got head shot!!");
                    } else {
                        System.out.println("The word is " + arrayToString(wordArray) + " You missed " + missCount
                                + ((missCount > 1) ? " times" : " time"));
                    }
                    System.out.println();
                    System.out.println("Do you want to guess another word? Enter y or n: ");
                    if (Character.toLowerCase(in.next().charAt(0)) == 'y') {
                        isStartGame = true;
                    }
                }
            }
        }
    }

    public static String generateRandomWord() {
        String[] words = {"program", "java", "array", "loop", "compiler", "scanner", "letter",
                "index", "asterisk", "boolean", "character", "string"};
        int randomIndex = (int) (Math.random() * words.length);
        return words[randomIndex];
    }

    public static void processArrays(char[] wordArray, char[] asterisk, String word) {
        for (int i = 0; i < wordArray.length; i++) {
            wordArray[i] = word.charAt(i);
            asterisk[i] = '*';
        }
    }

    public static String arrayToString(char[] array) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
    }

    public static boolean insideControl(char[] array, char input) {
        for (char ch : array) {
            if (ch == input) {
                return true;
            }
        }
        return false;
    }

    public static void addToInputArray(char[] inputArray, char input) {
        int lastEmptyIndex = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == '\u0000') {
                lastEmptyIndex = i;
                break;
            }
        }
        inputArray[lastEmptyIndex] = input;
    }

    public static void asteriskOpenLetter(char[] asterisk, char[] wordArray, char input) {
        for (int i = 0; i < asterisk.length; i++) {
            if (input == wordArray[i]) {
                asterisk[i] = input;
            }
        }
    }
}
