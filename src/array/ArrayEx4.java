package array;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력 받을 숫자의 개수를 입력하시오: ");
        int a = sc.nextInt();

        int input[] = new int[a];

        int total = 0;

        System.out.println(a +"개의 정수를 입력하시오: ");

        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();
            total += input[i];
        }

        double average = (double) total / input.length;

        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + average);



    }


}




