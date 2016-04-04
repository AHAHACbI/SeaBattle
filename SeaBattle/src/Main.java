/**
 * Created by Серёжа on 02.04.2016.
 */
public class Main {
    public static void main(String[] args) {
        Field field = new Field();
        Player player = new Player();
        Ships ship = new Ships(4);

        field.init();
        field.setShip(ship);

        System.out.println("Game start");

        do {
            field.show();
            int shoot = player.getShot();
            field.doShoot(shoot);
        } while (field.isNotGameOver());
    }
}
