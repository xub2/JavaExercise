package scope;

public class Scope1 {
    public static void main(String[] args) {
        int m  = 10; //m 생존시작
        if (true){
            int x = 20; //x 생존시작
            System.out.println(x);
            System.out.println(m);
        } // x 생존 종료

       // System.out.println(x);
        System.out.println(m);
    }
}
