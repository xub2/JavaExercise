package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        while(true){
            int input = sc.nextInt();
            sum += input;

            if(input == 0){
                System.out.println("0이 입려되었습니다");
                break;
            }

        }
        System.out.println("sum = " + sum);
    }
}
