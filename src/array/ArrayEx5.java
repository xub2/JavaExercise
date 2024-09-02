package array;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력 받을 숫자의 개수를 입력하시오: ");
        int a = sc.nextInt();

        int input[] = new int[a];

        int total = 0;
        int max , min;

        System.out.println(a +"개의 정수를 입력하시오: ");

        for(int i = 0 ; i < input.length ; i++){
            input[i] = sc.nextInt();
        }

        //max 와 min 을 0번쨰 인덱스 값으로 초기화
        max = input[0];
        min = input[0];

        for (int i = 1; i < a; i++){
            if(input[i] < min){
                min = input[i];
            }

            if(input[i] > max){
                max = input[i];
            }
        }

        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);



    }


}




