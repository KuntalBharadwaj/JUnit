package com.bridgelabz;

public class StringUtil {
    public String reverse(String str) {
        StringBuilder str2 = new StringBuilder(str);
        str2.reverse();
        return str2.toString();
    }
    public boolean isPalindrome(String str) {
        StringBuilder str2 = new StringBuilder(str);
        str2.reverse();
        return str2.toString().equals(str);
    }
    public String toUpperCase(String str) {
        return str.toUpperCase();
    }
}
