import java.io.*;

public class Main {

    public static int parse(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] arr = new int[15][15];

        for(int i = 0; i < arr.length; i++) {
            arr[i][0] = 1;
            arr[0][i] = i+1;
        }

        for(int i = 1; i < arr.length; i++) {
            for(int j = 1; j < arr[1].length; j++) {
                arr[i][j] = arr[i][j-1] + arr[i-1][j];
            }
        }

        int t = parse(br.readLine());

        while (t > 0) {
            int k = parse(br.readLine());
            int n = parse(br.readLine());
            bw.write(String.valueOf(arr[k][n-1]));
            bw.write("\n");
            t--;
        }

        bw.close();
    }
}