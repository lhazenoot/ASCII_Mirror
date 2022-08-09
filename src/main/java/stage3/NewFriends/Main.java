package stage3.NewFriends;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

// ./src/main/java/stage3/NewFriends/example1.txt

public class Main {
    public static void main(String[] args) throws IOException {
        Input input = new Input();
        input.printFile();
    }
}

class Input {
    public void printFile() throws IOException {
        System.out.println("Input the file path:");
        String filePath = new Scanner(System.in).nextLine();
        File file = new File(filePath);

        if (!file.exists() || file.isDirectory()) {
            System.out.println("File not found!");
        } else {
            String fileTxt = Files.readString(file.toPath());
            System.out.println(fileTxt);
        }
    }
}
