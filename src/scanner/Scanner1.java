package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 입력");
        String str = sc.nextLine();
        System.out.println("입력한 문자열 = " + str);

        System.out.print("정수 입력");
        int intValue = sc.nextInt();
        System.out.println("입력한 문자열 = " + intValue);

        System.out.print("실수 입력");
        double doubleValue = sc.nextDouble();
        System.out.println("doubleValue = " + doubleValue);

        sc.close();
    }

}
