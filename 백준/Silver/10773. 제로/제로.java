import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static int parse(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = parse(br.readLine());
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++) {
            int insertNumber = parse(br.readLine());
            if(insertNumber == 0) {
                stack.pop();
                continue;
            }

            stack.push(insertNumber);
        }

        while (!stack.empty()) {
            answer += stack.pop();
        }

        System.out.println(answer);
    }
}