package variable;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class VarEx2 {
    public static void main(String[] args) throws IOException {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int score = Integer.parseInt(br.readLine());

            boolean res = 80 <= score && score <= 100;

            System.out.println("res = " + res);
        }catch(IOException e){
            System.out.println("입력오류");
        }
    }
}