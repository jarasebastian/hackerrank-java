package com.hackerrank.anagrams;

import java.util.Scanner;

/**
 * @author sebastianjara on 22-03-21
 * @project hackerrank-java
 */
public class Solution {

    static boolean isAnagram(String a, String b) {
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        if(a == null || b == null || a.length() != b.length()) {
            return false;
        }

        a = a.toLowerCase();
        b = b.toLowerCase();

        java.util.HashMap<Character, Integer> map = new java.util.HashMap<>();

        //Checking the elements of first word
        for(int i = 0; i < a.length(); i++) {
            char key = a.charAt(i);
            map.merge(key, 1, Integer::sum);
        }

        //Checking the elements of second word
        for(int i = 0; i < b.length(); i++){
            char key = b.charAt(i);
            if(map.containsKey(key) && map.get(key) > 0){
                int value = map.get(key) - 1;
                map.replace(key, value);
            } else {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("---Welcome to Anagram Verifier---\n");
        System.out.println("Insert the first word");
        String a = scan.next();
        System.out.println("Insert the second word");
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
