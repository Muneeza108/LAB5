/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5tasks;

/**
 *
 * @author natas
 */

import java.util.List;

public class StringUtils {

    /**
     * BAD OPERATIONAL SPECIFICATION:
     *
     * First create an empty result string. Then use a for loop
     * to visit every element of the list. For each element,
     * concatenate it to the result. Use an if statement to check
     * whether the current element is the last element. If it is
     * not the last element, concatenate the delimiter after it.
     * Continue until all elements have been processed.
     */

    /**
     * GOOD DECLARATIVE SPECIFICATION:
     *
     * Returns the concatenation of elements in order, with the
     * delimiter inserted between each adjacent pair.
     *
     * @param words the list of strings to join
     * @param delimiter the delimiter inserted between adjacent elements
     * @return the joined string
     */
    public static String joinStrings(List<String> words, String delimiter) {

        return String.join(delimiter, words);
    }
}