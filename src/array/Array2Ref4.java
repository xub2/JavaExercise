package array;

public class Array2Ref4 {
    public static void main(String[] args) {
        int[][] arr = new int[100][100];

        int i = 1;
        for(int row = 0; row < arr.length ; row++){
            for(int column = 0 ; column < arr[row].length ;column++){
                arr[row][column] = i++;
            }
        }


        for(int row = 0; row < arr.length; row++){
            for(int column = 0 ; column < arr[row].length ; column++){
            System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}

//arr.length 는 배열의 행의 길이
//arr[row].length는 배열의 행에 들어있는 원소의 길이 즉 열의 길이