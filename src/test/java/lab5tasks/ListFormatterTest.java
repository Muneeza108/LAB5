/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package lab5tasks;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 *
 * @author natas
 */
public class ListFormatterTest {

    @Test
    public void testSortInPlace() {

        List<String> list =
                new ArrayList<>(Arrays.asList("Banana", "Apple", "Orange"));

        ListFormatter.sortInPlace(list);

        assertEquals(
                Arrays.asList("Apple", "Banana", "Orange"),
                list
        );
    }

    @Test
    public void testToLowerCaseDoesNotMutateOriginal() {

        List<String> original =
                new ArrayList<>(Arrays.asList("HELLO", "WORLD"));

        List<String> result =
                ListFormatter.toLowerCase(original);

        assertEquals(
                Arrays.asList("hello", "world"),
                result
        );

        assertEquals(
                Arrays.asList("HELLO", "WORLD"),
                original
        );
    }
}