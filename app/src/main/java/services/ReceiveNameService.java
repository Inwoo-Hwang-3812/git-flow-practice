package services;

import java.util.Scanner;

public class ReceiveNameService {
    private final Scanner scanner;

    public ReceiveNameService() {
        scanner = new Scanner(System.in);
    }

    public String getName() {
        System.out.println("What's your name?");
        return scanner.nextLine();
    }
}
