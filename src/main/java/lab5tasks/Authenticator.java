/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5tasks;

/**
 *
 * @author natas
 */

import java.util.HashMap;
import java.util.Map;

public class Authenticator {

    private final Map<String, char[]> cachedIds = new HashMap<>();

    public char[] getMitId(String username) {

        if (!cachedIds.containsKey(username)) {
            cachedIds.put(username, "123456789".toCharArray());
        }

        return cachedIds.get(username);
    }

    public String getMitIdSecure(String username) {

        if (!cachedIds.containsKey(username)) {
            cachedIds.put(username, "123456789".toCharArray());
        }

        return new String(cachedIds.get(username));
    }
}