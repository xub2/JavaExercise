package scanner;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;
        
        while(true){
            int inputNum = sc.nextInt();

            if(inputNum == -1){
                break;
            }
            
            sum = sum + inputNum;
            count++;
        }

        System.out.println("총합은 = " + sum);
        System.out.println("평균은 = " + (double) sum / count );
        
    }
}
