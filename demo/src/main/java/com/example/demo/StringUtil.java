package com.example.demo;
/**
 * The 'StringUtil' class checks if the acc/password is empty.
 */
public class StringUtil {
    public static boolean isEmpty(String s){
        return s == null || s.trim().isEmpty();
    }
}
