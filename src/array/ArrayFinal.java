package array;

import java.util.Scanner;

public class ArrayFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxProduct = 10;

        String productName[] = new String[maxProduct];
        int productPrice[] = new int[maxProduct];

        int productCount = 0;

        while (true) {
            System.out.print("1. 상품 등록 | 2. 상품 목록 | 3.종료\n메뉴를 선택하세요: ");
            int choice = sc.nextInt();
            sc.nextLine();


            if (choice == 1) {
                if (productCount >= maxProduct) {
                    System.out.println("상품 등록 갯수 초과");
                    continue; // 이 continue 를 통해 while문의 처음으로 돌아감
                }
                    System.out.print("상품 이름을 입력하세요: ");
                    productName[productCount] = sc.nextLine();

                    System.out.print("상품 가격을 입력하세요: ");
                    productPrice[productCount] = sc.nextInt();

                    productCount++;
                }
            else if (choice == 2) {
                if(productCount == 0){
                    System.out.println("등록된 상품이 없습니다");
                    continue; // 이 continue 를 통해 while문의 처음으로 돌아감
                }
                for(int i = 0 ; i < productCount; i++){
                    System.out.println(productName[i] + " : " + productPrice[i] + "원");
                }
            }
            else if(choice == 3){
                System.out.println("프로그램을 종료합니다");
                break;
            }
            else{
                System.out.println("잘못 된 메뉴를 선택하셨습니다");
            }
        }
    }
}