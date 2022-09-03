package com.company;

import javax.security.sasl.SaslClient;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        try (FileWriter fileWriter = new FileWriter("test.txt")) {
            for (char alphabet = 'A'; alphabet <= 'Z'; alphabet++) {

                fileWriter.write(alphabet + " " + Character.toLowerCase(alphabet) + "\n");
            }

            for (int numbers = 0; numbers <= 9; numbers++) {
                fileWriter.write(numbers + "\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            ;
        }


        try (FileReader fileReader = new FileReader("test.txt")) {
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());

            }
               } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
