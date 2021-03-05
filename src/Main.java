import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/*
    연산 조건 : 1. N>1 && N<1000 2. K>1 && K<N
    출력 : N의 약수들 중 K번째로 작은 수를 출력.
          약수가 존재하지 않을 경우에는 0 출력
    예) 3 6을 입력했다면 3의 약수 중 6번째 작은 수를 출력,
        하지만 이 경우에는 약수가 존재하지 않으므로 0을 출력.

    -로직 생각해 보기-
    1. 첫째 줄에 두 입력 값 사이에 빈칸은 어떻게 구별하여 파라미터로 보낼까?
    -> 공백 포함 변수를 3개 지정.
    2. 입력된 두 개의 값을 나눈 나머지가 0일때, 약수로 카운트.
    3. 약수들의 데이터는 어떤 형식으로 저장해야할까. 배열?
       ->극단적으로 n값을 999으로 했을 때..999만큼의 수를 나누어야하니까
         입력된 n값 만큼의 배열을 생성.
    4. 약수들 중, 입력된 두번째 값보다 작은 수를 출력은 어떻게 할까?
       -> 배열에 저장된 약수 데이터들로 비교.

    -----
    전체적으로 코드를 참고하고 짰다.
    그래도 계속 생각해보고 이해안되는 부분들을 익히면서 다시 쳐보았다.
*/
public class Main {

    public void divisor(int num1, int num2) {
        ArrayList<Integer> n = new ArrayList<Integer>();
        for(int i = 1; i < num1+1; i++) { // 약수 계산
            if (num1 % i == 0) {
                n.add(i); // 약수 arraylist에 저장.
            }
        }
        if (n.size() < num2) {
            System.out.println(0);
        } else  {
            System.out.println(n.get(num2-1));

        }
    }


    public static void main(String[] args) throws IOException {
        Main m = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int num1 = Integer.parseInt(str[0]);
        int num2 = Integer.parseInt(str[1]);

        m.divisor(num1, num2);
    }
}

