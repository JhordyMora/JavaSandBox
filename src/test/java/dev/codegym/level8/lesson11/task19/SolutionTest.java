package dev.codegym.level8.lesson11.task19;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

import dev.codegym.level8.lesson11.taks19.Solution;

public class SolutionTest {
    @Test
    void shouldReturn20PercentFromTexto1(){
        String filePathRelative =  "src\\test\\java\\dev\\codegym\\level8\\lesson11\\task19\\texto1.txt";
        Path filePathComplete = Paths.get(filePathRelative);
        String absolutePath = filePathComplete.toAbsolutePath().toString();
    
        String result = Solution.calculateRatioOfSpacesToCharactersInPercentageInAFile(absolutePath);

        assertEquals("20,34", result);
    }

    //TODO create more scenarios when files are empty for instances
}
