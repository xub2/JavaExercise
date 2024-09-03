package method;

public class MethodCasting2 {
    public static void main(String[] args) {
        int number = 100;
        //printNumber(number); //double 을 int에 대입하려고 시도해서 오류 발생
        printNumber(number); // 명시적 형변환을 통해 double을 int로 변경
    }

    public static void printNumber(double n){
        System.out.println("숫자 : " + n);
    }
}
