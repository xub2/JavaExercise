package method;

public class MethodReturn1 {
    public static void main(String[] args) {

        boolean sum = odd(4);
        System.out.println(sum);


    }

    public static boolean odd(int i){
        if(i % 2 == 1){
            return true;
        }
        else{
            return false;
        }
    }
}
