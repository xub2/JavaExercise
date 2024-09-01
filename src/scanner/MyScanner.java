package scanner;

import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        while(true){
            int inputNum = sc.nextInt();
            sum = sum + inputNum;

            if(inputNum == 0){
                break;
            }
        }

        sc.close();;
        System.out.println(sum);
    }
}
