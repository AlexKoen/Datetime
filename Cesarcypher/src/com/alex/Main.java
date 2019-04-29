package com.alex;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        encode("This can be as long as you want it to be " +
                "but when you recode the coded message i cannot get the spaces between " +
                "the words");

        System.out.println(" ");

        decode("guvfpnaornfybatnflbhjnagvggborohgjuralbherpbqrgurpbqrqzrffntrvpnaabgtrggurfcnprforgjrragurjbeqf");


    }

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
