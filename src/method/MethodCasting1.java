package method;

public class MethodCasting1 {
    public static void main(String[] args) {
        double number = 1.5;
        //printNumber(number); //double 을 int에 대입하려고 시도해서 오류 발생
        printNumber((int) number); // 명시적 형변환을 통해 double을 int로 변경
    }

    public static void printNumber(int n){
        System.out.println("숫자 : " + n);
    }
}
