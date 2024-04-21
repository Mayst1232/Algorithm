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
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        QueueClass qc = new QueueClass();

        int n = parse(br.readLine());
        int[] a = new int[n];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            switch (s) {
                case "push" :
                    qc.push(a, parse(st.nextToken()));
                    break;
                case "pop" :
                    sb.append(qc.pop(a)).append("\n");
                    break;
                case "size" :
                    sb.append(qc.size()).append("\n");
                    break;
                case "empty" :
                    sb.append(qc.empty()).append("\n");
                    break;
                case "front" :
                    sb.append(qc.front(a)).append("\n");
                    break;
                case "back" :
                    sb.append(qc.back(a)).append("\n");
                    break;
            }
        }

        System.out.print(sb);
    }
}

class QueueClass {
    int first = 0;
    int last = 0;

    public void push(int[] a, int num) {
        a[last] = num;
        last++;
    }

    public int pop(int[] a) {
        if(last - first == 0) {
            return -1;
        }

        int now = a[first];
        first++;
        return now;
    }

    public int size() {
        return last - first;
    }

    public int empty() {
        if(last - first == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public int front(int[] a) {
        if(last - first == 0) {
            return -1;
        }
        return a[first];
    }

    public int back(int[] a) {
        if(last - first == 0) {
            return -1;
        }
        return a[last - 1];
    }

}