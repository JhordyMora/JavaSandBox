package dev.codegym.level8.lesson11.task20;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        String basicFilePath = args[0];
        String fileToWriteFromPath = args[1];
        String fileToAppendFromPath = args[2];

        writingContentFromFileTo(fileToWriteFromPath, basicFilePath, false);
        writingContentFromFileTo(fileToAppendFromPath, basicFilePath, true);
    }

    public static void writingContentFromFileTo(String fileToWriteFromPath, String basicFilePath, boolean shouldAppend) {
        int characterAsci;
        
        try (FileReader reader = new FileReader(fileToWriteFromPath);
                FileWriter writer = new FileWriter(basicFilePath, shouldAppend)) {

            while((characterAsci = reader.read()) != -1){
                writer.write(characterAsci);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
