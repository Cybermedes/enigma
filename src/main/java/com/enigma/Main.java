package com.enigma;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        printMainMenu();
    }

    private static void printMainMenu() {
        Path menuTextPath = Path.of("src/main/resources/introduction.txt");
        try (Stream<String> menuText = Files.lines(menuTextPath)) {
            menuText.forEach(System.out::println);
        } catch (IOException e) {
            System.err.format("%s%n", e);
        }
    }
}
