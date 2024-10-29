import java.io.*;
import java.util.*;

public class Main {
    public static int parse(String s) {
        return Integer.parseInt(s);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        
        int a = parse(st.nextToken());
        int b = parse(st.nextToken());
        int c = b - a;
        
        System.out.println(c + " " + b);
    }
}