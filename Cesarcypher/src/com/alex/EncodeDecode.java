package com.alex;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EncodeDecode {

    public static void encode(String userInput) {

        List<Character> encodedList = new ArrayList<>();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyzabcdefghijklm".toCharArray();

        char[] splittedString = userInput.toLowerCase().toCharArray();
        for (int i = 0; i < splittedString.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (splittedString[i] == alphabet[j] && j <= 25) {
                    encodedList.add(alphabet[j + 13]);
                }
            }
        }
        String str = encodedList.stream().map(e -> e.toString()).collect(Collectors.joining());
        System.out.println("Coded message: " + str);
    }

    public static void decode(String userInput) {

        List<Character> encodedList = new ArrayList<>();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyzabcdefghijklm".toCharArray();

        char[] splittedString = userInput.toLowerCase().toCharArray();
        for (int i = 0; i < splittedString.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (splittedString[i] == alphabet[j] && j <= 25) {
                    encodedList.add(alphabet[j + 13]);
                }
            }
        }
        String str = encodedList.stream().map(e -> e.toString()).collect(Collectors.joining());
        System.out.println("Decoded message: " + str);
    }
}
