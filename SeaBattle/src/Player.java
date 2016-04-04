import java.util.Scanner;

/**
 * Created by Серёжа on 02.04.2016.
 */
public class Player {
    int getShot() {
        System.out.println("Куда шмальнуть?");
        Scanner scanner = new Scanner(System.in);
        String s;
        s = scanner.nextLine();
        System.out.printf("Вы ввели: %s\n", s);
        int shoot = Integer.parseInt(s);
        return shoot;
    }
}
