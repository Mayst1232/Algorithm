import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);

        int i = 0;
        int j = 1;

        while (j < phone_book.length) {
            if (phone_book[j].contains(phone_book[i])) {
                answer = false;
                break;
            }

            i++;
            j++;
        }

        return answer;
    }
}