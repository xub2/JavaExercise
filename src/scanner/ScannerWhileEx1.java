package scanner;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            String name = sc.nextLine();

            if(name.equals("종료")){
                System.out.println("프로그램 종료");
                break;

            }
            int age = sc.nextInt();
            sc.nextLine();

            System.out.println("이름은 " + name + "");


        }


    }
}
