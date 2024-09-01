package scanner;

import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt(); //시작할 숫자
        int num2 = sc.nextInt(); //마지막 숫자


        if(num1 > num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        for(int i = num1 ; i <= num2 ; i++ ){

            System.out.print(i);

            if(i != num2 ){
                System.out.print(",");
            }
        }

    }
}
