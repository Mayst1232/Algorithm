import java.io.*;
import java.util.*;

public class Main {
    public static int parse(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = parse(br.readLine());
        int[][] checkClass = new int[n][5];

        for(int i = 0; i < checkClass.length; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < checkClass[i].length; j++) {
                checkClass[i][j] = parse(st.nextToken());
            }
        }

        int max = 0;
        int leader = 0;

        for(int i = 0; i < checkClass.length; i++) {
            Set<Integer> set = new HashSet<>();
            for(int j = 0; j < checkClass[i].length; j++) {
                for(int k = 0; k < checkClass.length; k++) {
                    if(checkClass[i][j] == checkClass[k][j] && i != k) {
                        set.add(k);
                    }
                }
            }

            if(set.size() > max) {
                max = set.size();
                leader = i;
            }
        }

        System.out.println(leader + 1);
    }
}