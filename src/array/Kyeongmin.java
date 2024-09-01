package array;

import java.util.Scanner;

public class Kyeongmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String km[] = new String[5];

        for(int i = 0 ; i < km.length; i++ ){
            km[i] = sc.nextLine();
        }

        System.out.print("경민이는 ");
        for(int j = 0 ; j < km.length; j++){

            System.out.print(km[j] +" ");
        }
    }
}
