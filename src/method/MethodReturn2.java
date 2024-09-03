package method;

public class MethodReturn2 {
    public static void main(String[] args) {

        adult(10);
        adult(20);


    }

    public static void adult(int age) {
        if (age < 18) {
            System.out.println("미성년자 입니다. 출입 불가");
            return;
        } else {
            System.out.println(age + "살 성인입니다.");
        }
    }
}
