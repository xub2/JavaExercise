package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};


        for(int i = 0 ; i < numbers.length ; i++){
            System.out.println(numbers[i]);
        }

        for(int number : numbers){
            System.out.println(number);
        }


// 향상된 for문을 못쓰는 경우
//        for(int i = 0 ; i < numbers.length ; ++i){
//            System.out.println("number" + i + "번 값은" + number);
//        }
    }
}
