package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {
    private String str;
    private StringUtil stringutil;

    @BeforeEach
    void setup() {
        str = "iTopiNonAvevAnoNipoTi";
        stringutil = new StringUtil();
    }

    @Test
    void shouldReverseTheString() {
        Assertions.assertEquals("iTopiNonAvevAnoNipoTi",stringutil.reverse(str));
    }

    @Test
    void shouldIsPalindromTheString() {
        Assertions.assertTrue(stringutil.isPalindrome(str));
    }

    @Test
    void shouldUpperCaseTheString() {
        Assertions.assertEquals("ITOPINONAVEVANONIPOTI",stringutil.toUpperCase(str));
    }
}
