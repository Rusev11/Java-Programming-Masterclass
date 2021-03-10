package ScopeChallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int x = Integer.parseInt(scanner.nextLine());
        new X(x).x();
    }
}
