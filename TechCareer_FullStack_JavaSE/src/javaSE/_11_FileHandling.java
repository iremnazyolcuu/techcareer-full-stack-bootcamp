package javaSE;

import java.io.*;
import java.util.Scanner;

public class _11_FileHandling {

    private static final String URL = "C:\\techcareer\\UserData.txt";

    public static String getUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write something: ");
        String data = scanner.nextLine();
        return data;
    }

    public static void getUserWriter() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(URL, true))) {
            String user = getUser();
            bufferedWriter.write(user + "\n");
            bufferedWriter.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void getUserReader() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(URL))) {
            StringBuilder stringBuilder = new StringBuilder();
            String row = "";
            while ((row = bufferedReader.readLine()) != null) {
                stringBuilder.append("\n").append(row);
            }
            String data = stringBuilder.toString();
            System.out.println(data);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void commonMethod() {
        while (true) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("\nChoose an option: ");
            System.out.println("1-)Write\n2-)Read\n3-)Exit");
            int choice = keyboard.nextInt();
            switch (choice) {
                case 1:
                    getUserWriter();
                    break;
                case 2:
                    getUserReader();
                    break;
                case 3:
                    System.out.println("Exiting the system...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("You've made an invalid choice!");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        commonMethod();
    }
}