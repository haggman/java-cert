package com.roitraining.cert.classes_and_objects;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResources {
    public static void main(String[] args) {
        Path path = Paths.get("out.txt");
        //syntax works with any class that implements AutoClosable
        final Scanner s = new Scanner(System.in); //works for final or effectively final values
        try(s; //note ; between closables (not a ,)
            PrintWriter writer = new PrintWriter(Files.newBufferedWriter(path))){
            System.out.println("Number to write: ");
            int num = s.nextInt();
            writer.println(num);
        } catch(InputMismatchException e){ //Both resources closed at end brace, in reverse order
            System.err.println("Issue reading that int: " + e);
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Issue writing that file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
