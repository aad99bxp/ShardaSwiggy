package org.example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Input Line");
        BufferedReader input= new BufferedReader( new InputStreamReader(System.in));
        String line= input.readLine();

        System.out.println(line);

        String[] partsOfLine = line.split(",");

        for(String part : partsOfLine) {
            System.out.println(part + "\n");
        }
    }
}