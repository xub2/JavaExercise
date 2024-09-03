package method;

public class MethodEx2 {
    public static void main(String[] args) {
        printMessage("Hello, world!" , 3);
        printMessage("Hello, world!" , 5);
        printMessage("Hello, world!" , 7);
    }

    public static void printMessage(String str, int times){
        for(int i = 0 ; i < times ; i++ ){ //여기에 반복문을 써도 된다
            System.out.println(str);
        }
    }
}
