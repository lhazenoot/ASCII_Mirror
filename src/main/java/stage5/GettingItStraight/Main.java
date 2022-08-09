package stage5.GettingItStraight;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input the file path:");
        int maxLength = 0;
        List<String> lines = new ArrayList<>();
        try (Scanner fileScanner = new Scanner(new File(new Scanner(System.in).nextLine()))) {

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                lines.add(line);
                maxLength = Math.max(line.length(), maxLength);
            }
            for (String line : lines) {
                line += " ".repeat(maxLength - line.length());
                System.out.println(line + " | " + reverse(line));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }

    private static String reverse(String line) {
        StringBuilder reveseLine = new StringBuilder();

        for(int j = line.length() - 1; j >= 0; j--) {
            char ch = reverseChar(line.charAt(j));
            reveseLine.append(ch);
        }
        return reveseLine.toString();
    }

    private static char reverseChar(char ch) {
        switch (ch) {
            case '<' -> ch = '>';
            case '>' -> ch = '<';
            case '[' -> ch = ']';
            case ']' -> ch = '[';
            case '{' -> ch = '}';
            case '}' -> ch = '{';
            case '(' -> ch = ')';
            case ')' -> ch = '(';
            case '/' -> ch = '\\';
            case '\\' -> ch = '/';
            default -> {
            }
        }
        return ch;
    }
}
