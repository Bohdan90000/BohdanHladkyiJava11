package TechTasksBohdan;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        if (number > 7) {
            System.out.println("Привет");
        } else {
            System.out.println("Пустота"); // Я подумал, что стоит что-то добавить
        }
    }
}
