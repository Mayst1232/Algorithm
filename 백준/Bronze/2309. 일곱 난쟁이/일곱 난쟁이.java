import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] a = new int[9];
        int total = 0;

        for(int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(br.readLine());
            total += a[i];
        }

        int need = total - 100;

        Arrays.sort(a);

        for(int i = a.length - 1; i >= 0; i--) {
            for(int j = 0; j < i; j++) {
                if(a[i] + a[j] < need) {
                    continue;
                }

                if(a[i] + a[j] == need) {
                    a[i] = 101;
                    a[j] = 101;
                    break;
                }
            }
            
            if(a[i] > 100) {
                break;
            }
        }

        for(int i = 0; i < 9; i++) {
            if(a[i] > 100) {
                continue;
            }
            System.out.println(a[i]);
        }
    }
}