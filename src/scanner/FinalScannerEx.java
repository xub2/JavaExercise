package scanner;

import java.util.Scanner;

public class FinalScannerEx{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0; //총 비용

        while(true){
            System.out.println("1. 상품 입력, 2. 결제, 3. 프로그램 종료");
            int choice = sc.nextInt();
            sc.nextLine();

            if(choice == 1){
                System.out.print("상품명을 입력하세요  : ");
                String marchendise = sc.nextLine();

                System.out.print("상품의 가격을 입력하세요 : ");
                int price = sc.nextInt();

                System.out.print("구매 수량을 입력하세요 : ");
                int count = sc.nextInt();

                System.out.println("상품명 : " + marchendise + " | 가격 : " + price + " | 수량 : " + count + " | 합계 : " + price * count);

                sum += price * count;
            }
            else if(choice == 2){
                System.out.println("총 비용 : " + sum);
                sum = 0;
            }
            else if(choice == 3){
                System.out.println("프로그램을 종료합니다");
                break;
            }
            else{
                System.out.println("올바른 옵션을 선택해주세요!");
            }
        }

    }
}