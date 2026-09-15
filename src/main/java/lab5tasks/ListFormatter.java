/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5tasks;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 *
 * @author natas
 */


public class ListFormatter {

    public static void sortInPlace(List<String> lst) {
        Collections.sort(lst);
    }

    public static List<String> toLowerCase(List<String> lst) {

        List<String> result = new ArrayList<>();

        for (String str : lst) {
            result.add(str.toLowerCase());
        }

        return result;
    }
}