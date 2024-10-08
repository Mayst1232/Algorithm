import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            String s = br.readLine();
            char[] check = s.toCharArray();

            if(check[0] == '.') {
                break;
            }

            Stack<Character> stack = new Stack<>();

            stack.push(' ');

            for(int i = 0; i < check.length; i++) {
                if(check[i] == '(') {
                    stack.push(check[i]);
                } else if (check[i] == ')') {
                    char c1 = stack.pop();
                    if(c1 != '(') {
                        stack.push(check[i]);
                        break;
                    }
                } else if (check[i] == '[') {
                    stack.push('[');
                } else if (check[i] == ']') {
                    char c1 = stack.pop();
                    if(c1 != '[') {
                        stack.push(check[i]);
                        break;
                    }
                }
            }

            if(stack.pop() == ' ') {
                bw.write("yes");
            } else {
                bw.write("no");
            }

            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}