import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now().getYear());
        System.out.println(LocalDateTime.now().getMonthValue());
        System.out.println(LocalDateTime.now().getDayOfMonth());
    }
}