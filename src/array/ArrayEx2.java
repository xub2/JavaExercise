package array;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input[] = new int[5];

        System.out.println("5개의 정수를 입력하시오: ");

        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();
        }

        System.out.println("출력");

        for(int i = 0 ; i < input.length ; i++){
            System.out.print(input[i]);

            if(i < input.length - 1){
                System.out.print(", ");
            }
        }
    }
}
