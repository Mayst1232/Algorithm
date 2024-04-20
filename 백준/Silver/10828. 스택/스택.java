import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int parse(String s) {
      return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        StackClass stackClass = new StackClass();

        int n = parse(br.readLine());
        int[] a = new int[n];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            switch (s) {
                case "push" :
                    stackClass.push(a, parse(st.nextToken()));
                    break;
                case "pop" :
                    sb.append(stackClass.pop(a)).append("\n");
                    break;
                case "size" :
                    sb.append(stackClass.size()).append("\n");
                    break;
                case "empty" :
                    sb.append(stackClass.empty()).append("\n");
                    break;
                case "top" :
                    sb.append(stackClass.top(a)).append("\n");
                    break;
            }
        }

        System.out.print(sb);
    }

}

class StackClass {
    int size = 0;
    public void push(int[] a, int item) {
        a[size] = item;
        size++;
    }

    public int pop(int[] a) {
        if(this.size == 0) {
            return -1;
        }

        int num = a[this.size - 1];
        a[size - 1] = 0;
        size--;
        return num;
    }

    public int size() {
        return this.size;
    }

    public int empty() {
        if(this.size == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public int top(int[] a) {
        if(this.size == 0) {
            return -1;
        }

        return a[size - 1];
    }
}