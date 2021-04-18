package com.hackerrank.strings.reverse;

import java.util.Scanner;

/**
 * @author sebastianjara on 18-04-21
 * @project hackerrank-java
 */
public class Solution {

    public static boolean isPalindrome(String word){

        char[] arrayWord = word.toCharArray();
        int ascIndex = 0;
        int descIndex = arrayWord.length - 1;

        while(ascIndex < arrayWord.length){
            if(arrayWord[ascIndex]!=arrayWord[descIndex]) return false;
            ascIndex++;
            descIndex--;
        }

        return true;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String result = (isPalindrome(A))? "Yes" : "No";
        System.out.println(result);
    }


}
