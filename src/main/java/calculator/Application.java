package calculator;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // text_input이라는 변수에 값 입력받음
        Scanner sc = new Scanner(System.in);
        int result = 0;

        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String text_input = sc.nextLine();

        System.out.println("결과 : " + text_input);


        // text_input에 ;이나 ,을 기준으로 문자를 각각 분리해서 배열에 넣는다.
        String[] arr = text_input.split(";|,");

        for (int i = 0; i < arr.length; i++) {
            // result += int(arr[i]);
            result += Integer.parseInt(arr[i]);
        }

        // //으로 시작해서 \n으로 끝나는 문자를 각각 분리해서 배열에 넣는다.

        // 아직 text_input에 구분자가 남아있으면 오류 return 후 종료

        // 각 숫자들끼리 더한 후 결과값 출력
        System.out.println(result);
    }
}
