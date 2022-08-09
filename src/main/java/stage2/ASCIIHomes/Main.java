package stage2.ASCIIHomes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        input.askAndRepeatInput();
    }
}

class Input {
    public void askAndRepeatInput() {
        Cow cow = new Cow();
        System.out.println("Input the file path:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input);
        cow.printCow();
    }
}

class Cow {
    public void printCow() {
        System.out.println("            ^__^");
        System.out.println("    _______/(oo)");
        System.out.println("/\\/(       /(__)");
        System.out.println("   | w----||    ");
        System.out.println("   ||     ||    ");
    }
}
