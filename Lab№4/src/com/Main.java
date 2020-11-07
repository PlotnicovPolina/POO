package com;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("three_expressions:");
        String path = "F:\\USERS\\Polina\\Рабочий стол\\three_expressions.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            Test test=new Test(line);
            test.Modification();
        }
        scanner.close();
        System.out.println("one_expressions:");
        String path_2 = "F:\\USERS\\Polina\\Рабочий стол\\one_expression.txt";
        File file_2 = new File(path_2);
        Scanner scanner_2 = new Scanner(file_2);
        while(scanner_2.hasNextLine()) {
            String line_2 = scanner_2.nextLine();
            Test test_2=new Test(line_2);
            test_2.Modification();
        }
        scanner.close();
    }
}
