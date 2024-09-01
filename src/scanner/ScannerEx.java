package scanner;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        int age = sc.nextInt();

        System.out.println("당신의 이름은 " + name + "이고, 나이는" + age + "살입니다.");
    }
}
