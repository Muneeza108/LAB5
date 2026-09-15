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

/**
 *
 * @author natas
 */

public class SearchStrategiesTest {

    @Test
    public void testDifferentResultsWithDuplicates() {
        int[] arr = {10, 20, 30, 20, 40};

        assertEquals(1, SearchStrategies.findFirst(arr, 20));
        assertEquals(3, SearchStrategies.findLast(arr, 20));
    }

    @Test
    public void testSameResultWhenElementAppearsOnce() {
        int[] arr = {10, 20, 30, 40};

        assertEquals(
                SearchStrategies.findFirst(arr, 30),
                SearchStrategies.findLast(arr, 30)
        );
    }
}