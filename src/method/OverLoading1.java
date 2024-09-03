package method;

public class OverLoading1 {
    public static void main(String[] args) {

        int add1 = add(1,10);
        System.out.println("add1 = " + add1);
        int add2 = add(1,2,3);
        System.out.println("add2 = " + add2);

        double add3 = add(1.0, 100.0);
        System.out.println("add3 = " + add3);
        double add4 = add(1.0, 2.0, 3.0);
        System.out.println("add4 = " + add4);
    }

    public static int add(int a, int b){
        System.out.println("1번 호출");
        return a+b;
    }

    public static int add(int a, int b ,int c){
        System.out.println("2번 호출");
        return a + b + c;
    }

    public static double add (double a, double b){
        System.out.println("3번 호출");
        return a + b;
    }

    public static double add (double a, double b, double c){
        System.out.println("4번 호출");
        return a + b + c;
    }
}
