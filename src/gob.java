import java.util.Scanner;

public class gob{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int i = 0;

        for(i = 1; i<10; i++ ){
            System.out.println(a + "*" + i + "=" + (a*i));

        }

        sc.close();
    }
}