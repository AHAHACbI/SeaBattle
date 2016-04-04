/**
 * Created by Серёжа on 02.04.2016.
 */
public class Field {
    final int SIZE = 10;
    char[] cells = new char[SIZE];
    Ships ship;

    void init() {
        for (int i = 0; i < cells.length; i++) {
            cells[i] = '.';
        }
    }

    void setShip(Ships ship) {
        this.ship = ship;
        cells[ship.position] = 'X';

    }
    void doShoot(int shoot) {
        switch (cells[shoot]) {
            case '.':
                System.out.println("Промах");
                cells[shoot] = '*';
                break;
            case 'X':
                System.out.println("Попал");
                cells[shoot] = 'Y';
                System.out.println(cells);
                break;
            case '*':
                System.out.println("Уже было");
                break;
            default:
                System.out.println("Нет такого числа");
                break;
        }
    }
    void show() {
        System.out.println(cells);
    }
    boolean isNotGameOver() {
        return cells[ship.position] == 'X';
    }
}