package javaSE;

import java.util.Scanner;

public class _04_Scanner {

    public static void main(String[] args) {
        // + - * / % ! && ||
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = keyboard.nextLine();
        System.out.println(name);
    }

}