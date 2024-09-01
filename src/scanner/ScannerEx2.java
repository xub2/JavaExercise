package scanner;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("입력하신 수는 짝수");
        }
        else{
            System.out.println("입력하신 수는 홀수");
        }

        sc.close();
    }
}
