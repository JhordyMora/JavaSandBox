package dev.codegym.level8.lesson11.task18;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    void shouldFiveLetters() throws FileNotFoundException, IOException {
        String relativePath = "src/test/java/dev/codegym/level8/lesson11/task18/textoWith5Letters.txt";
        Path filePath = Paths.get(relativePath);
        String absolutePath = filePath.toAbsolutePath().toString();

        int expectedNumberOfLetters = 5;
        int result = Solution.getCountOfEnglishChars(absolutePath);
        assertEquals(expectedNumberOfLetters, result);
    }

    @Test
    void shouldTenLetters() throws FileNotFoundException, IOException {
        String relativePath = "src/test/java/dev/codegym/level8/lesson11/task18/textoWith10Letters.txt";
        Path filePath = Paths.get(relativePath);
        String absolutePath = filePath.toAbsolutePath().toString();

        int expectedNumberOfLetters = 10;
        int result = Solution.getCountOfEnglishChars(absolutePath);
        assertEquals(expectedNumberOfLetters, result);
    }
}
