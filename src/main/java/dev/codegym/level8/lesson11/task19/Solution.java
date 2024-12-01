package dev.codegym.level8.lesson11.task19;

import java.io.FileReader;
import java.io.IOException;

/*
The first parameter of the main method is a file name.
Display the ratio of the number of spaces to the number of all characters. For example, 10.45.
1. Count all the characters (n1).
2. Count the spaces (n2).
3. Display n2/n1*100, rounding to 2 decimal places.
4. Close the streams.

Requirements:
•	You don't need to read anything from the console.
•	Create a stream to read from the file passed as the first argument of the main method.
•	Calculate and display the ratio of the spaces to all characters in the file.
•	The displayed value must be rounded to 2 decimal places.
•	The stream used to read the file must be closed.
 */

public class Solution {
    public static void main(String[] args) {
        String filePath = args[0];
        calculateRatioOfSpacesToCharactersInPercentageInAFile(filePath);
    }

    /**
     * Calculates the ratio of spaces to characters in a text file and returns the result as a formatted percentage with two decimals.
     *
     * @param pathFile   The path of the text file.
     * @return           The calculated ratio of spaces to characters represented as a percentage.
     */
    public static String calculateRatioOfSpacesToCharactersInPercentageInAFile(String pathFile) {
        float numberOfSpaces = calculateNumberOfElementInTheDocument("spaces", pathFile);
        float numberOfCharacters = calculateNumberOfElementInTheDocument("characters", pathFile);
        float result = (numberOfSpaces/numberOfCharacters) * 100;
        return String.format("%.02f", result);
    }

    /**
     * @param element
     * @param pathFile
     * @return
     */
    private static float calculateNumberOfElementInTheDocument(String element, String pathFile) {
        int character;
        int blankSpace = 32;
        
        float numberOfElements = 0;
        try (FileReader fileReader = new FileReader(pathFile)) {
            while (fileReader.ready() && (character = fileReader.read()) != -1){
                if(element.equalsIgnoreCase("spaces") && character == blankSpace) numberOfElements++;
                if(element.equalsIgnoreCase("characters") && character != blankSpace) numberOfElements++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numberOfElements;
    }
}
