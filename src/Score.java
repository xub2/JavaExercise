import java.util.Scanner;

public class Score {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("시험 성적을 입력하여 주세요");
        int point = sc.nextInt();

        if (point > 90)
            System.out.println("A등급입니다");
        else if ((point >= 80) && (point <= 89))
            System.out.println("B등급입니다");
        else if ((point >= 70) && (point <= 79))
            System.out.println("C등급입니다");
        else
            System.out.println("F등급입니다");

        sc.close();
    }
}
