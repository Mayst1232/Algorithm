import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st;

        st = new StringTokenizer(sc.nextLine());

        int total = 0;

        while (st.hasMoreTokens()) {
            total += Integer.parseInt(st.nextToken());
        }

        System.out.println(total * 5);

    }
}