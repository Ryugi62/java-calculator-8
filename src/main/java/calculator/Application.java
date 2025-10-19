package calculator;

import camp.nextstep.edu.missionutils.Console;


import java.util.regex.Pattern;

public class Application {
    public static void main(String[] args) {
        int result = 0;

        // text_input이라는 변수에 값 입력받음
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String text_input = Console.readLine();
        

        // text_input에 ;이나 ,을 기준으로 문자를 각각 분리해서 배열에 넣는다.
        // //으로 시작해서 \n으로 끝나는 문자를 각각 분리해서 배열에 넣는다.
        // ; 또는 , 또는 //로 시작해서 \n으로 끝나는 것들을 기준으로 분리한다는 정규표현식
        Pattern pattern = Pattern.compile(",|;|//.*\\\\n");
        System.out.println("regex: " + pattern);

        String[] arr = pattern.split(text_input);

        for (int i = 0; i < arr.length; i++) {
            // 우선 가독성을 위해서 arr[i]를 출력.
            System.out.println("index[" + i + "]: " + arr[i]);
            

            // arr[i]가 숫자가 아니면 오류를 throw. 
            // (자동으로 -가 있으면 양수판단까지 가능하다.)
            if (!Pattern.matches("\\d+", arr[i])) {
                throw new IllegalArgumentException();
            }

            result += Integer.parseInt(arr[i]);
        }

        // 각 숫자들끼리 더한 후 결과값 출력
        System.out.println(result);
    }
}
