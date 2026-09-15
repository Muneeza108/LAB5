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

import java.util.Arrays;

public class StringUtilsTest {

    @Test
    public void testJoinStrings() {

        String result = StringUtils.joinStrings(
                Arrays.asList("Java", "JUnit", "GitHub"),
                ", "
        );

        assertEquals("Java, JUnit, GitHub", result);
    }
}