package scanner;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("음식 이름 입력: ");
        String foodName = sc.nextLine();

        System.out.print("음식 가격 입력: ");
        int foodPrice = sc.nextInt();

        System.out.print("음식 수량 입력: ");
        int foodNum = sc.nextInt();

        System.out.print(foodName + " " + foodNum + "개 주문하셨습니다. ");
        System.out.print("총 가격은 "+ (foodPrice * foodNum) + "입니다");

    }
}
