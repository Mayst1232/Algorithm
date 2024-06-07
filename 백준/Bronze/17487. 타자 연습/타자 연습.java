import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static int parse(String s) {
      return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        CheckLetter cl = new CheckLetter();

        char[] s = br.readLine().toCharArray();

        int left = 0;
        int right = 0;
        int shift = 0;
        int space = 0;

        for(int i = 0; i < s.length; i++) {
            if(s[i] == 32) {
                space++;
                continue;
            }

            if(s[i] >= 65 && s[i] <= 90) {
                shift++;
                s[i] += 32;
            }

            String S = cl.returnLR(s[i]);

            if(S.equals("L")) {
                left++;
            } else {
                right++;
            }
        }

        while (true){
            if(space == 0 && shift == 0) {
                break;
            }

            if(shift != 0) {
                if(right >= left) {
                    shift--;
                    left++;
                    continue;
                }

                right++;
                shift--;
                continue;
            }

            if(space != 0) {
                if(right >= left) {
                    space--;
                    left++;
                    continue;
                }

                right++;
                space--;
            }
        }

        System.out.println(left + " " + right);
    }
}

class CheckLetter {
    List<Character> checkList = new ArrayList<>(
        Arrays.asList('q','w','e','r',
        't','y','a','s','d','f','g','z',
            'x','c','v','b'));
    public String returnLR(char a) {
        if(checkList.contains(a)) {
            return "L";
        }

        return "R";
    }
}