package dev.codegym.level8.lesson11.task18;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    private static final Character[] ENGLISH_CHARACTERS_ARRAY = new Character[] {'A','B','C','D','E','F','G','H','I','J','K','L'
            ,'M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m'
            ,'n','o','p','q','r','s','t','u','v','w','x','y','z'};
    private static final Set<Character> ENGLISH_CHARACTERS = new HashSet<>(Arrays.asList(ENGLISH_CHARACTERS_ARRAY));

    public static void main(String[] args) throws IOException {
        final String fileURL = args[0];
        getCountOfEnglishChars(fileURL);
    }

    public static int getCountOfEnglishChars(String fileURL) throws IOException {
        int countOfEnglishChars = 0;
        try (FileReader fileReader = new FileReader(fileURL)) {
            while (fileReader.ready()) {
                char readChar = (char) fileReader.read();
                if (ENGLISH_CHARACTERS.contains(readChar)) countOfEnglishChars++;
            }
        }
        return countOfEnglishChars;
    }
}