package array;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("학생수를 입력하시오");
        int stu = sc.nextInt();

        int scores[][] = new int[stu][3];
        String subjects[] = {"국어", "영어", "수학"};

        for(int i = 0; i < stu; i++){ //학생 기준 for 문
            System.out.println((i+1) + "번 학생의 성적을 입력하세요: ");
            for(int j = 0; j < 3 ; j++){ //과목 기준 for문
                System.out.print(subjects[j] + " 점수:");
                scores[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < stu; i++){
            int total = 0;
            for (int j = 0 ; j < 3; j++){
                total += scores[i][j];
            }

            double average = total / 3.0;
            System.out.println((i + 1) + "번 학생의 총점: " + total + ", 평균: " + average);
        }


    }
}




