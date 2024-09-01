import java.util.Scanner;

public class Oilprice {
    public static void main(String[] args) {

        final int OIL_PRICE = 1642;

        System.out.println("어서오세요 금일 휘발유 값은 "+ OIL_PRICE + "입니다. ");
        System.out.println("주유하실 리터를 입력하여 주세요. ");

        Scanner in = new Scanner(System.in);

        int lit = in.nextInt();
        int price = OIL_PRICE * lit;

        System.out.println("고객님께서 결제하실 유류세는 " + price + "원 입니다. ");

        in.nextLine();

        System.out.println("결제 수단을 입력하여 주세요. ");

        String pay = in.nextLine();

        System.out.println("선택하신 결제 수단은 " + pay + " 입니다.");
        in.close();


    }

}

