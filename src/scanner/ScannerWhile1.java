package scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            String str = sc.nextLine();


            if(str.equals("exit")){
                System.out.println("Shutting down");
                break;
            }

            System.out.println("str = " + str);
        }

        sc.close();
    }
}
