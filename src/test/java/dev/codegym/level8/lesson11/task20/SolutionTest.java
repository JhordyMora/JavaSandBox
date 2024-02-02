package dev.codegym.level8.lesson11.task20;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;

class SolutionTest {

    String relativePathTextEmpty = "src\\test\\java\\dev\\codegym\\level8\\lesson11\\task20\\textEmpty.txt";
    Path completePathTextEmpty = Paths.get(relativePathTextEmpty);

    String relativePathTextWriting = "src\\test\\java\\dev\\codegym\\level8\\lesson11\\task20\\textWithInformationForWriting.txt";
    Path completePathTextWriting = Paths.get(relativePathTextWriting);

    String relativePathTextAppend = "src\\test\\java\\dev\\codegym\\level8\\lesson11\\task20\\textWithInformationForAppend.txt";
    Path completePathTextAppend = Paths.get(relativePathTextAppend);
    
    String relativePathEmptyTextWriting = "src\\test\\java\\dev\\codegym\\level8\\lesson11\\task20\\textWithNoInformationForWriting.txt";
    Path completePathEmptyTextWriting = Paths.get(relativePathTextWriting);

    String relativePathEmptyTextAppend = "src\\test\\java\\dev\\codegym\\level8\\lesson11\\task20\\textWithInformationForAppend.txt";
    Path completePathEmptyTextAppend = Paths.get(relativePathTextAppend);

    @Test
    void shouldWriteAndAppendInformationToAnotherFile() {
        Solution.writingContentFromFileTo(completePathEmptyTextWriting.toString(), completePathTextEmpty.toString(), false);
        Solution.writingContentFromFileTo(completePathTextAppend.toString(), completePathTextEmpty.toString(), true);
        File fileAfterProcess = new File(completePathTextEmpty.toString());
        assertTrue(fileAfterProcess.exists());
        assertTrue(fileAfterProcess.length()>0);
        assertEquals(10, fileAfterProcess.length());
    }
    
}
