package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println(num1);
        }
        else if(num1 < num2){
            System.out.println(num2);
        }
        else{
            System.out.println("두 숫자가 같습니다");
        }
    }
}
